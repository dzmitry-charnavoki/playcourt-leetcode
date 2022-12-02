package problems.p0700_0800.p0796_rotate_string;

/**
 *
 */
class Solution {

    // bbbacddceeb, ceebbbbacdd, dota)))
    // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/branch.html
    private static boolean isSameAtPosition(String s, String goal, int sp) {
        for (int i = 0; i < s.length(); i++) {
            int cg = (sp + i) % s.length(); // cursor for g
            if (s.charAt(i) != goal.charAt(cg)) {
                return false;
            }
        }
        return true;
    }

    /**
     * solution for https://leetcode.com/problems/rotate-string/
     */
    public boolean rotateString(String s, String goal) {
        if (s.length() == 0 || s.length() != goal.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == goal.charAt(i) && isSameAtPosition(s, goal, i)) {
                return true;
            }
        }
        return false;
    }

    //https://leetcode.com/problems/rotate-string/solutions/127428/rotate-string/
    public boolean rotateStringDoubleA(String s, String goal) {
        String doubleS = s + s;
        return s.length() == goal.length() && doubleS.contains(goal);
    }
}
