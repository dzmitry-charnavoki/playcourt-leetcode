package problems.p0300_0400.p0355_design_twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Twitter {

    private final int limit;
    private int time = 0;
    private Map<Integer, User> users = new HashMap<>();

    public Twitter() {
        limit = 10;
    }

    public Twitter(int limit) {
        this.limit = limit;
    }

    public void postTweet(int userId, int tweetId) {
        users.putIfAbsent(userId, new User(userId));
        users.get(userId).post(tweetId, time++);
    }

    public List<Integer> getNewsFeed(int userId) {
        if (!users.containsKey(userId)) {
            return new ArrayList<>();
        }

        List<Integer> newsFeed = new ArrayList<>();
        Queue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);

        for (final int followeeId : users.get(userId).followeeIds) {
            Tweet tweetHead = users.get(followeeId).tweetHead;
            if (tweetHead != null) {
                maxHeap.offer(tweetHead);
            }
        }

        int count = 0;
        while (!maxHeap.isEmpty() && count++ < limit) {
            Tweet tweet = maxHeap.poll();
            newsFeed.add(tweet.id);
            if (tweet.next != null) {
                maxHeap.offer(tweet.next);
            }
        }

        return newsFeed;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }
        users.putIfAbsent(followerId, new User(followerId));
        users.putIfAbsent(followeeId, new User(followeeId));
        users.get(followerId).follow(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followerId == followeeId) {
            return;
        }
        if (users.containsKey(followerId) && users.containsKey(followeeId)) {
            users.get(followerId).unfollow(followeeId);
        }
    }

    class Tweet {
        public int id;
        public int time;
        public Tweet next = null;

        public Tweet(int id, int time) {
            this.id = id;
            this.time = time;
        }
    }

    class User {
        private int id;
        public Set<Integer> followeeIds = new HashSet<>();
        public Tweet tweetHead = null;

        public User(int id) {
            this.id = id;
            follow(id); // Follow himself
        }

        public void follow(int followeeId) {
            followeeIds.add(followeeId);
        }

        public void unfollow(int followeeId) {
            followeeIds.remove(followeeId);
        }

        public void post(int tweetId, int time) {
            final Tweet oldTweetHead = tweetHead;
            tweetHead = new Tweet(tweetId, time);
            tweetHead.next = oldTweetHead;
        }
    }
}
