class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count=0;
        int sum=0;
        for(int i=0;i<costs.length;i++){
            if (sum + costs[i] > coins) break;
            sum+=costs[i];
            count++;
        
        }
        return count;
    }
}