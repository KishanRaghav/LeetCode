class Solution {
    public int maximumLengthSubstring(String s) {
        int left = 0;
        int maxLen = 0;

        int[] freq = new int[26];

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'a']++;

            // If a character occurs more than 2 times
            while (freq[s.charAt(right) - 'a'] > 2) {
                freq[s.charAt(left) - 'a']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}