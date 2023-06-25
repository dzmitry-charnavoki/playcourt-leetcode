package problems.p0200_0300.p0207_course_schedule;

import java.util.ArrayList;
import java.util.List;

class Solution {

    public static final int VISITED = 1;
    public static final int VISITING = 2;

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        int[] visited = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (isCyclic(adj, visited, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCyclic(List<List<Integer>> adj, int[] visited, int curr) {
        if (visited[curr] == 2) {
            return true;
        }
        if (visited[curr] == 1) {
            return false;
        }

        visited[curr] = VISITING;
        for (int i = 0; i < adj.get(curr).size(); i++) {
            if (isCyclic(adj, visited, adj.get(curr).get(i))) {
                return true;
            }
        }
        visited[curr] = VISITED;
        return false;
    }

}
