package problems.p0300_0400.p0332_reconstruct_itinerary;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {

        LinkedList<String> ans = new LinkedList<>();
        Map<String, Queue<String>> graph = new HashMap<>(); // directed graph

        for(final List<String> itinerary: tickets){
            graph.computeIfAbsent(itinerary.get(0), k -> new PriorityQueue<>())
                .offer(itinerary.get(1));
        }

        dfs(graph, "JFK", ans);
        return ans;
    }

    private void dfs(Map<String, Queue<String>> graph, final  String itinerary, Deque<String> ans) {
        final Queue<String> arrivals = graph.get(itinerary);
        while (arrivals != null && !arrivals.isEmpty())
            dfs(graph, arrivals.poll(), ans);
        ans.addFirst(itinerary);
    }
	
	/*
	DFS Path: JFK -> MUC -> LHR -> SFO -> SJC
	Final Itinerary: [SJC]

	DFS Path: JFK -> MUC -> LHR -> SFO
	Final Itinerary: [SFO, SJC]

	DFS Path: JFK -> MUC -> LHR
	Final Itinerary: [LHR, SFO, SJC]

	DFS Path: JFK -> MUC
	Final Itinerary: [MUC, LHR, SFO, SJC]

	DFS Path: JFK
	Final Itinerary: [JFK, MUC, LHR, SFO, SJC]
	*/
}
