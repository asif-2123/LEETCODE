/*
# Approach
<!-- Identifying root from postorder, since it always the last element,
then locate it in the inorder,
and get the left of it are of left subtree and right of it are of right subtree,
then start to store on right till right subtree fills
and same goes for left. -->


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
    int postIndex;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex=inorder.length-1;
        return build(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode build(int[] inorder,int[] postorder,int left, int right){
        if(left>right) return null;

        int rootVal=postorder[postIndex--];
        TreeNode root=new TreeNode(rootVal);

        int i=left;
        while(i<=right && inorder[i]!=rootVal){ 
            i++;
        }
        root.right=build(inorder,postorder,i+1,right);
        root.left=build(inorder,postorder,left,i-1);
 

        return root;
    }
}
