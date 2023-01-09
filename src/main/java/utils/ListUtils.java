package utils;

import java.util.ArrayList;
import java.util.List;

public final class ListUtils {
    private ListUtils() {
    }

    public static List<List<Integer>> getLists(int[][] expected) {
        List<List<Integer>> expectedList = new ArrayList<>();
        for (int[] value : expected) {
            List<Integer> expectedItem = new ArrayList<>();
            expectedList.add(expectedItem);
            for (int item : value) {
                expectedItem.add(item);
            }
        }
        return expectedList;
    }

    //    public static List<List<String>> getLists(String[][] expected) {
    //        List<List<String>> expectedList = new ArrayList<>();
    //        for (String[] value : expected) {
    //            List<String> expectedItem = new ArrayList<>();
    //            expectedList.add(expectedItem);
    //            expectedItem.addAll(Arrays.asList(value));
    //        }
    //        return expectedList;
    //    }
}
