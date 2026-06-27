class Solution {
    public int dominantIndex(int[] nums) {

        int max = -1;
        int index = -1;

        // Find largest element
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        int secondMax = -1;

        // Find second largest
        for (int i = 0; i < nums.length; i++) {

            if (i == index)
                continue;

            if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        if (max >= 2 * secondMax)
            return index;

        return -1;
    }
}