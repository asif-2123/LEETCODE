/* Intuition
<!-- First checking where the first value meets of both the node of subtree and root of tree,
then traversing both the tree, if anyhow they any of don't get null at same node 
or any nodes have different values. -->

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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot))
                return true;
        }
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
    public boolean isIdentical(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        else if(root==null || subRoot==null || root.val!=subRoot.val) return false;
        if (!isIdentical(root.left,subRoot.left) || !isIdentical(root.right,subRoot.right)) return false;
        return true;
    }
}