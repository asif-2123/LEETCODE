/* 
# Approach
<!-- So first we check if the  root has value same as p or q, if it is then its the lowest common ancestor
, then we recusively go throught the left tree and find if there both the values are present or not,
if left tree preceeds too null then return right because it will have a valid value, 
or if we get there a valid value and both left and right tree returns a non-null value then 
the total returs root. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(1) -->

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null || root.val==p.val || root.val==q.val) return root;

        TreeNode leftlca=lowestCommonAncestor(root.left,p,q);
        TreeNode rightlca=lowestCommonAncestor(root.right,p,q);

        if(leftlca==null) return rightlca;
        if(rightlca==null) return leftlca;
        return root; 
    }
}
