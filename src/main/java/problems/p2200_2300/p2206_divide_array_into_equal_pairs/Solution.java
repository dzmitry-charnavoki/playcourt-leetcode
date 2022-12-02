package problems.p2200_2300.p2206_divide_array_into_equal_pairs;

class Solution {

    // #Easy #Array #Hash_Table @Set #Counting

    public boolean divideArray(int[] nums) {
        // if nums length is odd, no sense to continue since we are not able
        // to create pairs from array
        if (nums.length % 2 != 0) {
            return false;
        }
        // instead of Set use list with number as index to count them
        int[] frequency = new int[501]; // constrain
        for (int i : nums) { // counting
            ++frequency[i];
        }
        for (int q : frequency) {
            if (q % 2 != 0) {
                return false;
            }
        }
        return true;
    }

}
