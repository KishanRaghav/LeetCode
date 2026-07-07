class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        int d=0;
        int a =1;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
            x+=rem;
            d+=rem*a;
            a*=10;
        }
        n=n/10;

        }
        return d*x;
    }
}