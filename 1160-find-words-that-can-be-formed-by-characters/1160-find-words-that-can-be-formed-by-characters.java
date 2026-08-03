class Solution {
    public int countCharacters(String[] words, String chars) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int ans = 0;

        for (String word : words) {

            HashMap<Character, Integer> temp = new HashMap<>(map);
            boolean possible = true;

            for (char c : word.toCharArray()) {
                if (!temp.containsKey(c) || temp.get(c) == 0) {
                    possible = false;
                    break;
                }
                temp.put(c, temp.get(c) - 1);
            }

            if (possible) {
                ans += word.length();
            }
        }

        return ans;
    }
}