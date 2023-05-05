package problems.p0600_0700.p0649_dota2_senate;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> queueRadiant = new ArrayDeque<>();
        Queue<Integer> queueDire = new ArrayDeque<>();

        for (int i = 0; i < senate.length(); ++i) {
            if (senate.charAt(i) == 'R') {
                queueRadiant.add(i);
            } else {
                queueDire.add(i);
            }
        }

        while (!queueRadiant.isEmpty() && !queueDire.isEmpty()) {
            final int indexR = queueRadiant.poll();
            final int indexD = queueDire.poll();
            if (indexR < indexD) {
                queueRadiant.add(indexR + n);
            } else {
                queueDire.add(indexD + n);
            }
        }

        return queueRadiant.isEmpty() ? "Dire" : "Radiant";
    }
}
