package problems.p0100_0200.p0146_lru_cache;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class LRUCache {
    private int capacity;
    private Map<Integer, Node> cache = new HashMap<>();

    private Set<Node> order = new LinkedHashSet<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }
        Node n = cache.get(key);
        order.remove(n);
        order.add(n);
        return n.value;
    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            cache.get(key).value = value;
            get(key);
            return;
        }
        if (order.size() == capacity) {
            Node last = order.iterator().next();
            // it's not efficient and better to create or two nodes or custom implementation of Set
            order.remove(last);
            cache.remove(last.key);
        }
        Node newNode = new Node(key, value);
        cache.put(key, newNode);
        order.add(newNode);
    }

    static class Node {
        public int key;
        public int value;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
