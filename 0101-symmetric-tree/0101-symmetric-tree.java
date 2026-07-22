class Solution {
    public boolean isSymmetric(TreeNode root) {

        if (root == null) {
            return true;
        }

        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {

        // Both empty
        if (left == null && right == null) {
            return true;
        }

        // One empty
        if (left == null || right == null) {
            return false;
        }

        // Values should match
        if (left.val != right.val) {
            return false;
        }

        // Mirror condition
        return check(left.left, right.right) &&
               check(left.right, right.left);
    }
}