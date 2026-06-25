class Solution {
    public int maxProduct(int[] nums) {
        int maxP=Integer.MIN_VALUE;
        int currP=1;
        int n=nums.length;
        
        for(int i=0; i<n; i++){
            currP=currP * nums[i];
            if(currP > maxP){
                maxP = currP;
            }
            if(nums[i]==0){
                currP=1;
            }
            
            
        }
        currP=1;
        for(int i=n-1; i>=0; i--){
            currP=currP * nums[i];
            if(currP > maxP){
                maxP = currP;
            }
            if(nums[i]==0){
                currP=1;
            }
            
            
        }
         
        return maxP;
    }
}