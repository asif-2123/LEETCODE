/* Intuition
<!-- First denoted the two variables prev which will point to previous node,
and minDiff which will return the minimum difference between the nodes.
so first we traversed the Binary Search Tree in Inoder traversal.
As we traverse we are checking the minDiff and storing it and at last return it. -->

# Approach
<!-- Recursively inorder traversal.-->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) h-height of the tree -->

# Code
```java [/
*/

// Definition for a binary tree node. public class TreeNode {

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

// This is the answer ->

class Solution {
    TreeNode prev=null; int minDiff=Integer.MAX_VALUE;
    public int minDiffInBST(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    public void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=null)
            minDiff=Math.min(minDiff,root.val-prev.val);
        prev=root;
        inorder(root.right);
    }
}