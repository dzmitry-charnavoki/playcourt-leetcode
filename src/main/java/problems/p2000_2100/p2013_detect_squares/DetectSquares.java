package problems.p2000_2100.p2013_detect_squares;

import java.util.HashMap;
import java.util.Map;

class DetectSquares {

    private Map<Integer, Integer> pointCount = new HashMap<>();

    public void add(int[] point) {
        pointCount.merge(getHash(point[0], point[1]), 1, Integer::sum);
    }

    public int count(int[] point) {
        final int x1 = point[0];
        final int y1 = point[1];
        int ans = 0;

        for (final int hash : pointCount.keySet()) {
            final int count = pointCount.get(hash);
            final int x3 = hash >> 10;
            final int y3 = hash & 1023;
            if (x1 != x3 && Math.abs(x1 - x3) == Math.abs(y1 - y3)) {
                final int p = getHash(x1, y3);
                final int q = getHash(x3, y1);
                if (pointCount.containsKey(p) && pointCount.containsKey(q)) {
                    ans += count * pointCount.get(p) * pointCount.get(q);
                }
            }
        }
        return ans;
    }


    // 0 <= x, y <= 1000
    /* 10 бит достаточно для представления каждого числа в этом диапазоне
        (2^10 = 1024 возможных значений).
       При сдвиге i на 10 бит влево, мы резервируем 10 правых битов для j,
       что позволяет нам уникально представить каждую пару (i, j) как одно 20-битное число
     */

    private int getHash(int i, int j) {
        return i << 10 | j;
    }

}
