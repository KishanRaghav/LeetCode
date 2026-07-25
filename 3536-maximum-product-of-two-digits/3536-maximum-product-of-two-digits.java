class Solution {
    public int maxProduct(int n) {
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        while(n!=0){
            int last_digit=n%10;
            if(m1<=last_digit){
                m2=m1;

            }
            else if(last_digit<=m1 && last_digit>m2){
                m2=last_digit;
            }
            m1=Math.max(m1,last_digit);
            n=n/10;
        }
        int ans=m1*m2;
        return ans;

    }
}


// class Solution {
//     public int maxProduct(int n) {
//         int[] arr = String.valueOf(n).chars().map(c -> c - '0').toArray();
//         Arrays.sort(arr);
//         int ans=1;
//         for(int i=arr.length-1;i>arr.length-3;i--){
//             ans*=arr[i];
//         }
//         return ans;
//     }
// }