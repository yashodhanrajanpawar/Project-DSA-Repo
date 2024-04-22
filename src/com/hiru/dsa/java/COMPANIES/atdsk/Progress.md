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

--------------------------------------------------------------------------------------------------------------

## 3/5 Technical Design(FS/DistributedFS) and DSA Round-DP (60 mins)

//================================ Requirements

1. Design file System
2. Hierarchical structure
3. Directories within dir
4. Thousands of files as single Dir entries (INodes)

Constraints =====

1. Unique names within the same dir

Assumptions =====

1. Single Node Design ? == Single Node (Start)
2. Contents of file could be just text ?

Required Functionality/Fuctional Requirements ====

1. mkdir(), createFile(), readFile(), writeFile() ls() isDir() getArrtributes() sort()
2. Support 1000+ files

//===================================================================================

//=====FILE/DIR stuct ======

class INode {
String name;
String parentDir;
HashMap<String, String> attributes; // Directory Attributes/File Attributes
boolean isDir;
String contents; // If Dir == This will be null for DIR
TreeMap<String, INode> children; // This will be null for FILE

}

// =====Path (
/dir1/dir22/file1 //**** Path ls
/dir2/dir33/file1
/ff
ROOT ==> [dir1, dir2, ff] dir1 (TRUE)
DIR1 ==>
DIR1-INORE (FNAME--Dir22) ==> TRUE
DIR1-INORE (FNAME--Dir22) ==> TRUE

```java
class FileSystem {
    INode root;
}

    //------------------------------------
    List<String> ls(String path) {
// Split path by '/'
        String[] parts = path.split('/');
        INode node = root;

        int size = parts.size();
        int i = 0;
        for (String part : parts) {
            // Non Lead node
            if (i++ < size) {
                if (node.containsKey(part)) {
                    if (node.isDir()) {
                        node = node.children.get(part);
                    }
                } else {
                    return null;
                }
                size++;
            }

        }
        // We have last part to be processed
        // Second last Node in hierarchy
        if (node.children.contains(parts[size - 1])) {
            node = node.children.get(part);
            if (node.isDir) {
                return getList(node.children.keySet()); // Sorted list of all the children 
            } else {
                return new SingletonList(path); //File 
            }
        }
    }
```

//====================================================================
NODE1 ==
NODE2 ==
NODE3 ==

//=============================================================================================================
// Coding Solution
//=============================================================================================================

```java
public class Test {

    public static void main(String args[]) {
        int[] arr = new int[]{1, 4, 2, 3}; //Expected 7
        int size = arr.length;

        //Choose max out of 2
        int MAX_SUM = 10;
        int[][] memo = new int[size + 1][MAX_SUM + 1];
        for (int kk = 0; kk < memo.length; kk++) {
            Arrays.fill(memo[kk], -1);
        }

        System.out.println(maxSum(arr, size, 0, 0, memo));
        System.out.println(maxSum(arr, size, 1, 0, memo));

    }

    // Memoize to reduce time compelxity from exponenstil to O(n2)
    // Space compelity O(N2)
    static int maxSum(int[] arr, int size, int i, int sum, int[][] memo) {
        // Base cases (Exit/UnhappY)
        if (i >= size) {
            return 0;
        }

        // Base case (happy)
        if (i == size - 1) {
            return arr[i];
        }

        // MEMOIZE: read memo[i][sum]
        if (memo[i][sum] != -1)
            return memo[i][sum];

        sum += arr[i]; // Consider ith element and update the sum for current choice/call

        // Explore valid choices for next elements
        int max = Integer.MIN_VALUE;
        for (int k = i + 2; k < size; k++) {
            memo[k][sum] = maxSum(arr, size, k, sum, memo);
            max = Math.max(max, memo[k][sum]); //Recuse (memoize WRITE memo[i][sum])
        }
        //REVISIT here
        return Math.max(sum, max + sum);
    }
}
```
