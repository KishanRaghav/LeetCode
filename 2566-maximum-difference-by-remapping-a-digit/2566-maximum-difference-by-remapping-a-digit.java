class Solution {
    public int minMaxDifference(int num) {

        String s = String.valueOf(num);

        // Maximum
        char ch = ' ';
        for (char c : s.toCharArray()) {
            if (c != '9') {
                ch = c;
                break;
            }
        }

        String maxStr = s;
        if (ch != ' ') {
            maxStr = s.replace(ch, '9');
        }

        // Minimum
        char first = s.charAt(0);
        String minStr = s.replace(first, '0');

        return Integer.parseInt(maxStr) - Integer.parseInt(minStr);
    }
}