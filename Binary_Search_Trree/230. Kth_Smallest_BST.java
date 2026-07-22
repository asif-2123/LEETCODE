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
    private int count=0; private int result=-1;
    public int kthSmallest(TreeNode root, int k) {
        smallest(root,k);
        return result;
    }
    private void smallest(TreeNode root,int k){
        if(root==null) return ;
        smallest(root.left,k);
        count++;
        if(count==k){
           result=root.val;
           return ; 
        }
        smallest(root.right,k);
    }
}