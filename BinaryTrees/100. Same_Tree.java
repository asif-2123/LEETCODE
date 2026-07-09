/* Intuition
<!-- Traversing to the end and start from there to up, and return false only if their data is not same and they don't get to null in the same node. -->

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
