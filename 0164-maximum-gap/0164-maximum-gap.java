class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return 0;
        int max=Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1]> max){
                max=nums[i]-nums[i-1];
            }
        }
        return max;
    }
}