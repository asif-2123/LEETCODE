/* 
# Approach
<!-- Making a helper function where we assign left and right and 
add the max path of 0 or the left root/ right root to eleminate negative.
Then check the maximum between the maxSum and the addition of left, right and root value,
and assign it to the max sum. 
and return the root the max of left or right with its own valueto detect path. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) h-height of the tree ->

# Code
```java [/
*/
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

// This is the answer -->

class Solution {
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return maxSum;
    }
    public int helper(TreeNode root){
        if(root==null) return 0;

        int left=Math.max(0,helper(root.left));
        int right=Math.max(0,helper(root.right));
        maxSum=Math.max(maxSum,left+right+root.val);
        
        return Math.max(left,right)+root.val;
    }
}
