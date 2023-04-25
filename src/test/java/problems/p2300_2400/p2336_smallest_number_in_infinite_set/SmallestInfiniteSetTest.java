package problems.p2300_2400.p2336_smallest_number_in_infinite_set;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SmallestInfiniteSetTest {

    @Test
    public void behavior1() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        // 2 is already in the set, so no change is made.
        smallestInfiniteSet.addBack(2);
        // return 1, since 1 is the smallest number, and remove it from the set.
        assertEquals(1, smallestInfiniteSet.popSmallest());
        // return 2, and remove it from the set.
        assertEquals(2, smallestInfiniteSet.popSmallest());
        // return 3, and remove it from the set.
        assertEquals(3, smallestInfiniteSet.popSmallest());
        // 1 is added back to the set.
        smallestInfiniteSet.addBack(1);
        // return 1, since 1 was added back to the set and
        // is the smallest number, and remove it from the set.
        assertEquals(1, smallestInfiniteSet.popSmallest());
        // return 4, and remove it from the set.
        assertEquals(4, smallestInfiniteSet.popSmallest());
        // return 5, and remove it from the set.
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }

    @Test
    public void behavior2() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        for (int i = 1; i < 1000; i++) {
            assertEquals(i, smallestInfiniteSet.popSmallest());
        }
        smallestInfiniteSet.addBack(5);
        assertEquals(5, smallestInfiniteSet.popSmallest());
    }

    @Test
    public void behavior3() {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        assertEquals(1, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(1);
        assertEquals(1, smallestInfiniteSet.popSmallest());
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
        smallestInfiniteSet.addBack(2);
        smallestInfiniteSet.addBack(3);
        assertEquals(2, smallestInfiniteSet.popSmallest());
        assertEquals(3, smallestInfiniteSet.popSmallest());
    }

}