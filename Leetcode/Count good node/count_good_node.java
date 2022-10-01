class Solution {
    public int goodNodes(TreeNode root) {
        return findGoodNodes(root, Integer.MIN_VALUE);
    }
    
    public int findGoodNodes(TreeNode root, int currMaxVal) {
        if (root == null) {
            return 0;
        }
        
        if (root.val >= currMaxVal) {
            currMaxVal = Math.max(currMaxVal, root.val);
            return 1 + findGoodNodes(root.left, currMaxVal) + findGoodNodes(root.right, currMaxVal);
        } else {
            return 0 + findGoodNodes(root.left, currMaxVal) + findGoodNodes(root.right, currMaxVal);
        }
    }
}