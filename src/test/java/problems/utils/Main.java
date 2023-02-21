package problems.utils;

public class Main {

    public static void main(String[] args) {

        assertEquals(2, secondHighest("dfa12321afd"));
        assertEquals(-1, secondHighest("abc1111"));
        assertEquals(0, secondHighest("ck077"));
        assertEquals(4, secondHighest("sjhtz8344"));
    }

    static void assertEquals(int exp, int act) {
        if (exp != act) {
            throw new IllegalStateException(exp + " != " + act);
        }
    }

    // Character.isDigit(c)
    // int d = Character.getNumericValue(c)
    public static int secondHighest(String s) {


        return -1;
    }

}
