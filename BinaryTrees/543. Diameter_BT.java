/* 
# Approach
<!--Traversing to the extreme right and extreme left,
and at every node calculate diameter and store only if it is more between sum of 
left height and right height. -->

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
