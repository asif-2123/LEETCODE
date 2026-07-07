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
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    public int height(TreeNode root){
        if(root==null) return 0;
        int lh=height(root.left);
        int rh=height(root.right);
        diameter=Math.max(diameter,lh+rh);
        return Math.max(lh,rh)+1;
    }
}