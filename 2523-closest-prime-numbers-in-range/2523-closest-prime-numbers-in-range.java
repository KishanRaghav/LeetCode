class Solution {
    public int[] closestPrimes(int left, int right) {

        boolean[] isPrime = new boolean[right + 1];

        Arrays.fill(isPrime, true);

        if (right >= 0) isPrime[0] = false;
        if (right >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= right; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        int[] ans = {-1, -1};

        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                if (prev != -1 && i - prev < minDiff) {
                    minDiff = i - prev;
                    ans[0] = prev;
                    ans[1] = i;
                }
                prev = i;
            }
        }

        return ans;
    }
}