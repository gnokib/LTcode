class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
	int val = x;
	left = null;
	right = null;
    }
}

public class Solution {
    public boolean isSymmetric(TreeNode root) {
	if (root == null) {
	    return true;
	}
	return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
	if(left == null && right == null) {
	    return true;
	}
	if(left.val != right.val) {
	    return false;
	}	
	return helper(left.left, right.right) && helper(left.right, right.left);	
    }
}
