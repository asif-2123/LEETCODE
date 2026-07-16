/*
# Approach
<!-- Recursively flatten the left and right subtrees.
Save the original right subtree in a temporary variable.
Move the flattened left subtree to the right.
Traverse to the end of this new right chain and attach the saved right subtree.
This ensures preorder order is maintained. -->


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
    public void flatten(TreeNode root) {
        if(root==null) return;

        flatten(root.left);
        flatten(root.right);

        TreeNode temp=root.right;
        root.right=root.left;
        root.left=null;

        TreeNode curr=root;
        while(curr.right !=null) curr=curr.right;
        curr.right=temp;
    }
}