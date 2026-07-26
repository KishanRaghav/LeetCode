class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int ans=1;
        int ans1=1;
        int res=0;
        for(int i=0;i<2;i++){
            ans*=nums[i];
        }
       
        for(int i=nums.length-1;i>nums.length-4;i--){
            ans1*=nums[i];
        }
        if(ans*nums[nums.length-1] > ans1){
            res=ans*nums[nums.length-1];
        }
        else res=ans1;
        
        return res;
    }
}