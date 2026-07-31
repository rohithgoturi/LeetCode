/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, new ArrayList<>());
        return ans;
    }

    private void dfs(TreeNode root, int target, List<Integer> path) {
        if (root == null)
            return;

        path.add(root.val);

        // Leaf node
        if (root.left == null && root.right == null) {
            if (target == root.val)
                ans.add(new ArrayList<>(path));
        } else {
            dfs(root.left, target - root.val, path);
            dfs(root.right, target - root.val, path);
        }

        // Backtracking
        path.remove(path.size() - 1);
    }
}