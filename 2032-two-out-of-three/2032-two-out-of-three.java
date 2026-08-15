class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2) set2.add(n);
        for (int n : nums3) set3.add(n);

        Set<Integer> all = new HashSet<>();
        all.addAll(set1);
        all.addAll(set2);
        all.addAll(set3);

        List<Integer> ans = new ArrayList<>();

        for (int n : all) {
            int count = 0;

            if (set1.contains(n)) count++;
            if (set2.contains(n)) count++;
            if (set3.contains(n)) count++;

            if (count >= 2) {
                ans.add(n);
            }
        }

        return ans;
    }
}