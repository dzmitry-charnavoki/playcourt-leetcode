package problems.p0200_0300.p0295_find_median_from_data_stream;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MedianFinderTest {

    @Test
    void flow1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);    // arr = [1]
        medianFinder.addNum(2);    // arr = [1, 2]
        assertEquals(1.5, medianFinder.findMedian(), 0.1); // return 1.5 (i.e., (1 + 2) / 2)
        medianFinder.addNum(3);    // arr[1, 2, 3]
        assertEquals(2.0, medianFinder.findMedian(), 0.1); // return 2.0

        medianFinder.addNum(1);
        medianFinder.addNum(1);
        assertEquals(1.0, medianFinder.findMedian(), 0.1);
    }

}