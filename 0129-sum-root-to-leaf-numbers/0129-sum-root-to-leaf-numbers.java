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
    public int sumNumbers(TreeNode root) {
        return search(root, 0);
}

public int search(TreeNode root, int preSum) {
	if (root == null) {
	return 0;
}
int sum = preSum * 10 + root.val;
if (root.left == null && root.right == null) {
	return sum;
}
int left = search(root.left, sum);
int right = search (root.right, sum);
return left + right;
}

    }
