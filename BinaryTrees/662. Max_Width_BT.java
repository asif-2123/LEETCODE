/* 
# Approach
<!-- So we do a level order traversal.
And at every level we check the width,
if its more than maxWidth then update maxWidth.
After traversaing all levels we simply return maxWidth. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) h-height of the tree -->

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
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        Queue<AbstractMap.SimpleEntry<TreeNode,Integer>> q=new LinkedList<>();
        q.add(new AbstractMap.SimpleEntry<>(root,0));
        int maxWidth=0;

        while(!q.isEmpty()){
            int size=q.size();
            int left=q.peek().getValue();
            int right=left;
            for(int i=0;i<size;i++){
                AbstractMap.SimpleEntry<TreeNode,Integer> p=q.poll();
                TreeNode node=p.getKey();
                int idx=p.getValue();
                right=idx;
                if(node.left!=null) q.offer(new AbstractMap.SimpleEntry<>(node.left,2*idx));
                if(node.right!=null) q.offer(new AbstractMap.SimpleEntry<>(node.right,2*idx+1));
            }
            maxWidth=Math.max(maxWidth,right-left+1);
        }
        return maxWidth;
    }
}