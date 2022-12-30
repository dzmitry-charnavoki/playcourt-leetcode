package problems.p0000_0100.p0053_maximum_subarray;

class Solution {

    // -2,1,-3,4,-1,2,1,-5,4
    // https://en.wikipedia.org/wiki/Maximum_subarray_problem
    // https://codeforces.com/blog/entry/13713?f0a28=1
    // https://math4everyone.info/blog/2020/12/29/poisk-maksimalnoj-summy-posledovatelnyh-elementov-massiva-algoritm-kadane-dinamicheskoe-programmirovanie/
    public int maxSubArray(int[] nums) {
        int localMax = 0;
        int globalMax = Integer.MIN_VALUE;

        for (int num : nums) {
            localMax = Math.max(num, localMax + num);
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
