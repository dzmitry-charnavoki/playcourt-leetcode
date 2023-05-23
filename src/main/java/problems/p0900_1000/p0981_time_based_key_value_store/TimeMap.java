package problems.p0900_1000.p0981_time_based_key_value_store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TimeMap {

    Map<String, List<TV>> map = new HashMap();

    public TimeMap() {
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new TV(value, timestamp));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        List<TV> values = map.get(key);
        String res = "";
        int l = 0;
        int r = values.size() - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (values.get(m).timestamp <= timestamp) {
                res = values.get(m).value;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return res;
    }

    static class TV {
        String value;
        int timestamp;

        public TV(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}
