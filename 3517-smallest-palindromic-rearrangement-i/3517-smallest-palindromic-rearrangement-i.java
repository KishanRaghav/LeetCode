class Solution {
    public String smallestPalindrome(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder first = new StringBuilder();
        char middle = 0;

        int i = 0;

        while (i < arr.length) {
            int count = 1;

            while (i + count < arr.length && arr[i] == arr[i + count]) {
                count++;
            }

            // Add half of the characters to the first half
            for (int j = 0; j < count / 2; j++) {
                first.append(arr[i]);
            }

            // Store the middle character if frequency is odd
            if (count % 2 == 1) {
                middle = arr[i];
            }

            i += count;
        }

        StringBuilder second = new StringBuilder(first).reverse();

        if (middle != 0) {
            first.append(middle);
        }

        first.append(second);

        return first.toString();
    }
}