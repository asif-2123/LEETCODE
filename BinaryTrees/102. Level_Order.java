/* Intuition
<!-- The problem asks for a level order traversal of a binary tree, 
which immediately suggests using a breadth‑first search (BFS) 
since we need to visit nodes level by level.. -->

# Approach
<!-- I used a queue to perform BFS. 
Starting from the root, I processed all nodes at the current level,
added their values to a list, and 
enqueued their children for the next level. 
Each level’s list was appended to the final result. -->

# Complexity
- Time complexity:
<!-- O(n) -->

- Space complexity:
<!-- O(n) -->

# Code
```java [/
*/
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)  return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int levelsize=q.size();
            List<Integer> level=new ArrayList<>();

            for(int i=0;i<levelsize;i++){
                TreeNode currNode=q.poll();
                level.add(currNode.val);

                if(currNode.left!=null) q.add(currNode.left);
                if(currNode.right!=null) q.add(currNode.right);

            }
            result.add(level);
        }    
        return result;   
    } 
}