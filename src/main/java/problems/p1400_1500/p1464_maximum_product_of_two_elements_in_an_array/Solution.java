package problems.p1400_1500.p1464_maximum_product_of_two_elements_in_an_array;

class Solution {

    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i >= first) {
                second = first;
                first = i;
            } else if (i > second) {
                second = i;
            }
        }
        return (first - 1) * (second - 1);
    }
}
