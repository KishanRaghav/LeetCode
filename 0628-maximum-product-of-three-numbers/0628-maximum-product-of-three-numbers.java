// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);
//         int max=Integer.MIN_VALUE;
//         int ans=1;
//         int ans1=1;
//         int res=0;
//         for(int i=0;i<2;i++){
//             ans*=nums[i];
//         }
       
//         for(int i=nums.length-1;i>nums.length-4;i--){
//             ans1*=nums[i];
//         }
//         if(ans*nums[nums.length-1] > ans1){
//             res=ans*nums[nums.length-1];
//         }
//         else res=ans1;
        
//         return res;
//     }
// }


// class Solution {
//     public int maximumProduct(int[] nums) {
//         Arrays.sort(nums);

//         int n = nums.length;

//         return Math.max(
//             nums[n - 1] * nums[n - 2] * nums[n - 3],
//             nums[0] * nums[1] * nums[n - 1]
//         );
//     }
// }

class Solution {
    public int maximumProduct(int[] nums) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : nums) {

            // Update largest three
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }

            // Update smallest two
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}