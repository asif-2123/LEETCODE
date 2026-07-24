package Binary_Search_Trree;

/*
# Approach
<!--  -->

# Complexity
- Time complexity:
<!-- O(n*log k) -->

- Space complexity:
<!-- O(log k) -->

# Code
```java [/
*/

// This is my answer ->

import java.util.PriorityQueue;

class KthLargest {
    private  PriorityQueue<Integer> minHeap;
    private int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        minHeap=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            add(nums[i]);
        }   
    }
    
    public int add(int val) {
        minHeap.offer(val);
        if(minHeap.size()>k) minHeap.poll();

        return minHeap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */