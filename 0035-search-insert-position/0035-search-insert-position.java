class Solution {
    public int searchInsert(int[] nums, int target) {
        int st=0, end=nums.length-1;
        int index=nums.length;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
                index=mid;
            }
            else{
                st=mid+1;
                index=st;
            }

        }
        return index;
    }
}