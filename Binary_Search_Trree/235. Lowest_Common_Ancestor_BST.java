package Binary_Search_Trree;

/*
# Approach
<!-- First we declared an variable count as 0 and result as -1.
Then traverse through left and increase count untill null and
if count becomes k we assign result as root value.
And do same as traverse through right and getting result,
we simply return the value -->

# Complexity
- Time complexity:
<!-- O(n) -->

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
