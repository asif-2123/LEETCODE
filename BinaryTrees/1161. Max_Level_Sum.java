/* Intuition
<!-- So initialising maxSum , level and maxLevel we do Level Order traversal.
Then during making it empty at every levvel adding the nodes value.
Later checking it with the maxSum if it's more then giving it value in maxSum.
Also changing the maxLevel with level. After all this level increases.
And after that returning the maxLevel.-->

# Approach
<!-- Recursive. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(h) -->

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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=1,maxLevel=1,maxSum=root.val;

        while(!q.isEmpty()){
            int size=q.size();
            int sum=0;
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                sum+=node.val;

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            if(sum>maxSum){
                maxSum=sum;   
                maxLevel=level;
            }
            level++;
        }
        return maxLevel;
    }
}