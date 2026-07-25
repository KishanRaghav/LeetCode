class Solution {
    public int maxProduct(int n) {
        int[] arr = String.valueOf(n).chars().map(c -> c - '0').toArray();
        Arrays.sort(arr);
        int ans=1;
        for(int i=arr.length-1;i>arr.length-3;i--){
            ans*=arr[i];
        }
        return ans;
    }
}