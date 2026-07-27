class Solution {

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {

        for (int i = 0; i < postorder.length; i++) {
            map.put(postorder[i], i);
        }

        return build(0, preorder.length - 1,
                0, postorder.length - 1,
                preorder, postorder);
    }

    TreeNode build(int preLow, int preHigh,
            int postLow, int postHigh,
            int[] preorder, int[] postorder) {

        if (preLow > preHigh)
            return null;

        TreeNode root = new TreeNode(preorder[preLow]);
        if (preLow == preHigh) return root;

        int leftRoot = preorder[preLow + 1];
        int idx = map.get(leftRoot);
        int leftSize = idx - postLow + 1;

        root.left = build(preLow + 1, preLow + leftSize, postLow, idx, preorder, postorder);

        root.right = build(preLow + leftSize + 1, preHigh, idx + 1, postHigh - 1, preorder, postorder);

        return root;
    }
}