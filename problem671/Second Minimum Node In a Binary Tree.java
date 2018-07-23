/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null||(root.left==null&&root.right==null)) return -1;
        int l,r;
        l=root.left.val;
        r=root.right.val;
        if(l==root.val) l=findSecondMinimumValue(root.left);
        if(r==root.val) r=findSecondMinimumValue(root.right);
        if(l!=-1&&r!=-1) return Math.min(l,r);
        if(l==-1) return r;
        return l;
    }
}
