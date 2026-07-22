package Binary_Search_Trree;

/*
# Approach
<!-- Creating a min and max.
If the min of the right subtree is less than the root then its not valid,
and if the max of the left subtree is more than the root then also not valid
and if both not happens we simply return true after traversing both sides. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) -->

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
    public boolean isValidBST(TreeNode root) {
        return isvalidate(root,null,null);
    }
    public boolean isvalidate(TreeNode root,TreeNode min,TreeNode max){
        if(root==null) return true;
        if(min!=null && root.val<=min.val) return false;
        if(max!=null && root.val>=max.val) return false;
        
        return isvalidate(root.left,min,root) && isvalidate(root.right,root,max);
    }
}