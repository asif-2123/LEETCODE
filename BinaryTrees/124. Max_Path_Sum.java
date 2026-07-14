/* 
# Approach
<!-- Traversing two sides of nodes as t1 and t2 by going at the end of the node till reaching null
The recursively checks if the values of their nodes are same then returns true rather false. -->

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