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

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        return build(0, n - 1, 0, n - 1, inorder, postorder);
    }

    public TreeNode build(int inLow, int inHigh,int postLow, int postHigh, int[] inorder, int[] postorder) {

        if (inLow > inHigh || postLow > postHigh)
            return null;

        int val = postorder[postHigh];
        TreeNode root = new TreeNode(val);

        int idx = 0;
        for (int i = inLow; i <= inHigh; i++) {
            if (inorder[i] == val) {
                idx = i;
                break;
            }
        }

        int leftSize = idx - inLow;

        root.left = build(inLow, idx - 1,postLow, postLow + leftSize - 1, inorder, postorder);

        root.right = build(idx + 1, inHigh, postLow + leftSize, postHigh - 1, inorder, postorder);

        return root;
    }
}