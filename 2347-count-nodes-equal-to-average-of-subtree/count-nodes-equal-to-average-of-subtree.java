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
    private int matchingNodesCount = 0;

    public int averageOfSubtree(TreeNode root) {
        postOrderTraversal(root);
        return matchingNodesCount;
    }

    private int[] postOrderTraversal(TreeNode node) {
        if (node == null) {
            return new int[]{0, 0};
        }

        int[] leftSubtree = postOrderTraversal(node.left);
        int[] rightSubtree = postOrderTraversal(node.right);

        int currentSum = node.val + leftSubtree[0] + rightSubtree[0];
        int currentCount = 1 + leftSubtree[1] + rightSubtree[1];

        if (currentSum / currentCount == node.val) {
            matchingNodesCount++;
        }

        return new int[]{currentSum, currentCount};
    }
}