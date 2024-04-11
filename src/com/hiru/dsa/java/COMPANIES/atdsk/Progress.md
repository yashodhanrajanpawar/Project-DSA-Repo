# Format

- 3 Technical (System Design, DSA, Coding, AWS)
- 2 Managerial Rounds ()

-------------------------------------------------------------------------------------------

# ******** Interviews ********

## 1/5 First Managerial Resume Round (45 mins)

Good discussions with transparent replies and similar profile as JD.
Discussion on Pune, Break, Data job similarity etc.

--------------------------------------------------------------------------------------------

## 2/5 Technical AWS and DSA Round (45 mins)

**Technical and AWS questions**

- Tell me about yourself ?
- Services you own etc. etc. Explain the use case ?
- AWS ===
- What is Compute tradeoff..ECS ?
- What is VPC** ? How do you use it ?
- DB tradeoff -- NO SQL vs RDBMS

**Coding Question (Collabedit Based)**

Sliding Window O(N) question

```
Given an integer array nums, remove the duplicates in-place such that each unique element appears only once. The
relative order of the elements should be kept the same. Then return the number of unique elements in nums.

Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the unique elements in the order they were present
in nums initially.
The remaining elements of nums are not important as well as the size of nums.
Return k.
Example 1:
Input: nums = [1,1,2,1,2]
Output: k=2, nums = [1,2, 2,1,2]
```

```
Rough Work====
/**

* State: Array is not sorted -- Contains duplicate --
* Requiement: 1) Find Num unique elements 2) Modify array inplace till K-1 the index
* APPROACH 1:
*
*
    1. Scan array once and populate the HashMap<Int, Int> numToOcc; ---
* map: [1:3, 2:2] ==> return k =map.keySet().size();
*
    2. Rescan the array:
       */

1,2(p1),2(p2),1,2

1 2 1(p1) 1 1 1 2 3(p2)
```

**Implementation**

```java
// Code ====
class Solution {
    int getNumDistinct(int[] nums) {
        // Base case
        if (nums.lenth == 1 || numslength == 2) {
            return nums.length;
        }

        // Step2: Update array in place till K
        int p1 = 0;
        int p2 = 0;
        HashSet<Integer> visited = new HashSet<>(); // =====Sapce complexity O(K)
        visited.add(nums[p1]); //Initial State
        p1++;

        //Main Loop to traverse till end ==========Time complexity O(N)
        while (p2 < nums.length) {

            //Seen elements 
            while (visited.contains(nums[p2])) {
                p2++;
            }
            visited.add(nums[p2]); //Update isited eleemnts

            // We found some another distinct (< or  > number than last distinct one)
            //Swap
            nums[p1] = nums[p2];
            p1++; // Index to be updated next
            p2++;
        }

        return visited.size(); // This is K
    }
}
```

 





