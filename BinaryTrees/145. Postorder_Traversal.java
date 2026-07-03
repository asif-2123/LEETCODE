/* Intuition
<!-- In preorder traversal, we visit nodes in the order: Left → Right → Root.
So, the idea is simple — start from the left,
 process it first, then recursively traverse the right subtree,
and finally the root,and again do the same. -->

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
import java.util.*;
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        postorder(root,result);
        return result;
    }
    private void postorder(TreeNode root,List<Integer> result){
        if(root==null) return;
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }
}