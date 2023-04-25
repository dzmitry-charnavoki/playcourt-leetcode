package problems.p2300_2400.p2336_smallest_number_in_infinite_set;

class SmallestInfiniteSet {
    private final int amountPositiveNumbers = 1000; // constrain 1-1000
    private final int flagOfAbsent = 0;
    private final int[] hset = new int[amountPositiveNumbers + 1];
    private int cursor = 1;

    public SmallestInfiniteSet() {
        for (int i = 1; i <= amountPositiveNumbers; i++) {
            hset[i] = i;
        }
    }

    public int popSmallest() {
        int t = hset[cursor];
        hset[cursor] = flagOfAbsent;
        while (cursor < 1000 && hset[cursor] == flagOfAbsent) {
            cursor++;
        }
        return t;
    }

    public void addBack(int num) {
        if (hset[num] == flagOfAbsent) {
            hset[num] = num;
            if (num < cursor) {
                cursor = num;
            }
        }
    }

}
