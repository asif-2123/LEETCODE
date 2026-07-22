package Binary_Search_Trree;

/*
# Approach
<!--So first we get the mid value of the array and
assigned it as the root to form balance.
Then traverse the left untill left becomes right if its then return null.
And do the same for the right side. -->

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
    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums,0,nums.length-1);
    }
    public TreeNode buildBST(int[] nums,int left,int right){
        if(left>right) return null;
        int mid=(right-left)/2+left;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=buildBST(nums,left,mid-1);
        root.right=buildBST(nums,mid+1,right);
        return root;
    }
}
   
