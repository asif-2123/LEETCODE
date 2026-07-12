/* 
# Approach
<!--  Initiaalising right and left to traverse the left of the root and right of the root,
once getting null return 0, and then trace backs to the upper node and 
checks the max left and right max and add 1 taking its one. And returns true only it the 
value lies 1 or 0. -->

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
    public boolean isBalanced(TreeNode root) {
        return height(root) !=-1;
    }
    private int height(TreeNode node){
        if(node==null) return 0;
        int left=height(node.left);
        int right=height(node.right);
        if(left==-1 || right==-1 || Math.abs(left-right)>1)
            return -1;

        return Math.max(left,right)+1;
    }
}
