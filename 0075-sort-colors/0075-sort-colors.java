class Solution {
    public void sortColors(int[] nums) {
       // Arrays.sort(nums);

       //Bubble sort
        int n=nums.length;
        //  for (int i = 0; i < n - 1; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         if (nums[j] > nums[j + 1]) {
        //             int temp = nums[j];
        //             nums[j] = nums[j + 1];
        //             nums[j + 1] = temp;
        //         }
        //     }
        // }

        //selection sort
        //   for (int i = 0; i < n - 1; i++) {
        //     int minIndex = i;
        //     for (int j = i + 1; j < n; j++) {
        //         if (nums[j] < nums[minIndex]) {
        //             minIndex = j;
        //         }
        //     }
        //     int temp = nums[i];
        //     nums[i] = nums[minIndex];
        //     nums[minIndex] = temp;
        // }

        // insertion sort 
      
        for (int i = 1; i < n; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}