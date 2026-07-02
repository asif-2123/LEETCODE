/* Intuition
<!-- In inorder traversal, we visit nodes in the order:  Left → Root → Right.
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
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        inorder(root,result);
        return result;
    }
    public void inorder(TreeNode root,List<Integer> result){
        if(root==null) return;
        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);
    }
}