package problems.p0200_0300.p0274_h_index;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int[] count = new int[n + 1];
        for (int citiation : citations) {
            if (citiation >= n) {
                count[n]++;
            } else {
                count[citiation]++;
            }
        }

        int pos = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < count[i]; j++) {
                citations[pos++] = i;
            }
        }

        int hIndex = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (citations[i] < hIndex) {
                return hIndex - 1;
            }
            hIndex++;
        }

        return n;
    }
}
