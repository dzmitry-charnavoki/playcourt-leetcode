package problems;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.opentest4j.AssertionFailedError;

public final class AssertionOfList {

    private AssertionOfList() {
    }

    public static void assertListEquals(List<List<Integer>> expected,
                                        List<List<Integer>> actual) {
        //
        if (expected == null && actual == null) {
            return;
        }
        if (expected == null || actual == null) {
            throw new AssertionFailedError("expected and actual must not be null");
        }
        for (int i = 0; i < expected.size(); i++) {
            assertIterableEquals(expected.get(i), actual.get(i));
            //            for (int j = 0; j < expected.get(i).size(); j++) {
            //                assertEquals(expected.get(i).get(j), actual.get(i).get(j));
            //            }
        }
        for (int i = 0; i < actual.size(); i++) {
            assertIterableEquals(expected.get(i), actual.get(i));
        }
    }

}
