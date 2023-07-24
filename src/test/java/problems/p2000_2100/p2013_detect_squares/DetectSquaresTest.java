package problems.p2000_2100.p2013_detect_squares;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DetectSquaresTest {

    @Test
    void flow1() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        detectSquares.add(new int[] {11, 2});
        detectSquares.add(new int[] {3, 2});
        assertEquals(1, detectSquares.count(new int[] {11, 10}));
        assertEquals(0, detectSquares.count(new int[] {14, 8}));
        detectSquares.add(new int[] {11, 2});
        assertEquals(2, detectSquares.count(new int[] {11, 10}));

    }

    @Test
    void flow2() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        detectSquares.add(new int[] {11, 2});
        detectSquares.add(new int[] {3, 2});
        detectSquares.add(new int[] {11, 10});
        assertEquals(1, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {3, 10});
        assertEquals(2, detectSquares.count(new int[] {11, 10}));
    }

    @Test
    void flow3() {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[] {3, 10});
        detectSquares.add(new int[] {11, 2});
        assertEquals(0, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {3, 2});
        assertEquals(1, detectSquares.count(new int[] {11, 10}));
        detectSquares.add(new int[] {5, 5});
        assertEquals(0, detectSquares.count(new int[] {5, 5}));
        detectSquares.add(new int[] {1, 1});
        assertEquals(0, detectSquares.count(new int[] {1, 1}));
    }

}