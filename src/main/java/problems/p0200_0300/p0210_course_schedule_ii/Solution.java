package problems.p0200_0300.p0210_course_schedule_ii;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    private static int WHITE = 0;
    private static int GRAY = 1;
    private static int BLACK = 2;

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, Integer> color = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();
        Deque<Integer> topologicalOrder = new ArrayDeque<>();

        // graph creation & init colors
        for (int i = 0; i < numCourses; i++) {
            graph.put(i, new ArrayList<>());
            color.put(i, WHITE);
        }

        // fulfillment graph
        for (int[] cur : prerequisites) {
            graph.get(cur[1]).add(cur[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (color.get(i) == WHITE && hasCycle(i, graph, color, topologicalOrder)) {
                return new int[] {};
            }
        }

        return topologicalOrder.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean hasCycle(int node, Map<Integer, List<Integer>> graph,
                             Map<Integer, Integer> color, Deque<Integer> topologicalOrder) {
        if (color.get(node) == GRAY) {
            return true;
        }
        if (color.get(node) == BLACK) {
            return false;
        }
        color.put(node, GRAY);

        for (int neighbor : graph.get(node)) {
            if (hasCycle(neighbor, graph, color, topologicalOrder)) {
                return true;
            }
        }
        color.put(node, BLACK);
        topologicalOrder.addFirst(node);
        return false;
    }

}
