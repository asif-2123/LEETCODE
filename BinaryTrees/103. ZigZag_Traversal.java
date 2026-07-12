/* Intuition
<!-- The problem asks for a level order traversal in zig-zag way of a binary tree, 
which immediately suggests using a breadth‑first search (BFS) 
since we need to visit nodes level by level. -->

# Approach
<!-- I used a queue to perform BFS. 
Starting from the root, I processed all nodes at the current level,
added their values to a list, and 
enqueued their children for the next level, but before it checking to change the order right to left  
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

//This is the answer-->

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean leftToright=true;

        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> zig=new ArrayList<>();
            
            for(int i=0;i<level;i++){
                TreeNode node=q.poll();
                if(leftToright) zig.add(node.val);
                else zig.add(0,node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            result.add(zig);
            leftToright=!leftToright;
        }
        return result;
    }
}