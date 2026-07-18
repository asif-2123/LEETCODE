/*
# Approach
<!-- Identifying root from preorder, since it always the first element,
then locate it in the inorder
and get the left of it are of left subtree and right of it are of right subtree,
then start to store on left till the left subtree fills
and same goes for right. -->


# Complexity
- Time complexity:
<!-- O(n^2) -->

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
    int preIndex=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
    }
    public TreeNode build(int[] preorder, int[] inorder, int left, int right){
        if(left>right) return null;

        int rootVal=preorder[preIndex++];
        TreeNode root=new TreeNode(rootVal);

        int i=left;
        while(i<=right && inorder[i] !=rootVal){
            i++;
        }

        root.left=build(preorder,inorder,left,i-1);
        root.right=build(preorder,inorder,i+1,right);

        return root;
    }
}
