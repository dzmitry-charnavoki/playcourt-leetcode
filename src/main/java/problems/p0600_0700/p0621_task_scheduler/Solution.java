package problems.p0600_0700.p0621_task_scheduler;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] frequencies = new int[26];
        int maxFrequency = 0;
        for (char c : tasks) {
            frequencies[c - 'A']++;
            maxFrequency = Math.max(maxFrequency, frequencies[c - 'A']);
        }
        int amountMax = 0;
        for (int frequency : frequencies) {
            if (frequency == maxFrequency) {
                amountMax++;
            }
        }
        return Math.max(tasks.length, (maxFrequency - 1) * (n + 1) + amountMax);
    }
}
