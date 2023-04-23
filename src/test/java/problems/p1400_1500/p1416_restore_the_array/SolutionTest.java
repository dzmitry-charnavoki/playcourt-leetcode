package problems.p1400_1500.p1416_restore_the_array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import problems.utils.WithQuery;

class SolutionTest {

    @Test
    void numberOfArrays1() {
        assertEquals(1, new Solution().numberOfArrays("1000", 10000));
    }

    @Test
    void numberOfArrays2() {
        assertEquals(0, new Solution().numberOfArrays("1000", 10));
    }

    @Test
    void numberOfArrays3() {
        assertEquals(8, new Solution().numberOfArrays("1317", 2000));
    }

    @Test
    void numberOfArrays4() {
        assertEquals(427125123, new Solution().numberOfArrays(
            "407780786171321121429620765476840275495357129574174233567552131453038760763182952432348422252546559691171161181440370120987634895458140447952079749439961325982629462531738374032416182281868731817661954890417245087359968833257550123324827240537957646002494771036413572415",
            823924906));
    }

}