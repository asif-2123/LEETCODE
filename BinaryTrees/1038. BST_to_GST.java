/* 
# Approach
<!-- Since we have to do sum only if the root's value is more.
So, goimg to the right of root and adding it's value to the sum.
And assigning the sum to the root value. and then go to left and
when it's go to null then add it's value to the sum.-->

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
    int sum=0;
    public TreeNode bstToGst(TreeNode root) {
       if(root!=null){
        bstToGst(root.right);
        sum+=root.val;
        root.val=sum;
        bstToGst(root.left);
       }
       return root;
    }
}