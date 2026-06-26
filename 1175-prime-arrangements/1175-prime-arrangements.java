class Solution {
    static final int MOD = 1_000_000_007;

    public int numPrimeArrangements(int n) {
        int primeCount = countPrimes(n);

        long factPrimes = factorial(primeCount);
        long factNonPrimes = factorial(n - primeCount);

        return (int)((factPrimes * factNonPrimes) % MOD);
    }

    private int countPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) prime[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) count++;
        }
        return count;
    }

    private long factorial(int x) {
        long res = 1;
        for (int i = 2; i <= x; i++) {
            res = (res * i) % MOD;
        }
        return res;
    }
}