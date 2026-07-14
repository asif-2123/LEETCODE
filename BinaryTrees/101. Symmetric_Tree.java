/* 
# Approach
<!-- Traversing two sides of nodes as t1 and t2 by going at the end of the node till reaching null
The recursively checks if the values of their nodes are same then returns true rather false. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) h-height of the tree ->

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

// This is the answer -->

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        return mirror(root.left,root.right);
    }
    public boolean mirror(TreeNode t1,TreeNode t2){
        if(t1==null && t2==null) return true;
        if(t1==null || t2==null) return false;
        return (t1.val==t2.val) 
            && mirror(t1.left,t2.right)
            && mirror(t1.right,t2.left);
    }
}
