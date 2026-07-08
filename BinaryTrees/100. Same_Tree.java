/* Intuition
<!-- In inorder traversal, we visit nodes in the order:  Left → Root → Right.
So, the idea is simple — start from the root,
 process it first, then recursively traverse the left subtree,
and finally the right subtree. -->

# Approach
<!-- Recursive. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p ==null && q==null) return true;
        if(p==null || q==null) return false;
        
        return (p.val==q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
   
}