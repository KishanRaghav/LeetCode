class Solution {
    public int searchInsert(int[] nums, int target) {
        if(target < nums[0]){
            return 0;
        }
        if(target > nums[nums.length - 1]){
            return nums.length;
        }
        int st=0, end=nums.length-1;
        while(st<=end){
            int mid=st+(end-st);
            if(target==nums[mid]){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return st;
    
    }
}