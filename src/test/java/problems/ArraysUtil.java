package problems;

import org.junit.jupiter.api.Assertions;

public final class ArraysUtil {

    private ArraysUtil(){
    }

    public static boolean assertIntArrayEquals(int[][] exp, int[][] cur){
        for (int i = 0; i < exp.length; i++) {
            int[] e = exp[i];
            int[] c = cur[i];
            Assertions.assertArrayEquals(e, c);
        }
        return true;
    }

}
