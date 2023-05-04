package problems.p0600_0700.p0649_dota2_senate;

import java.util.ArrayDeque;
import java.util.Queue;

class Solution {

    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> qR = new ArrayDeque<>();
        Queue<Integer> qD = new ArrayDeque<>();

        for (int i = 0; i < senate.length(); ++i) {
            if (senate.charAt(i) == 'R') {
                qR.add(i);
            } else {
                qD.add(i);
            }
        }

        while (!qR.isEmpty() && !qD.isEmpty()) {
            final int indexR = qR.poll();
            final int indexD = qD.poll();
            if (indexR < indexD) {
                qR.add(indexR + n);
            } else {
                qD.add(indexD + n);
            }
        }

        return qR.isEmpty() ? "Dire" : "Radiant";
    }
}
