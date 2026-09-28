package Array;

/*
# Approach
<!-- We traverse through and make a new array to put the frequency of the elements,
through indexing to the index where size of grid +1;
Then we check in array from 1 where the frq is 1 and 0,
and return i as repeated and missing.-->

# Complexity
- Time complexity:
<!-- O(n^2) -->

- Space complexity:
<!-- O(n^2) -->

# Code
```java [/
*/

// This is the answer -->

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;    int size = n * n;
        int[] freq = new int[size + 1];
        for (int[] row : grid) {
            for (int num : row) {
                freq[num]++;
            }
        }
        int repeated = 0;   int missing = 0;
        for (int i = 1; i <= size; i++) {
            if (freq[i] == 2)    repeated = i;
            else if (freq[i] == 0)    missing = i;
        }
        return new int[]{repeated, missing};
    }
}