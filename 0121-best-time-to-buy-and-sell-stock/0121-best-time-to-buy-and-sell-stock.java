class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int maxSoFar=prices[0];
        for(int i=0;i<prices.length;i++){
            maxSoFar=Math.min(maxSoFar, prices[i]);
            int profit=prices[i]-maxSoFar;
            maxProfit=Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}