package problems.p0700_0800.p0703_kth_largest_element_in_a_stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLargestTest {

    @Test
    void test1() {
        KthLargest kthLargest = new KthLargest(3, new int[] {4, 5, 8, 2});
        assertEquals(4, kthLargest.add(3));   // return 4
        assertEquals(5, kthLargest.add(5));   // return 5
        assertEquals(5, kthLargest.add(10));  // return 5
        assertEquals(8, kthLargest.add(9));   // return 8
        assertEquals(8, kthLargest.add(4));   // return 8
    }
}