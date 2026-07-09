class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int st=0, end=n-1;
        int first=-1;
        int last=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target) {first=mid;
            end=mid-1;
            }
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        
        st=0; end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                last=mid;
                st=mid+1;
            } 
                
            else if(nums[mid]<target){
                st=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        int ans[] = new int[2];
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
}