package problems.p0000_0100.p0093_restore_ip_addresses;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> combinations = new ArrayList<>();
        if (s.length() > 12) {
            return combinations;
        }
        dfs(s, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private void dfs(String s, int pos, List<Integer> path, List<String> combinations) {
        if (path.size() == 4 && pos == s.length()) {
            combinations.add(generateIp(path));
            return;
        }
        if (path.size() > 4 || pos == s.length()) {
            return;
        }
        int n = Math.min(pos + 3, s.length() - 1);
        int total = 0;
        for (int i = pos; i <= n; i++) {
            int digit = s.charAt(i) - '0';
            total = total * 10 + digit;
            if (total <= 255 && (pos == i || s.charAt(pos) != '0')) {
                path.add(total);
                dfs(s, i + 1, path, combinations);
                path.remove(path.size() - 1);
            }
        }
    }

    private String generateIp(List<Integer> ips) {
        return ips.stream()
            .map(String::valueOf)
            .collect(Collectors.joining("."));
    }

}
