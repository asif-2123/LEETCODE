/* Intuition
<!-- In preorder traversal, we visit nodes in the order: Root → Left → Right.
So, the idea is simple — start from the root,
 process it first, then recursively traverse the left subtree,
and finally the right subtree. -->

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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        preorder(root,result);
        return result;
    }
    private void preorder(TreeNode root,List<Integer> result){
        if(root==null) return;
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);
    }
}
