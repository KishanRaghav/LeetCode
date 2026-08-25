class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
    }
        for (int i = k; ; i += k) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
    }
}