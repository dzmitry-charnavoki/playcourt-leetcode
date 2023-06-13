package problems.p0300_0400.p0355_design_twitter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class TwitterTest {

    @Test
    void flow1() {
        Twitter twitter1 = new Twitter();

        twitter1.postTweet(1, 5);
        List<Integer> l1 = twitter1.getNewsFeed(1);
        assertEquals(5, l1.get(0));

        Twitter twitter = new Twitter(2);

        assertEquals(0, twitter.getNewsFeed(13).size());

        twitter.follow(7, 15);
        assertEquals(0, twitter.getNewsFeed(7).size());

        twitter.postTweet(1, 5); // User 1 posts a new tweet (id = 5).
        List<Integer> l = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 1 tweet id -> [5]. return [5]
        assertEquals(5, l.get(0));


        twitter.follow(1, 2);    // User 1 follows user 2.
        twitter.follow(1, 1);
        twitter.postTweet(2, 6); // User 2 posts a new tweet (id = 6).
        l = twitter.getNewsFeed(1);  // User 1's news feed should return a list with 2 tweet ids -> [6, 5]. Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
        assertEquals(6, l.get(0));
//        assertEquals(5, l.get(1));

        twitter.postTweet(1, 7);
        twitter.postTweet(1, 8);
        l = twitter.getNewsFeed(1);
        assertEquals(8, l.get(0));
        assertEquals(7, l.get(1));

        twitter.unfollow(1, 2);  // User 1 unfollows user 2.
        twitter.unfollow(1, 1);
        twitter.unfollow(1, 13);
        twitter.unfollow(13, 1);

//        l = twitter.getNewsFeed(1);
//        assertEquals(5, l.get(0));


    }
}