package Binary_Search_Trree;

/*
# Approach
<!-- So we go through left and right subtree finding p and q.
When we got then return that and if its same in root or root is null then return root.
If going through left subtree we get null then we return right subtree and vice versa.-->

# Complexity
- Time complexity:
<!-- O(log nn) -->

- Space complexity:
<!-- O(log n) -->

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
