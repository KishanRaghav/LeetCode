class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        boolean[] allowedChar = new boolean[26];

        // Mark allowed characters
        for (char ch : allowed.toCharArray()) {
            allowedChar[ch - 'a'] = true;
        }

        int ans = 0;

        // Check every word
        for (String word : words) {
            boolean consistent = true;

            for (char ch : word.toCharArray()) {
                if (!allowedChar[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                ans++;
            }
        }

        return ans;
    }
}