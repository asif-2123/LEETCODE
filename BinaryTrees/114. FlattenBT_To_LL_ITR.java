/*
# Approach
<!-- First going to the root's left subtree's extreme right.
Then stores it as the root's right.
Then change the root's left to right as
the previous subtree will join with the root's left which changed into root's right
And the root's left will be null.
Then root goes forward to root's right and make it new root and goes on.
It will do untill the root goes to null. -->


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
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode prev=curr.left;
                while(prev.right!=null) prev=prev.right;
                prev.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
}
