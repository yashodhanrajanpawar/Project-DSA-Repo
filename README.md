<span style="color:brown">

# Table Of Contents

- [Coding Interview ](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#1-coding-interview)
- [Coding Problems Generic Patterns Summary](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#coding-problem-generic-patterns)
- [THEME 1 ==> Dynamic Programming- 0/1 Knapsack](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#1-theme--dynamic-programming-0-1-knapsack)
- [THEME 2 ==> Dynamic-programming Subsequence/Palindrome/Editdist/Jumps](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#2-theme--dynamic-programmingsubsequence-palindrome-editdist-jumps)
- [THEME 3 ==> Graphs](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#3-theme--graphs)
- [THEME 4 ==> Backtracking](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#4-theme--algorithms-backtracking)
- [THEME 5 ==> Trees](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#5-theme--trees-data-structure)
- [THEME 6 ==> Trie ](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#6-theme--trie-n-ary-tree-as-pre-processed-dictionary)
- [THEME 7 ==> Arrays-and-strings](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#7-theme--arrays-and-strings)
- [THEME 8 ==> Misc DSA (String, HashMap, Stacks, Queues, HashSet](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#8-theme--misc-dsa)
- [THEME 9 ==> BitMagic](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#9-theme--bitmagic-solve-at-least-10-problems)
- [THEME 10 ==> Binary Search](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#10-theme--binary-search)
- [THEME 11 ==> TWO POINTERS](https://github.com/yash-hiru/Project-DSA-Repo?tab=readme-ov-file#11-theme--two-pointers-sliding-windows)

---

## 1. Coding Interview

### Coding Interview Tips (Pre Coding Round with DOC)

- TIME MANAGEMENT and COMMUNICATION is cruicial within 45 MINS. DONT overcommnicate and over-decorate.
- Be Quick, vocal, loud and clear in this phase. Expedite as much as you could.
- ```-------------------------------------------------------```
- **[5 mins]** Personal Intro ==> Keep in crisp and small..Avoid digresions.
- ```-------------------------------------------------------```
- **[5-10 mins]** Problem Understanding and clarification ==>
    - Read loud and multiple times.
    - Discuss often
    - Clarification questions
    - Clarify Assumptions
    - Small example walkthrough. (with some Base cases)
- **[5 mins]** Tradeoff and Consensus ==>
    - Suggest multiple appraoches (Brute forte too)
    - Discuss approaches with tradeoff analysis (time and space complexity) and scalability
    - Get consensus on final optimal one
- ```-------------------------------------------------------```
- **[20 mins]** Implementation AGREED UPON APPROACH ==>
  ```Dont jump into Implementation without Consensus with interviewer```
    - First Draft:
        - Start with Skeleton of core methods. Assume other APIs, Classes (Just keep stubs and implement them if time
          permits)
        - ***Implement core method at lightning speed (CRUICIAL).
        - Avoid over comments and modularity
        - Dont optimize for space and time quickly
        - Use following demarkations for better better readability in case of plain white notepad based coding (google)
            - ```// Understanding Assumptions ====================================================================```
            - ```// Function (Approach)====================================================================```
            - ```// Testcases/Dryrun====================================================================```
            - ```// Code Comment ################```

    - Second Draft:
        - Generalize, Optimize, bug fix
    - Thidrd Draft (If asked and time permits)
        - Scale (If Possible and asked)

- **[5 mins]** Self and Peer Review, Edge cases, Other suggestions
- ```-------------------------------------------------------```
- **[5 mins]** Mention extra areas if improvement and few additions.
- ```-------------------------------------------------------```

---

## Coding Problem Patterns

- Patterns
  ![Patterns](https://algomonster.s3.us-east-2.amazonaws.com/stats.png)
- Worst working choices as per input size  (machine with 2GZ computations which is 2000, 000,000 executions)

| **Input**             | **Worst working algo**        | **Time Complexity** | **Required Computations** |
|-----------------------|-------------------------------|-----------------|---------------------------|
| N < 20                | Brute force/Backtracking      | O(2^N) , O(N!)  | 1,000,000                 |
| N < 3000              | Dynamic Programming           | O(N^2)          | 9,000,000                 |
| 3000 < N < 10,000,000 | 2Pointer, Greedy, Heap, Sorting | O(N), O(N logN) | 10,000,000                |
| N > 1,000,000         | Binary Search, Math           | O(log N) , O(1) | 3,000                     |

### Time Complexities Per Categories

- **Constant ====> O(1)**
    - Hashmap, Stack
    - math formula
    - index access
    - Heap--Get Min
- **Logarithmic ====> O(Log N)**
    - Binary seach /variant
    - Balanced binary tree lookup
    - Number's digits processing
    - Heap insert, Pop ONE element
- **Linear ====> O(N)**
    - Array/List go through
    - Two pointers
    - Some greedy
    - Tree/Graph Traversal (N nodes, N visits)
    - Stack queue full usage
- **O(K log N)**
    - Heap insert, Pop K elements
    - K times Binary search
- **O(N Log N)**
    - Sorting
    - Divide N conquer-- LogN for divide and N for linear operations
- **O(N^2)**
    - Nested Loops
    - Multiple times brute force solutions
    - Some DP problems
- **Combinational -- O(K^N)**
    - Combinational problems, arrangements, backtracking
    - Fullon recursive tree for N depth... ( 2^N+1 - 1) elements)
- **O(N!)**
    - Backtracking problems..Grows rapidly
    - Brute force recusion

### Keyword to Algorithm Cheatsheet

| **KEYWORDS**                                                                               | **PETTERNS**                                                                                                                                                                    | **BEST TIME COMPLEXITY** | **BEST SPACE COMPLEXITY** |
|--------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|--------------------------|---------------------------|
| **[Sequences]Sorted / Sorted Rotated / canSolve() Min-Max(Binary Possible Range Filters)** | Binary Search                                                                                                                                                                   | Log(N)                   | 1                         |                ||
| **[Sequences]Substring / SubArray/ N-gram / Move-zerosToEnd / RemoveDuplicates**           | Two Pointers-Sliding Window , HashMap, Char[26]  , HashSet, ArrayList                                                                                                           | N                        | K                         |
| **[Sequences]Two Sum sorted arr / Palindrome / Max Dict as SubSequence**                   | Two Pointers (Opposite)                                                                                                                                                         | N                        | 1                         |
| **[Sequences] Min/Max SubSequence , Palindrome Partitioning**                              | DP                                                                                                                                                                              | N or N^2                 | N or N^2                  
| **[Sequences/Maze]Min/Max with overlapping subproblems**                                   | DP                                                                                                                                                                              | N or N^2                 | N or N^2                  ||
| **K-min/K-max**                                                                            | Heap (with DFS/ArrayLookup)                                                                                                                                                     | K*LOG(N)                 | N                         | 
| **[String]Match Parenthesis / Regular Expressions / String Parsing**                       | Stack, Sliding Window, Two Pointer                                                                                                                                              | N                        | N                         |
| **[String]Dictionary / Word Lookup / O(K) search**                                         | TRIE, Two Pointer, Sliding Window, Backtracking, Char[26]                                                                                                                       | Trie: K*N                | K*N                       |
| **[String]Decodings (Bash Expansion, SNow)**                                               | All Strings-- Backtracking, Decode pattern --2 Loops with sliding window and stack                                                                                              |||
| **Max on sorted Input / Iterative Optimization**                                           | Greedy Algorithm                                                                                                                                                                |||
| **Graph, Matrix, Maze, Tree**                                                              | BFS (Explore More paths, DP)  , DFS (Paths, Backtracking)                                                                                                                       | (E+V) or N               | (E+V)                     |
| **Graph-DAG--Dependency** , Order of tasks, Uniqueness of order of tasks (Assume DAG)      | Topological Sorting    (Use DFS way--> **generate** **graph**, **generate** **indegrees**, **run** **topo(init and Util)**, if>0 DAG root **then not unique**, match with order | E+V                      | E+V                       |
| **[Sequence]Generate All Subsets of max len K using K chars**                              | Bitwise Generator ((2^K+1)-1) elements), Backtracking                                                                                                                           |||
| **Regions / Groups / Connectivity**                                                        | Union Find, Transitive relationship,                                                                                                                                            |||
| **[Maze] Chess, SnL game, Sudoku                                                           | Iterative all Cells verify, Backtracking(All possible combinations/valid ans)                                                                                                   | N^2 or K^N               | K                         |
| **Range Search**                                                                           | Interval Tree, Prefix array(range sum)                                                                                                                                          | Log(N) or 1              | N or K                    |
| **[Arrays] Local Minima, Maxima, Stock sale/buys**                                         | LocalMinima Maxima Sliding Window, 2 Pointers                                                                                                                                   | N                        | 1                         |

---

## 1. Theme ==> _Dynamic_ Programming (0-1 Knapsack)

#### Illustration

![](https://astikanand.github.io/techblogs/dynamic-programming-patterns/assets/knapsack_possiblities_tree.png)

#### Uniqueness

1. Find **Min , Max** , **Count** (Combinations ...Not permutations) or **exists**  outcome with given constraints
2. Usually **array** or **string** problems
3. Overlapping sub-problems ?
4. Optimal Substructure

#### Time Complexity

1. **Exponential** with O(1) space ==> **O (K^N)**
2. **Linear** or **quadratic** with extra O(N) or O(NxM) space ===> **O(N^K) ** k =1,2

#### Problem Description

- **Problem**: 0/1 knapsack (N, wt [], val[], W) with constraints and objectives and similar problems.
- **Format: Problem(Input, Constraints, Objective) | Choices | States | Stages | Repeatations**
- **Inputs:**
    - Num items: N
    - Available Options ( wt[N] )
    - **Available Values (val[N])
    - Constraint(s) : W is max weight of knapsack
    - Objective: MAX (profit)

#### Examples

| **Sr.No** | **Problem** | **Options** | **Objective** | **Constraints**                           | **Repeat**  | **Options** | **NumChildren** | **Operator** | **BaseCase Return**                   |
|---------|-----------------------------------------------------------|--------|----------------------|---------------------------------------|---------|-----------------|------------|---------------------|---------------------------------------|
| 1       | 0-1 Knapsack                                              | wt[N]    | val[]                  | W max weight                          | No      | Yes/No | 2****        | **MAX**(subproblems)  | val[N-1]                              |
| 2       | Minimum number of Coins to get the V               | coins[N] | **1**                  | V value                               | ** Yes** | **FOR** (options) | **N**        | **MIN**(subproblems)  | 1                                     |
| 3       | Subset Sum (If Exist Any subset)                      | set[N]   | **True/false**         | No Repeations                         | No | Yes/No | 2 | **OR**(subproblems)   | True                                  |
| 4       | Subset Sum (Count All such subsets)                   | set[N]   | **SUM(counts)**        | No Repeations                         | No | Yes/No | 2 | **SUM (subproblems)** | count of all combinations e.g. 1, 2,3 |
| 5.      | Cut Road to get Max profit                      | rod[N]   | **rod[i]**             | rod[N]                                | **Yes** | **FOR** (options) | **N**        | **MAX**(subproblems)  | rod[N-1]                              |
| 6.      | Palindrome Partitioning- Find MIN num of palindrome partitions | | |                                       |         | | | |                                       |

#### Common Mistakes

- **Wrong Data Assumptions** (Type, Size, order, contents)
- **Improper Index Handling** (Corner Cases, Validations at start, OOB, loop counters, Base conditions)
- **Initial/Invalid values Usages** (MAX addition, -1 vs 0 vs MIN)
- **Causing Overflows:** (long over int, -1, INT_MAX+1)
- **Not Following this DP soln format:**

    ```java
    class Solution {
        int TEMPLATE(inputs..., vars, memo[N+1][N+1]) {
            //----------- Less costly Part --------------
            // 1. Index Bounds and other validations (return 0)
            // 2. Happy Case (return 1)
            // 3. Sad Case (return 0)
            // 4. Delegate cases (return TEMPLATE(input++, ...vars, memo)
            //----------- Optimization (memo-read) --------------
            // 5. Read if exist
            //----------- Costly/Complex/Repeated Part --------------
            // 6. FOR (Choices)
            // 7. Sol1, SOl2, SOl3...
            // 8. return MAX(Sol1, Sol2, SOl3)
            // 9. return 0
        }
    }
    ```
- **DP(subsequence vs substring)**
    - Subsequnce--C1 or MAX(C2,C3)
    - Substring--MAX(C1,C2,C3)

#### ====Implementation====

**PROBLEM 1 : Bounded 0/1Knapsack(without repeatations)**

```java
class GFG {

    /**
     *
     * @param wt:     [FIX] weights (Affecting constraints and Objective)
     * @param val:    [FIX] values (Affecting objective)
     * @param N:      [FIX] Size of array
     * @param W:      [Variable] Reducing in recursive trees. 0 for valid leaf node.
     * @param i:      [Variable] Increasing in recursive tree forYes/No choice.
    [Optional] For problems when REPEATATIONS are ALLOWED
     * @return: MAX value for given call.
    MAX value for root level( 0 index) problem.
     */
    int knapsack(final int[] wt,
                 final int[] val,
                 final int N,
                 int W, // Reducing parameter
                 int i) {
        // Base case
        if (i == size) {
            return 0;
        }

        // Base case -- Constraints SKIP current and try next)
        if (wt[i] > W) {
            // Skip this one and try next item
            return knapsack(prof, wt, size, W, i + 1); // LEARNING --- DON'T return 0 BLINDLY.
        }

        // Memoization will go here

        // Explore choices (YES/NO)
        return Math.max(
                prof[i] + knapsack(prof, wt, size, W - wt[i], i + 1), //Choice1 -- Put item
                knapsack(prof, wt, size, W, i + 1) // Choice2-- Don't put item
        );
    }

}

```

**PROBLEM 2: Unbouded 0/1 Knapsack (WITH repeatations) -- Min coins change problem**
```N recursive trees emerging for first FOR loop from first call```

```java
class MinCoinsChange {
    // NOTE (UNBOUNDED KNAPSACK) ******** (WE DONT START WITH ANY INDEX LIKE BOUNDED KNAPSACK)
    // NOTE (UNBOUNDED KNAPSACK) ******** ('change' is the variable which differentiates diff calls)
    static int DP_unboudedKnap_minCoins(int[] coins, int change, int[] memo) {
        if (change == 0) {
            return 0; // No coins could be used
        }

        // Memoize- cache hit
        if (memo[change] != -1) {
            return memo[change];
        }

        int sol = Integer.MAX_VALUE; // Min calculations 

        // NOTE (UNBOUNDED KNAPSACK) ******** (WE HAVE FOR LOOP HERE)
        for (int i = 0; i < coins.length; i++) {
            // Guardrails for avoiding invalid calls
            if (coins[i] <= change) {
                // Memoize- cache save
                memo[change - coins[i]] = DP_unboudedKnap_minCoins(coins, change - coins[i], memo);
                if (memo[change - coins[i]] < Integer.MAX_VALUE) // Guardrail for invalid branches
                    sol = Math.min(sol, 1 + memo[change - coins[i]]);
            }
        }
        return sol; // Could return MAX_VALUE for invalid state (Handle it carefully in parent callers to avoid overflow)
    }
}
```

---

## 2. Theme ==> Dynamic Programming(SubSequence, Palindrome, EditDist, Jumps)

#### Uniqueness

1. Objective ---- Min/Max/Longest/Smallest or count objectives
2. Dataypes --- Usually String/Array
3. Choices --- 2/3/4 choices with index arithmetic
4. Corner cases are tricky than knapsack based DP problems

#### Examples

1. Longest Increasing SubSequence (2 choice)

- Match vs NoMatch ```MAX [1+(i+1), (i+1)]```

2. Longest Common Subsequence (1 vs 2 choices)

- Match ```1 +(i+1, j+1)```
- NoMatch ```MAX [(i, j+1), (i+1, j)]```

3. Longest Common STRING (3 vs 2 choices)

- Match ```MAX [1 +(i+1, j+1),  (i+1, j),  (i, j+1)]```
- NoMatch ```MAX [(i+1, j),  (i, j+1)]```

4. Longest Palindrome Subsequence (1 vs 2 choices)

- Match ```2 +(i+1, j-1) ```
- NoMatch ```MAX [(i+1, j-1),  (i, j-1)]```

5. Longest Palindrome SubSTRING (3 vs 2 choices)

- Match ```MAX [2 +(i+1, j-1),  (i+1, j-1),  (i, j-1)]```
- NoMatch ```MAX [ (i+1, j-1),  (i, j-1)]```

6. Edit distance ( 1 vs 3 choices)

- Match ```0+(i+1, j+1)```
- NoMatch ```1 + MAX [(i+1, j+1) (i+1, j) (i, j+1)]```

#### ====Implementation====

**PROBLEM 1: Length of Longest Palindrome Sub-STRING (Special--Could be solved optimally using TWO-POINTER technique)**
Alternative:

```
Note: This could be solved using NON DP way too..Please refer String theme with solves even complex problem.
Get actual longest palindrome substring
```

Complexity:

```
Time complexity: O(N^2), Where N is the size of the string
Space complexity: O(N^2)
```

Implementation:

```java
package com.hiru;

public class LPS {
    public static void main(String args[]) {
        String str = "ZZAABAACFRTACA";
        //String str = "DDDAABAACRRRRRCZZ";
        int[][] memo = new int[str.length()][str.length()];
        System.out.println(longestPalindromeString(str, 0, str.length() - 1, memo));
        return;
    }

    // Initial state requires to have start and end index (0, size-1)
    static int longestPalindromeString(String str, int s, int e, int[][] memo) {
        if (e < s || s == str.length() || e == -1) {
            return 0; // No palindrome further
        }

        if (e == s) {
            // Odd palindrome mid
            memo[s][e] = 1;
            return memo[s][e];
        }

        // Explore choices
        int sol1 = -2, sol2 = -1, sol3 = -1;
        if (str.charAt(s) == str.charAt(e)) {
            if (s + 1 < str.length() && e - 1 >= 0) {
                sol1 = memo[s + 1][e - 1] = 2 + longestPalindromeString(str, s + 1, e - 1, memo);
            }
        }

        //Option2-3
        if (s + 1 < str.length()) {
            sol2 = memo[s + 1][e] = longestPalindromeString(str, s + 1, e, memo);
        }
        if (e - 1 >= 0) {
            sol3 = memo[s][e - 1] = longestPalindromeString(str, s, e - 1, memo);
        }

        return Math.max(sol1,
                Math.max(sol2,
                        sol3)
        );
    }
}
```

---

## 3. Theme ==> Graphs

- **Graph DFS and BFS is same as tree with the only difference of NEED of VISITED NODES tracking**
- **====BFS / DFS =====**
    - **BFS** is better at:
        - finding the **shortest distance** between two vertices
        - graph of **unknown size**, e.g. word ladder, or even infinite size, e.g. knight shortest path

    - **DFS** is better at:
        - Uses less memory than BFS for **wide graphs** (that is, graphs with **large breadth** factors), since BFS has
          to
          keep all the nodes in the queue, and for wide graphs, this can be quite large.
        - **finding** nodes **far away from the root**, **e.g**., looking for an **exit in a maze**.

#### [Category]  BFS

**## Unconventional BFS problems (Implicit Graphs) ##**

- ```In each of these problems, you are given input with multiple FIXED size STRINGS. There is relation among them in terms of DIFF char(s) .. THATS the graph relationship```
-
    - Node is string.
- ```Number of neighbors: Next digit for each of the position e.g. 1234 --> [2234, 1334, 1244, 1235]```

**## Word ladder puzzle ##**

```java
class WordLadder {
    public static final char[] ALPHABETS = new char[26];

    static {
        // ascii representation of english alphabets a - z are numbers 97 - 122
        for (int i = 0; i < 26; i++) {
            ALPHABETS[i] = (char) (i + 'a');
        }
    }

    //=================  ONE EDIT distance neighbors
    public static List<String> getNeighbors(String word) {
        List<String> unvisitedNeighbors = new ArrayList<>(); // Adjacency
        // PATTERN: ALL string char positions
        for (int j = 0; j < word.length(); j++) {
            // PATTERN: All possible chars to be replaced and generate the new word
            for (char c : ALPHABETS) {
                StringBuilder wordBuilder = new StringBuilder(word.length());
                wordBuilder.append(word.substring(0, j));
                wordBuilder.append(c);
                wordBuilder.append(word.substring(j + 1));
                String nextWord = wordBuilder.toString();
                // PATTERN: Check if NEW word(aka Neighbor) contains in DICT before considering it as neighbors
                if (unvisitedWords.contains(nextWord)) {
                    unvisitedNeighbors.add(nextWord);
                    unvisitedWords.remove(nextWord);
                }
            }
        }
        // Return Neighbors
        return unvisitedNeighbors;
    }
}
```

**## Lock/Unlock with 4 wheel patterns ##**

```java
class CombinationLockFourWheels {
    // Preprocessing to have simpler code
    public static Map<Character, Character> nextDigit = Map.of(
            '0', '1',
            '1', '2',
            '2', '3',
            '3', '4',
            '4', '5',
            '5', '6',
            '6', '7',
            '7', '8',
            '8', '9',
            '9', '0'
    );

    //=================  ONE EDIT distance neighbors
    // Single move of any wheel means single attemp hence 
    // neighboars in graph are away from ONE move (any wheel0
    public static List<String> getNeighbors(String combo) {
        List<String> neighbors = new ArrayList<>(); // Adjacency
        // PATTERN: Attempt rotating EACH of the 4 whees lead to 4 next combinations
        for (int j = 0; j < 4; j++) {
            String newCombo = top.substring(0, i)
                    .concat(String.valueOf(nextDigit.get(top.charAt(i)))) // position being replaced
                    .concat(top.substring(i + 1));
            neighbors.add(newCombo);
        }
        // Return Neighbors
        return neighbors;
    }
}

```

## 2D Sliding Block Puzzle [[5,2,4],[1,3,0]] ##

- Tips: Serialize and deserialize method and use serialized version for BFS
    - SERIALIZE ==>  int[][] [[5,2,4],[1,3,0]] ==> Integer 524130
    - DESERIALIZE ==>  Integer 524130 ==> int[][] [[5,2,4],[1,3,0]]
- Use deserialized version for neighbor checking and constraints validations

**BFS Templates**

```java
import java.util.*;

class Graph {
    // Simplest Implementation ever
    List<List<Integer>> graph;
    // Get adj for Node i ===> graph.get(i)
    // Count nodes===> graph.size()
    // Count neighbors of node i  ===> graph.get(i).size();

    //--------------Plain BFS ------------------------------------------------------------------------------------------
    public void bfs(Node root) {
        LinkedList<Node> queue = new LinkedList<>();
        //STEP1:  Start with Root Node (Can have multiple roots in disconnected graph)
        queue.add(root);
        //STEP1.1:  Set for tracking visited (better than bool array)
        Set<Node> visited = new HashSet<>();
        visited.add(root); //STEP2:  mark visited
        //STEP3: BFS look until queue is empty 
        while (queue.size() > 0) {
            //STEP3.1: Deque in FIFO way 
            Node node = queue.remove();
            //STEP3.2: Explore eighbors and mark unvisited as visited
            for (Node neighbor : getNeighbors(node)) {
                if (visited.contains(neighbor)) {
                    continue;
                }
                queue.add(neighbor);
                visited.add(neighbor); //Important (Mark as soon as you see it)
            }
        }
    }

    //--------------BFS for Level Tracking/Distance Calc in Unweighted graph (weight=1) ------
    public int bfs_variant(Node root) {
        //######## level/dist
        int level = 0;
        LinkedList<Node> queue = new LinkedList<>();
        //STEP1:  Start with Root Node (Can have multiple roots in disconnected graph)
        queue.add(root);
        //STEP1.1:  Set for tracking visited (better than bool array)
        Set<Node> visited = new HashSet<>();
        visited.add(root); //STEP2:  mark visited
        //STEP3: BFS look until queue is empty 
        while (queue.size() > 0) {
            //###########################
            // *** Process Last Level Enqueued
            for (int i = 0; i < queue.size(); i++) {
                //STEP3.1: Deque in FIFO way 
                Node node = queue.remove();
                //STEP3.2: Explore eighbors and mark unvisited as visited
                for (Node neighbor : getNeighbors(node)) {
                    if (visited.contains(neighbor)) {
                        continue;
                    }
                    queue.add(neighbor);
                    visited.add(neighbor); //Important (Mark as soon as you see it)
                    // **** (Another variant) Shortest path: Start with SOURCE and Check if you find TARGET (return level) 
                }
            }
            //########################### 
            level++;
        }
        return level;
    }
}

```

**Overview:**

- Representation:

```java
  class GFG {
    int V;
    List<Integer>[] adj = new LinkedList<Integer>[V];
    // OR
    List<Integer>[] adj = new List[V];
    adj[0]=Arrays.asList(1,2,3);
}
```

- Directed Graph:
    - Unlike tree BFS(which starts from root), Graph BFS does NOT gurantee cover all the vertices.
    - E.g. Starting from sink node with no outdegree will lead to BFS for only just that node
- Undirected Graph:
    - Start from all the unvisited nodes if there are more than one components (islands)
- Queue:
    - ```LinkedList<Integer>``` as Queue.
    - Useful methods (EMPTY, ENQUE, DEQUE): ```isEmtpty()``` , ```add()``` and ```poll()```

#### [Category]  Paths and Connectivity

**PROBLEM 1: Find Connected Components/Islands in Maze (Special Graph/Special representation)**

```java
class GFG {
    /**
     * Find Number of Islands in Maze/Grid/Graph
     * @param maze
     * @return num islands
     */
    int getNumIslands(int[][] maze) {
        int numberOfIslands = 0;
        // For each Vertex (i,j)
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze.length; j++) {
                if (maze[i][j] == 1 && visited[i][j] == false) {
                    // DO BFS/DFS ( Explore U-D-L-R for maze and adj for graph)
                    BFS(maze, i, j); // (OR DFS would also work)
                    numberOfIslands++; // ONE BFS traversal for Subset of nodes is ONE island
                }
            }
        }
        return numberOfIslands; // This equals number of FULL DFS/BFS calls from any unvisited node(s)
    }
}

```

#### [Category] Topological Sorting for DAG dependency

**Illustration:**

![](https://media.geeksforgeeks.org/wp-content/uploads/20231106112211/1.jpg)

![](https://media.geeksforgeeks.org/wp-content/uploads/20231106112408/2.jpg)

![](https://media.geeksforgeeks.org/wp-content/uploads/20230914164620/Topological-sorting.png)

- **OLD --> NEW**  indicates  **NEW Depend on OLD**.. Arrow indicates the FUTURE direction
- USECASES: Extremely important for **compiler, dependency and job sequencing**
- CONDITIONS ==>
    - Supported Data Structures:  **Directed Acyclic Graph**(including all **Trees** and **DAG forest**)
    - Feature:
        - The **first vertex** in topological sorting is **always** a vertex with an **in-degree of 0** (a vertex with
          no incoming
          edges).
        - In case of **tree**, **ROOT** will always be FIRST vertex in output
- Example (DAG forest):
- **Topological** Sorting of **Trees** (More restrictive DAG with **0 (root) or 1(other) indegree**) is **PRE-ORDER**
  traversal
- **UNIQUENESS**
  ```If a topological sort has the property that all pairs of consecutive vertices in the sorted order are connected by edges, then these edges form a directed Hamiltonian path in the DAG. If a Hamiltonian path exists, the topological sort order is unique; no other order respects the edges of the path. Conversely, if a topological sort does not form a Hamiltonian path, the DAG will have two or more valid topological orderings, for in this case it is always possible to form a second valid ordering by swapping two consecutive vertices that are not connected by an edge to each other. Therefore, it is possible to test in linear time whether a unique ordering exists, and whether a Hamiltonian path exists, despite the NP-hardness of the Hamiltonian path problem for more general directed graphs (i.e., cyclic directed graphs)```
- NEW BFS implementation:

```java
class BFSTopoSortWithUniqueCheck {
    //======================================================
    List<Integer> topologicalSort(List<List<Integer>> graph) {
        // GET INDEGREES
        LinkedList<Integer> queue = new LinkedList<>();
        int[] indegrees = getIndegrees(graph); // assume

        // Initialize
        for (int indegree : Indegrees) {
            PUSH(indegree_0);
        }

        // Start the BFS
        boolean uniqueOnly = true; // Determine if THERE is ONLY ONE topological sort for given problem (Extra info)
        List<Integer> result = new ArrayList<>(); // Topological Sort output

        // BFS
        while (q.isEmpty() == false) {
            // At any Stage, queue containing MORE THAN ONE elements indicate that THERE are MORE THAN ONE topological sorts
            if (q.size() > 1) { // if there's > 1 node in the queue, the reconstruction is not unique
                uniqueOnly = false;
            }

            // Get Node
            int node = queue.remove();

            // Add ONLY ZERO indegree node to result
            result.add(node);

            //2. Explore adjacencies and reduce their indegree counts by 1
            List<Integer> neighboars = graph.get(node);

            for (Integer nn : neighboars) {
                indegree[nn]--; // Reduce indegree upon each INCIDENT edge to this nn node
                if (indegree[nn] == 0)
                    q.add(nn); // Add to queue only if indegree become ZERO
            }
        }

        // return result(aka Topo Sort ordering) ONLY if graph and result size matches 
        graph.size() == result.size() ? res : null;
    }
}
```

**PROBLEM 0: Task Scheduling**

```java
import java.util.LinkedList;
import java.util.Stack;

/**
 * For this problem, given a list of tasks and a list of requirements, compute a sequence of tasks that can be performed, such that we complete every task once while satisfying all the requirements.
 Each requirement will be in the form of a list [a, b], where task a needs to be completed first before task b can be completed,
 There is guaranteed to be a solution.

 tasks = ["a", "b", "c", "d"]
 requirements = [["a", "b"], ["c", "b"], ["b", "d"]]
 Output: ["a", "c", "b", "d"]

 */
class TaskScheduling {

    //Part1=================Generate Graph ========================================
    List<List<Integer>> generateGraph(int[] tasks, HashMap<String, String> requirements) {
        // Generate Node list (all nodes)
        HashMap<String, ArrayList<String>> graph = new HashMap<String, ArrayList<String>>();
        // We have Empty adj lists for all nodes 
        for (int i : tasks) {
            graph.put(i, new ArrayList<>());
        }
        // Populate Adjacencies (using requirements map)
        for (Integer req : requirements.keySet()) {
            graph.get(req).add(requirements.get(req)); // Append Adjacencies
        }
    }

    //Part2=================Get DAG roots (Assume acyclic) ========================================
    HashSet<String, Integer> getDagRoots(HashMap<String, ArrayList<String>> graph) {
        // Initialize 
        HashSet<String, Integer> indegree = new HashSet<String, Integer>(); // Implicit ordering with node
        Arrays.fill(indegree, 0);
        graph.keySet().forEach(node -> {
            inDegree.put(node, 0);
        });

        // Update indegrees
        graph.entrySet().forEach(entry -> {
            // Adjacencies iterate
            for (T neighbor : entry.getValue()) {
                inDegree.put(neighbor, inDegree.get(neighbor) + 1);
            }
        });
        return inDegree;
    }

    //Part3=================Implement topological sorting (USING DFS..Init method and UTil method technique=====
    // A->B means..... B <DEPENDS> on A ...( not either way round)
    public void depthFirstSearch_TOPOSORT(HashMap<String, ArrayList<String>> graph,
                                          HashSet<String, Integer> indegree,
                                          ) {
        HashSet<String> visited = new HashSet<>();
        LinkedList<String> stack = new LinkedList<>();
        // ----- Init with indegree 0 nodes and 
        //depthFirstSearch_TOPOSORT_UTIL(node1);
        //depthFirstSearch_TOPOSORT_UTIL(node2);

        // Print from top to bottom

    }

    //Part3=================Implement topological sorting DFS UTIL for current Node
    private void depthFirstSearch_TOPOSORT_UTIL(HashMap<String, ArrayList<String>> graph,
                                                HashSet<String> visited,
                                                LinkedList<String> stack,
                                                String node) {

    }

}

```

**PROBLEM 1: Implement Topological Sort:**

```java
class GFG {
    // ======================================(Driver code)
    public void topologicalSort(int V, List<List> adj) {
        // STEP1: Assume unconnected graph hence multiple FOR(DFS)
        boolean[] visited = new boolean[V];

        Stack stack = new Stack(); // java.utils.colections

        // STEP2: Push the element in PECULIER order (LIFO-DFS) to stack
        List<Integer> dagRoots = getDAGRoots(V, adj);

        // STEP 3: Check Eligibility
        if (dagRoots.size() == 0) {
            return;
        } else {
            // STEP4: Start topological Sorting from EACH of DAG roots ( >1 dag roots means unconnected graph)
            for (Integer u : dagRoots) {
                DFS_topologicalSort_UTIL(V, adj, visited, stack, u); //Start with given dag Root
            }

            // STEP5: Print elements from stack in LIFO fashion
        }
    }

    //=============================== DFS_TS (Core method)
    public void DFS_topologicalSort_UTIL(int V, List<List> adj, boolean[] visited, Stack stack, int u) {
        // STEP1: Visit element (u's initial value is DAG root vertex)
        visited[u] = true;

        // STEP2: DFS adj nodes
        for (int v = 0; v < adj.size(); v++) {
            DFS_topologicalSort_UTIL(V, adj, visited, stack, v);
        }
        // STEP3: Push current node to Stack(after adj)
        stack.push(u);
    }

    //================================= Find DAGRoots
    private List<Integer> getDAGRoots(int V, List<Integer>[] adjadj) {
        // Define empty array for tracking indegrees of all vertices
        int[] indegree = new int[V];
        Arrays.fill(indegree, 0);

        // Populate Indegree
        for (List<Integer> adj : adjadj) {
            for (Integer i : adj) {
                indegree[i]++;
            }
        }
        // Postprocess-- Filter DAG roots (0 indegree)
        List<Integer> dagRoots = new ArrayList<Integer>();
        for (int i = 0; i < n; ++i) {
            if (indegree[i] == 0)
                dagRoots.add(i);
        }
        return dagRoots
    }

}
```

#### [Category]  Flows and Fills

Refer Algo.monster

#### [Category] Spanning Trees, Connect Multiple, Shortest paths

Refer Algo.monster

#### [Category]  Coloring

Refer Solved Problems.
**- Find Minimum Colors (Chromatic Number)**

- This is SIMPLE problem
- Iterate through all adj and store outdegrees for each v
- Return MAX all the outdegrees +1 as MIN colors
  **- M-Coloring ==> Can color using M colors ?**
- Backtracking DFS is the way forward
- Start from s..[Color..Conflict=NO ...Recurse..Backtrack]
- Return true if ALL nodes are colored
- **** Breadth-First-Search ```DOES NOT WORK``` with ```backtracking```
  **- Detect Bipartile Graph?**
- Use M coloring algo with M=2. See if we found solution ?

---

## 4. Theme ==> Algorithms (**Backtracking**)

#### Uniqueness

- Typical question: Find Permutations (Not combinations)
- Types:
    - Decision ==> ```See if``` solution exist
    - Optimization ==> ```Find Optimal``` Solution (Any)
    - Enumeration ==> ```List all``` the solutions
- Not solvable by DP and greedy
- Incrementatlly build candidate using DFS and take following decision on partial candidate
    - SUCCESS (Found Solution-Leaf node)
    - ABANDON (Backtrack)
- Aka. Optimal Brute force
- ```For graphs, ALWAYS use DFS since BFS does not fit to backtracking algorithm```

#### Time Complexity

- DP < Backtracking < BruteForce
- O(N^k) **<** O(k^N) / O(N!) **<** O(N^N)

#### Hints

- Find all solutions
- Find combinations/permutations (not combinations)

#### Common Mistakes

- Breadth first (NEVER do that)
    - Backtracking nature is **Depth first** only. Stick to that only.
- Backtracking Changes:
    - (**EACH Stage** Changes) If current stage involves changes --> backtrack those changes (once for ALL the choices)
    - (**EACH choice** within curr stage) If EACH choice from current state involves any changes, then BACKTRACK the
      change
      FOR EACK of the choice before
      exploring next choice
- Maze Loops ==>
    - **Stack overflow** due to stuck.. if allowed all directions
    - Keep track of **visited node** (for current x,y) and backtrack at the end

- Path tracking ==>
    - If path is Arraylist, then its passed by reference, hence backtrack by removing last element as appropriate
    - If path is **String**, its passed by value, hence you **DONT need backtracking** for EACH CHOICE

- Graph (DFS) ==>
    - visited[u] = false

- Trees (DFS--any traversal)
    - ArrayList<Integer> path;
    - path.add(root.data())  ===backtrack===> **path.remove(path.size()-1)**

#### Backtracking Template

```java
class GFG {
    void FIND_SOLUTIONS(CURRENT_STATE, IN_OUT_PARAMETERS) {
        //---------------- Section == Validations and base cases
        // Happy case
        if (FINAL_STAGE(IN_OUT_PARAMETERS)) {
            // --- Some recursive path ends to DESIRED STATE
            PRINT(SOLUTION);
            RETURN true;
        }

        //---------------- Section == Recursion and backtracking
        ___UPDATE_PARAM(param1); // UPDATE Stage level param
        // Explore choices for NEXT stages( next recursive calls) and see if at least one path leads to solution ? If NO backtrack
        // For some combinomatrics problems, ALWAYS backtrack after bounding from all sub-paths
        for (SOME_CHOICE in ALL_CHOICES) {
            // Filter out valid choice before recursive call for next state 
            if (VALID(SOME_CHOICE)) {
                //----- We have found some valid choice for next state (phase)
                ___UPDATE_PARAM(param2); // UPDATE choice level parameter

                //----- Confirm this choice assuming next state would lead to final solution
                //----- Desicion Problem: Return immediately if we know at least 1 solution was found.
                //----- Backtrack if we dont see next state leading to the solution
                // [***Optinal IF***] -- Not applicable for lets say subsets

                if (FIND_SOLUTIONS(NEXT_STATE, IN_OUT_PARAMETERS) == false) {
                    // ----- Abandon the subproblem 
                    // ----- we undo certain assignments of values to variables to reassign them to other possible values, see if those lead to a valid solution.
                    ___BACKTRACK_PARAM(param2); // BACKTRACK choice level parameter
                    return;
                }
                ___BACKTRACK_PARAM(param2); // BACKTRACK choice level parameter
            }
        }
        ___BACKTRACK_PARAM(param1); // BACKTRACK Stage level param
    }
}
```

Template for Maze coodinates :
```This can be extended to 8 direction choices, even for Knight moves```

```java
class MazeProblem {
    ///////////////////////////////////////////////////////////////////
    // 4 Direction offsets
    static final int ROW_OFFSETS = new int[]{0, 1, 0, -1};
    static final int COL_OFFSETS = new int[]{1, 0, -1, 0};

    // 8 Direction offsets (last 4 offset additions)
    static final int ROW_OFFSETS_EIGHT_CHOICES = new int[]{0, 1, 0, -1, -1, -1, 1, 1};
    static final int COL_OFFSETS_EIGHT_CHOICES = new int[]{1, 0, -1, 0, -1, 1, -1, 1};

    ////////////////////////////////////////////////////////////////////
    ArrayList<Coord> getValidChoices(int[][] maze, int rrr, int ccc, int r, int c) {
        // Choices (coord) to be returned
        ArrayList<Coord> choices = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int x = r + ROW_OFFSET[i]; // ith Index for ROW offset
            int y = c + COL_OFFSET[i]; // ith Index for COL offset
            // Single validation check for position
            if (x > -0 && x < rrr && y >= 0 && y < ccc)
                choices.add(new Coord(x, y)); // Add to valid choice
        }
        return choices; // return choices
    }
}

```

#### Known Problems (Remember list)

Maze:

```
- Maze Games-- Longest Possible Route in a Matrix with Hurdles
- Maze Games--Rat in maze
- Maze Games--Chess N Queen
- Maze Games--Chess Knight tour
- Maze Games--Suduko
- Maze Games--Work Break
- Maze Games--Search word in 8 directions
```

Arrays:

```
- Subset-- Partition of a set into K subsets with equal sum
- Subset-- Combination Sums (DP ??)
- Subset-- Palindrome Partitioning (DP ??_
- Subset--All subsets
- Subset-- All permutations of string
- Subset-- All permutations of Phone Letter digits
```

Graph:

```
- Possibility Check-- M-coloring problem
- Possibility Check-- Find hamilton Cycles (If exist, count and print all)
- Possibility Check-- Print ALL longest common sub-sequences in lexicographical order (DP returns number for SINGLE optimal sol, but backtracking gets mnore than one actual solutions)
```

---

## 5. Theme ==> Trees (Data Structure)

#### Mode of Communication:

1. Return value from the child
2. Passed value from parent and older ancestors
3. IN/OUT parameter to keep track of node's path and state

#### Traversal (Choose it wisely):

1. **PreOrder (Backtracking DNA)** (mostly for path+backtracking problems): If you want to do Something "FIRST" before
   trying out left and
   right
   subtree
2. Inorder: For sorting and L--R traversal
3. Reverse Inorder -- For K largest Element
4. PostOrder: If you want to explore LEFT and RIGHT and take decision for ROOT

#### Useful DataStructures:

1. ArrayList or ArrayList<ArrayList> (Path tracking with backtracking technique)
2. Stack: If you need to process the state in LIFO manner
3. Queue: For level order traversal
4. Multiple stacks: Zig zag

#### Nested traversals

**Yes** you would need in in most of the problems
(if you want to take decision on PREVISITED subtree based on other subtree's/Parent's return state.)
e.g. ```BST_BurnTree```

#### Interesting Problems

**Problem: kSum Paths (How paths are being processed) ==>**

![](http://hevi.info/wp-content/uploads/2017/03/Ekran-Resmi-2017-03-22-02.57.34.png)

- PreOrder to add node to path
- Backtrack and process path **after recursive children** calls. (Same as backtracking algo)

```java
  class KSumPath {
    static void printKSumPaths(Node root, ArrayList<Integer> pathFromRoot, int k) {
        // Step1 ------------- NODE ==> Base case
        if (root == null) {
            return;
        }

        // Step2------------- Make choice(add to path and recurse)
        pathFromRoot.add(root.data);

        // Step3------------- RECURSE-Preorder----- LEFT
        printKSumPaths(root.left, pathFromRoot, k);

        // Step4------------- RECURSE-Preorder-----RIGHT
        printKSumPaths(root.right, pathFromRoot, k);

        // Step5------------- Process path from root to current node
        int sum = 0;
        for (int i = pathFromRoot.size() - 1; i >= 0; i--) {
            sum += pathFromRoot.get(i);

            if (k == sum) {
                count += 1;
            }
        }
        // Step6------------- Backtrack
        pathFromRoot.remove(pathFromRoot.size() - 1);
    }
}

```

**Problem: Burn Tree (PreOrder traversal and Special processing for node on return path) ==>**

- Burn Tree ([GFG Link](https://www.geeksforgeeks.org/burn-the-binary-tree-starting-from-the-target-node/amp/))
- For a trigger node ==> Burn its tree and return true to let the caller know that burning to be trigerred
- For any other node higher up (e.g. root), revisit SOME nodes in opossite side of trigger node.

```java
  public class BST_BurnTree {

    public static void main(String args[]) {
        MyBinarySearchTree bst = new MyBinarySearchTree();
        bst.insertAll(new int[]{10, 5, 4, 7, 20, 16, 15, 17, 22, 24});
        burn(bst.root, 16);
    }

    /**
     * 1. Preorder traversal
     * 2. Special treatment for found node
     * 3. How to spread to parent (communicate with parent and siblings)
     * 4. How to spread further (Multiple preOrder VISITS for SOME nodes)
     * GFG : https://www.geeksforgeeks.org/burn-the-binary-tree-starting-from-the-target-node/amp/
     * My solution is simpler and space+time efficient than GFG
     *
     * @return True(burned) false(did not find hence did not fired tree)
     */

    public static boolean burn(MyNode node, int s) {
        //====== Preorder-- Invalid Case Check ======//
        if (node == null) {
            return false;
        }
        MyLogger.info("Visit: " + node.getData()); // VISIT TYPE1 -- Node was visited in find operation (FOR ALL)
        //====== Preorder-- Check and Visit ======//
        if (node.getData() == s) {
            // Found the trigger; Burn it and its both subtrees
            // Part1-- Burn this node and L,R subtrees
            burnDown(node);
            // Let immediate caller know that fire has started
            return true;
        }

        //====== Preorder-- LEFT Recurse ======//
        if (burn(node.getLeft(), s)) {
            // Fire came from immediate left since it returned true
            //Burn self
            MyLogger.info("Burn: " + node.getData());
            // Burn RIGHT subtree and return true(TRUE means FIRE)
            burnDown(node.getRight());
            return true;
        }

        //====== Preorder-- RIGHT Recurse ======//
        if (burn(node.getRight(), s)) {
            // Fire came from immediate right since it returned true
            //Burn self
            MyLogger.info("Burn: " + node.getData());
            // Burn LEFT subtree and return true(TRUE means FIRE)
            burnDown(node.getLeft());
            return true;
        }
        // Trigger was not found anywhere; Just return false ( No need to burn this tree)
        return false;
    }

    /**
     * Another Preorder function for special operation
     * @param node Subtree root to be processed
     */
    private static void burnDown(MyNode node) {
        if (node == null) {
            return;
        }
        MyLogger.info("Visit(Again): " + node.getData()); // VISIT TYPE2 -- Node was visited AGAIN for burning (FOR FEW)
        //Preorder (root, left, right)
        MyLogger.info("Burn: " + node.getData());
        burnDown(node.getLeft());
        burnDown(node.getRight());
    }

}

```

#### Heap (Max-Min-Median)

Refer algo.monster

- Array implementation is common
- ```iLeftChild = 2*iParent + 1``` and ```iRightChild = 2*iParent*2```
- ```iParent = floor(iChild/2)```

---

## 6. Theme ==> Trie (N-ary tree as PRE-processed dictionary)

Refer algo.moster for additional trie problems.

![](https://media.geeksforgeeks.org/wp-content/uploads/20220828232752/Triedatastructure1.png)

##### Summary

- Considerations ==> **Words, Search, Distinct count, Occurances, Prefix search**
- Search Time:
    - **Without** trie: ```O(N*K)``` find all the strings
    - **With** trie: ```O(K)``` find all the chars of current string only. (Super fast)
- When to use:
    - **Write once, read multiple time** ; Fastest strings set lookup (Similar to elastic search)
- How to use:
    - For most of the interview ques; **Preprocess** input (aka build trie)
    - Then Lookup
- Root Node:
    - Always is **initialised with NO keys** at all
    - Represents **0th index** of any string
- Word Node (**2 types**):
    - Type1: Internal ( with children keys)
    - Type2: Leaf Node( without children keys)
- Leaf Node:
    - Node **with 0 keys**
    - All LEAF nodes are words BUT All word nodes not necessarily Leaf Nodes

- **class TrieNode**

```java
// N-ary Tree
class TrieNode {
    HashMap<String, MyTrieNode> mapping; // Key with Children Nodes
    //Character[26]; // (ch-'a') is also another way for Alphabetic only trie(not scalable for other chars/nums)
    boolean isEndOfWord; // Indicates End of word node
    int numOccurances;
}
```

**PROBLEM 1: Implement Trie**

```java
class Trie {
    ///////////////// Insert(keep track of node visits to know the prefix count //////////////
    public void insert(String str) {
        // Start from root and add key at all levels
        if (str != null) {
            MyTrieNode node = root; // 1. Initial state
            // 2. Update the trie
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // 2.1 Add mapping at given level ; If not exist 
                if (!node.mapping.containsKey("" + ch)) {
                    node.mapping.put("" + ch, new MyTrieNode());
                }
                // 2.2 Get the next level node to lookup next level key (aka char)
                node = node.mapping.get("" + ch); // Next level node
            }
            // 3. Word level stats
            node.isEndOfWord = true;
        }
    }

    ///////////////// Search //////////////
    public void searchWordOrPrefix(String str) {
        if (str != null) {
            return false;
        }
        MyTrieNode node = root; // 1. Initial state
        for (int i = 0; i < str.length(); i++) {
            String key = "" + ch;
            if (node.mapping.containsKey(key)) {
                node = node.mappings.get(key);
            } else {
                return false;
            }
        }
        return true;
    }

    ///////////////// Count Distinct Words //////////////
    public int countDistinctWordsBFS() {
        LinkedList<MyTrieNode> queue = new LinkedList<>();

        //1. Initial State: Enqueu ROOT keys
        for (Map.Entry<String, MyTrieNode> entry :
                root.mapping.entrySet()) {
            queue.add(entry.getValue());
        }
        // IMPORTANT: Slight variation includes the Initial state being prefix keys.
        // 2. Loop until queue is empty ( O(NxK) )
        int count = 0;
        while (!queue.isEmpty()) {
            // 2.1 Deque
            MyTrieNode node = queue.poll();
            // 2.2 Increment count if word?
            if (node.isEndOfWord)
                count += 1;
            // 2.3 Enque children keys
            if (node.mapping.entrySet().size() > 0) {
                queue.addAll(node.mapping.values()); // Bulk enque
            }
        }
        //3. return count
        return count;
    }
}
```

##### Popular Problems

- **Count** **words**: (INSERT ==> ++ maintain the count on the go)
- **Count** **Most** **Frequent** Word: (INSERT ==> ++ maintain the maxCount on the go)
- Count **Kth** **Frequent** Word: (INSERT ==> ++ maintain the HEAP of TrieNodes (with occurance as key param)
- **Find** **largest** **Dictionary** **word** from **input string subsequences**. (Trie for dict and DP/Pointers for
  subsequence)
- Search Word/**Prefix** ==> (SEARCH)
- Count **Words** with **Prefix** ==> (SEARCH -- BFS -- Start BFS from end of prefix)
- Work **Break** **Problem** (String and Dict) ==> Build **trie** of **dict** and **use** **DP** to **solve** it

##### USAGES

- Phone **Dictionary**, **Prefix** **tree**, String **lookup**
- [Common Trie Interview questions:](https://www.geeksforgeeks.org/tag/trie/)

---

## 7. Theme ==> Arrays and Strings

##### Tips

**===== [Catgory] LocalMaxima Minima to reduce O(N^2) to O(N): =====**
**Problem: Stock Buy and Sell (Once and Multiple times) to Maximize profit**

```java
public class LOCAL_MAX_MIN_MaxStockSale {
    ////////////////////////////////////////////////////////////////////////////

    /**
     * PROBLEM 1: Buy and Sale just ONCE to maximize profit
     */
    static int getMaxProfitForSingleTransaction(int arr[], int arr_size) {
        int max_diff = arr[1] - arr[0];
        int min_element = arr[0];
        int i;
        // O(N) loop to detect MIN element and MAX Diff
        for (i = 1; i < arr_size; i++) {
            if (arr[i] - min_element > max_diff)
                max_diff = arr[i] - min_element; // Max diff with local Min
            if (arr[i] < min_element)
                min_element = arr[i]; // Update local Min
        }
        return max_diff;
    }

    ////////////////////////////////////////////////////////////////////////////

    /**
     * PROBLEM 2: Buy and Sale MULTIPLE times maximize profit
     *
     * Search for Local MINIMA and then only LOCAL MAXIMA (This is one interval)
     * Keep on repeating the steps. 
     *
     * Solution = Multi Transaction Profit = SUM_ALL(Interval(sale-buy))
     */
    static class Interval {
        int buy, sell;
    }

    static void getMaxProfitForMultipleTransactions(int price[], int n) {
        // Prices must be given for at least two days
        if (n == 1)
            return;

        int count = 0;

        // Solution array
        ArrayList<Interval> sol = new ArrayList<>();

        // Traverse through given price array
        int i = 0;
        while (i < n - 1) {
            // ---------1. Find Local Minima (Try visiting each index and get local minima)
            while ((i < n - 1) && (price[i] > price[i + 1]))
                i++;
            // If we reached the end, break as no further solution possible
            if (i == n - 1)
                break;

            Interval e = new Interval();
            // Store the index of minima
            e.buy = i;

            i++; // Move to next

            //--------- 2. Find Local Maxima.
            while ((i < n) && (price[i - 1] < price[i]))
                i++;
            // Store the index of maxima
            e.sell = i - 1;
            sol.add(e);
        }

        // print solution
        if (sol.size() == 0)
            System.out.println(
                    "There is no day when buying the stock "
                            + "will make profit");
        else {
            for (Interval intv : sol)
                System.out.println(
                        "Buy on day: " + intv.buy + " | " + "Sell on day : " + intv.sell);

        }
    }

    public static void main(String args[]) {

        // stock prices on consecutive days
        int price[] = {100, 180, 260, 310, 40, 695, 535};
        int n = price.length;
        System.out.println("================ Input: " + Arrays.toString(price) + "================");
        System.out.println("Buy and sell ONCE. ------------------");
        System.out.println("Max Stock Price:" + getMaxProfitForSingleTransaction(price, n));
        System.out.println("Buy and sell MULTIPLE times. ------------------");
        getMaxProfitForMultipleTransactions(price, n);
    }
}
```

**Index Handling:**

- **Loops**: Forget to increment index, index value after full loop
    - BFS loop: ```Check element if visited before before queueing or recursing```
- **Index arithmetic**:  -- and ++ and bounds
- **Optimization**: Inputs Index bounds checks before exploring directions
- **2D index**: We need it in queue, passing across calls, store in list

**DS/Maze:**

- Parameters: ```<arr, mm, nn, i, j>```
- Directions:
    - Replicated logic with slight for and if conditions
    - Max directions: **4 or 8**
- Graph (Maze):
    - Graph is NOT necessarily maze but maze is graph; Hence graph problems are applicable for MAZE too.
    - Graph Adj matrix is DIFFERENT than maze representation
    - In maze, graph has by default MIN 3 or MAX 8 adj nodes with 1 as default implicit distance.

---

## 8. Theme ==> Misc DSA

### Arrays ---------------------------------------------------------------------------------------

##### DataTypes and nature

- **-ve numbers** influences certain algorithms in -ve way; check before proceeding
- Repeated Arithmetic(add/subtract/multiply/divide) could lead to **Overflow/underflow** ; Always use **bigger**
  datatypes for results.
    - Int Max Limit ```2147483647``` reached for ```int sum = (Integer.MAX_VALUE-5)+ 5``` as **warning** for next
      operations.
    - Int **overflow** BUG already introduced after adding 3 to Int.MAX_VALUE leading to ```-2147483646```
      as part of this ```int sum = (Integer.MAX_VALUE)+3```
    - **Correct Way** is to use **long** datatype for sum to get ```2147483648``` as part
      of ```long sum = (Integer.MAX_VALUE-5)+ 5```

##### Index Handling and Base cases

- **Handle all HAPPY and SAD exit** cases for any loop.
- Introduce **have Index bound checks** ```even though APPEAR REDUNDANT```. Efficiency comes
  after accuracy.
- Add **base cases** (aka main input cases) in the **very beginning** before complex
  processing
- Add **edge conditions**; e.g. binary search with one or two elements ranges--- i=9|j=9 ,
  i=10,j=11)

##### Preprocessing Use-Cases (WONT increase time complexity)

- **Update PreProcessed cache/store**: O(N) time for single pass to populate preprocessed data (e.g. treemap, int[],
  bool[] ,
  int etc.)
- **Input Validation** : E.g. Paranthesis check using stack before actual parsing/decoding
- **Manipulate existing data**: ML Standardized range to 0-1 interval.

### String ---------------------------------------------------------------------------------------

- String Functions to avoid confusion

```java
  class Solution {
    private static void stringUtils() {
        String str1 = "01234";
        // CHAR AT
        str1.charAt(1) == '1';
        str1.charAt(3) == '3';
        // SUBSTRING
        StringUtils.equals(str1.substring(3, 4), "3"); // Extract Single character at i by s.substring(i,i+1); 
        StringUtils.equals(str1.substring(4, 5), "4"); // Extract Single character at i by s.substring(i,i+1); 
        StringUtils.equals(str1.substring(0, 2), "01"); // Extract k character at i by s.substring(i,i+k+1) ==> s.substring(0,0+1+1) ==> s.substring(0,2) ==> "01"
        StringUtils.equals(str1.substring(2, 4), "23"); // Same as above
        StringUtils.equals(str1.substring(0, str1.length()), str1); // Dont worry about index out of bound for referring s.length() index as endIndex
        //INDEX OF and LAST INDEX OF
        String str2 = "1[[22]]33"; // Input String
        str2.indexOf('[') == 1; // Returns first char occurance index (use for pranthesis matching--open paranthesis)
        str2.lastIndexOf(']') == 6; //Returns last char occurance index (use for pranthesis matching--close paranthesis)
    }
}

```

- All primitive types including , String are pass BY VALUE. Safe to pass without worring.
- Substring usage== > **endIndex + 1**  to include endIndex char
- e.g. ```"aaBBBcc".substring(2, 4+1)``` to get **BBB**

-- **PROBLEM--Decode String**

```java
public class ServiceNow_DecodeString {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online


    public static void main(String[] args) {
        //System.out.println(decode("a2[b]")); //Worked
        // System.out.println(decode("A2[b2[ab]]"));// Worked
        System.out.println(decode("A2[b2[ab]cc]dd"));// Worked
    }


    /**
     Core method
     */
    static String decode(String s) {
        String decodedString = "";
        if (s.isEmpty() || s.length() == 1)
            return s;
        // CASE1-----Process Number and remaining string
        if (StringUtils.isNumeric(s.substring(0, 1))) {

            String numStr = "";
            int i = 0;
            while (StringUtils.isNumeric("" + s.charAt(i))) {
                numStr += s.charAt(i);
                i++;
            }
            if (numStr.length() > 0) {
                int number = strToNum(numStr);
                // Get the inner String and decode
                // Recurse
                String d = decode(s.substring(i + 1, getIndexOfClosingBracket(s))); //Recurse1 --for inner normal substring
                for (int j = 0; j < number; j++) {
                    decodedString += (d + ""); // Append multiple occurances
                }
            }
            return decodedString + decode(s.substring(getIndexOfClosingBracket(s) + 1)); //Recurse2 --for substring after this special one
        }
        // CASE2-----Process Normal String
        else {
            // Normal Characters
            int i = 0;
            // CASE-----Simple characters
            while (i < s.length() && !StringUtils.isNumeric("" + s.charAt(i)) && s.charAt(i) != '[' && s.charAt(i) != ']') {
                decodedString += (s.charAt(i) + "");
                i++;
            }
            return decodedString + decode(s.substring(i)); //Recurse3 -- for special substring
        }
    }


    static int strToNum(String s) {
        return Integer.valueOf(s);
    }

    static int getIndexOfClosingBracket(String s) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ']') {
                return i;
            }
        }
        return -1;
    }
}
```

- **PROBLEM--Word Break (can String be broken into Dict words)**
  More like a DP problem. If all TRUE then return TRUE.

```java
public class Solution {
    static boolean wordBreak(List<String> wordList,
                             String word) {
        // If the word is empty, it can be broken down into an empty list of words
        if (word.isEmpty()) {
            return true;
        }

        int wordLen = word.length();

        // Check if the word can be broken down into words from the wordList
        for (int i = 1; i <= wordLen; ++i) {
            String prefix = word.substring(0, i);
            if (wordList.contains(prefix) && wordBreak(wordList, word.substring(i))) {
                return true;
            }
        }
        return false; //No luck
    }
}


```

### Stack and Queue using LinkedList(Java)  ---------------------------------------------------------------------------------------

```
[1, 2, 3, 4] |  STACK_PUSH/QUEUE_ENQUE::  add(): true | [1, 2, 3, 4, 5]

------------------QUEUE (Remove [FRONT|||||||REAR] Add)--------------------------
[1, 2, 3, 4, 5] |  QUEUE_DEQUE::remove(): 1 | [2, 3, 4, 5]
[2, 3, 4, 5] |  QUEUE_PEEK::peek(): 2 | [2, 3, 4, 5]

------------------STACK( [|||||||REAR] Add/Remove)--------------------------
[1, 2, 3, 4, 5] |  STACK_POP::removeLast(): 5 | [1, 2, 3, 4]
[1, 2, 3, 4] |  STACK_PEEK_TOP::peekLast(): 4 | [1, 2, 3, 4]

------------------Add in reverse order..Insertion sort type------------------------
[4, 3, 2, 1] ---------- 1,2,3,4 added using addFirst()
```

### PRIMITIVE TYPES e.g Integer (Java Wrapper Classes) ---------------------------------------------------------------------------------------

**[API guide for java.lang.Integer](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/Integer.html)**

- **Binary String of Int**

```java
class Solution {
    public static void IntegerUtils() {
        String binString = Integer.toBinaryString(i);
        Integer i = Integer.parseInt(str);
        Integer i = Integer.decode(str); // Decode any string bin, hex, etc.
    }
}
```

--- 

## 9. Theme ==> BitMagic (solve at least 10 problems)

refer algo.monster

---

## 10. Theme ==> Binary Search

### TYPE1 == Sorted Input

================================================

**Code Template**

```java
class Solution {
    // Return index of found element or -1 if not found
    int isFound(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1; // Default not found

        // Note: '<=' is important to cover all the edge cases
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            elseif(target < arr[mid]) {
                // Answer lies on left side, update right
                right = mid - 1;
            }
            else{
                // Answer lies on right side, update left
                left = mid + 1;
            }
        }
        return ans;
    }
}
```

##### PROBLEM: Find Non-repeating number

[1, 1, 2, 2, 3, 4, 4, 5, 5] ---->

Input: [1, 1, 2, 2, 3, 4, 4, 5, 5]

Output: 3

##### PROBLEM: Find Closest Higher Number than target

Input: arr = [1, 3, 3, 5, 8, 8, 10]  target = 3

Output: 5

##### PROBLEM: Find 1st occurance of target

Input: arr = [1, 3, 3, 3, 3, 6, 10, 10, 10, 100]  target = 3

Output: 1

##### PROBLEM: Square root estimation

Input: 16 | Output: 4

Input: 8 | Output: 2

##### PROBLEM: Find Minimum element in rotated sorted array

Input: [30, 40, 50, 10, 20]

Output: 3

Hint- Check the side of the rotated part:

- if arr[mid] > arr[right] --> left = mid+1
- if arr[mid] < arr[right] --> right = mid-1

Also handle edge case carefully using 3 indices i, i-1, i+1

##### PROBLEM: Search target in rotated sorted array

Input: [30, 40, 50, 10, 20] Target 40

Output: 1

Input: [30, 40, 50, 10, 20] Target 800

Output: -1

##### PROBLEM: Find the Peak of mountain array

Input: [1,2,3,40, 35,7,4]
Output: 40

- Follow same technique as rotated array..
- Decision to move left and right based on ```increasing/decreasing flow mid index```

### TYPE2 == Binary Search on Answer (Find possible answer range min--max and do bin search)
================================================
**Algorithm**

- Here we dont have any sorted input but intuition is there is some [min, max] range of possible solutions.
- (In case of **Minimization** problem)
    - We can get MAX result (Which could be reduced/optimized further), which is **right** of binary search.
    - We can get MIN result, which is **left** of binary search
- (In case of **Maximization** problem)
    - We can get MIN result (Which could be increased/optimized further), which is **left** of binary search.
    - We can get MAX result, which is **right** of binary search
- In the process of binary search , we check ```bool canSolve(input1, input2, mid)```
- If ```canSolve()``` returns true, we take either of left/right update decision depending on Minimize/Maximize
  objective.
- We store best possible answer, ```ans = mid``` and return it at the end after trying out full binary search

**Code Template**

```java
class Solution {
    //////////////////////////////////////////////////////////////////////////////////////////
    // Return min time required to read all newspapers by given set of workers (without exceeding the available worker limit)
    int getMinHoursToReadAllNewsPapersWithAvailableWorkers(int[] readTimesOfNewsPapers, int availableWorkers) {
        // define range
        int minTime = getMax(readTimesOfNewsPapers); // MIN time by N workers,where 1 worker reading ONE newspaper PARALLELY
        int maxTime = getSum(readTimesOfNewsPapers); // MAX time by 1 worker1,where 1 worker reading ALL newspaper SEQUENCIALLY

        int left = minTime;
        int right = maxTime;

        int ansMinTime = maxTime; // Minimization problem

        // Note: '<=' is important to cover all the edge cases
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // This function validates constraints and helps us refine solution without violating thoe constarints.
            if (canReadWithoutViolatingAvailableWorkers(readTimesOfNewsPapers, availableWorkers)) {
                ansMinTime = mid;
                // Shift left to see we can reduce time in time range
                right = mid - 1;
            } else {
                // shift towards right since current time violates available workers condition (min read time with MORE than available workers is NOT acceptable)
                left = mid + 1;
            }
        }
        // We have got the BEST solution after tyring all the options using binary search over possible time range  
        return ansMinTime;
    }

    //////////////////////////////////////////////////////////////////////////////////////////
    boolean canReadWithoutUsingAvailableWorkers(int[] readTimesOfNewsPapers, int availableWorkers, int timeLimitMid) {
        int singleWorkerTime = 0;
        int actuallyUsedWorkers = 0;
        // Keep track of time spent by single worker and update required workers as time exceeds available Time.
        for (int onePaperReadTime : readTimesOfNewsPapers) {
            if (singleWorkerTime + onePaperReadTime > timeLimitMid) {
                singleWorkerTime = 0; // Reset for next worker
                actuallyUsedWorkers++; // Update utilized capacity
            }
            singleWorkerTime += onePaperReadTime;
        }
        // Corner case
        if (singleWorkerTime >= 0)
            actuallyUsedWorkers++;
        // Utilized capacity is less than max capacity then utilize more in BinSearch
        return availableWorkers >= actuallyUsedWorkers; // TRUE-- job was performed with given or less number of workers..We can reduce timeLimit further as optimization
    }
}

```

### PROBLEM: Find First TRUE in sorted boolean array (Similar to above algo)

Input: [false, false, true, true, true]

output: 2

##### PROBLEM: Find MIN HOURS to read all NESPAPERW with FIXED number of WORKERS

You've begun your new job to organize newspapers. Each morning, you are to separate the newspapers into smaller piles
and assign each pile to a co-worker. This way, your co-workers can read through the newspapers and examine their
contents simultaneously.

What is the minimum amount of time it would take to have your coworkers go through all the newspapers? That is, if you
optimize the distribution of newspapers, what is the longest reading time among all piles?

```
Input: newspapers_read_times = [7,2,5,10,8], num_coworkers = 2
Output: 18

```

Hint: Find the min and max hours range based on intuition. Optimize it until numWorkers <= num_coworkers

- TRUE-- If we can increase workers and reduce hours without violating num_coworkers limit
- FALSE-- If we can NOT increase workers and reduce hours without violating num_coworkers limit
- Return the stored best ealier MID value as ANS

##### PROBLEM: Eat banana with with OPTIMAL speed to utilize FULL AVAILABLE hours

Problem Description:

```
Koko loves to eat bananas. There are n piles of bananas, the **ith pile has piles[i] bananas**. The guards have gone and
will come back in h hours
Koko can decide her **bananas-per-hour** eating speed of **k**.
Each hour, she chooses some pile of bananas and eats k bananas
from that pile. If the pile has less than k bananas**, she eats **all of them instead** and will **not eat any more
bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k (Speed per hour) such that she can eat all the bananas within h hours.
```

Examples:

```
Example 1:
Input: piles = [3,6,7,11], h = 8
Output: 4

Example 2:
Input: piles = [30,11,23,4,20], h = 5
Output: 30

Example 3:
Input: piles = [30,11,23,4,20], h = 6
Output: 23
```

Constraints:

```
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
```

Solution:

```
consider example1.
Input: piles = [3,6,7,11], h = 8
Output: 4

K cases =====>
We know best case would be max pile size and worst case as min pile size.

- (MAX k) Max Pile Size = 11 ---> Num Hours 8 --> hours = 4 (Valid yet too fast..reduce speed , we still have 4 hours)
- (INVALID-MIN) Min Pile Size = 3 ---> Num Hours 8 --> hours = 11 (Invalid .. watchman came before all bananas eaten)
- (VALID-MIN k) Expected Balanaced speed k = 4 --> hours = 8 (All finished just before watchman came)
```

Algorithm:

```
- Init LEFT=3, RIGHT=11; //Mid will be k
- LOOP-BinSearch
    - Keep on calculating MID bin seach until canFinishReturns(piles,h, K=MID) TRUE
    - ANS=MID
    - See if we can reduce further k if valid
    - Exit upon finding no further solution
- return ANS
```

Core function:

```java
class Solution {
    boolean canFinishEating(List<Integer> pile, int h, int k) {
        int numBananas = 0;
        int numHours = 0;
        // Reduce hours spent for each K
        // One chunk in one hour
        for (Integer p : piles) {
            numHours += Math.ceil(p / k);
        }
        return numHours <= h;
    }
}
```

---

## 11. Theme ==> TWO POINTERS, SLIDING WINDOWS

##### Types of problems

- **Same Direction**
    - find duplicates in sorted array
    - Middle of linked list
    - Move zeros to end
- **Opposite direction**
    - Two sum sorted
    - Valid Palindrome
- **Sliding Window**
    - Subarray sum
    - Find all N-grams of word in text
    - Longest substring without repeating char
    - Longest subarray with sum <= target
    - Shortest subarray which sum is at least equals target
    - Least Number of cards to make pair
        - ```For example, given cards = [3, 4, 2, 3, 4, 7], then picking up [3, 4, 2, 3] makes a pair of 3s and picking up [4, 2, 3, 4] matches two 4s. We need 4 consecutive cards to match a pair of 3s and 4 consecutive cards to match 4s, so you need to pick up at least 4 cards to make a match.```
- **Prefix Sum**
    - Understanding how to manipulate subarrays is key to mastering many algorithms.
    - Used in **SUBARRAY SUM** problems

##### Templates

**Fixed Size Window (e.g. min, max, distinct , MEX, SUM)**

```java
class FixedSizeWindow {
    public static void solution(int[] arr, int WIN_SIZE) {
        int start = 0, end = 0;
        TreeSet<Integer> window; // Get (min/Max/Distinct/All)
        // STEP1 ----- FIRST Window Processing
        for (end = start; end < start + WIN_SIZE; end++) {
            window.add(arr[end]);
            // Do something additional per window here e.g. min, max track
        }

        // STEP2.1----- FIRST Window Result
        ProcessWindowAndPrintStats(window.first(), window.last(), windows.size()); // Min, max, count

        // STEP2.2-----Increment only start pointer
        start++;

        // STEP3----- NEXT Sliding window(S)
        while (end < arr.length) {
            // STEP3.1 ---- Remove start-1 effect
            window.remove(arr[start - 1]); // Make sure to remove start-1 
            // STEP3.2 ---- Add start-1 Effect
            window.add(arr[end]);
            // STEP3.3 ---- Window Stat
            ProcessWindowAndPrintStats(window.first(), window.last(), windows.size()); // Min, max, count
        }
        // STEP4: ------ Return something if applicable
    }
}
```

##### Arrays and String Problems

- Sequencial Storage viz. string array
- Reduces time cmplexity from O(N2) to O(N)
- Types
    - BOTH FORWARD: i1 fast and i2 Slow
    - INC DEC : i1 inc and i2 dec
    - BOTH BACKWARD: i1 fast dec, i2 slow dec

**Problem: Sliding Window Find N-grams**

```java
package com.hiru.dsa.java.ROUGHWORK.TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNGramsOfWordInLargeText {

    public static void main(String args[]) {
        System.out.println(getNGrams("nabanabannaabbaanana", "banana"));
        //System.out.println(getNGrams("wubudubuwubuthattrue", "ubutu"));


    }


    /**
     * BIG MISTAKES =====================================
     * 1. Assuming word does not have DUPLICATES :-(
     * 2. Used hashmap and list and adding logic
     * 3. Did not pay attension to sliding window template:
     * ..........1. Process First window and See if valid
     * ..........2. Start from window_size+1 until text.size
     * ..........3. Add (curr) char and remove char at (curr-window_size) position
     * ..........4. Compare the BASELINE Frequencies with the WINDOW frequencies
     * 4. Classic typos
     *
     * LEARNINGS =====================================
     * 1. Dont assume but if possible; Use int[26] array for storing char specific information. Its simpler than multivalue hashmap/lists etc.
     * 2. ch-'a' returns 0-25 integer values for a-z characters
     * 3. Just ++ or -- value at given char position for current TEXT char
     */
    public static List<Integer> getNGrams(String text, String word) {
        List<Integer> ans = new ArrayList<>();
        if (word != null && word.length() > 0 && text.length() >= word.length()) {
            // 1. PREPROCESSING----Populate word frequency array
            int[] BASELINE_FREQ = new int[26];

            // 2. Update BASELINE and first window frequencies (update both baseline and first window)
            int[] WINDOW_FREQ = new int[26];
            for (int k = 0; k < word.length(); k++) {
                BASELINE_FREQ[word.charAt(k) - 'a']++;
                WINDOW_FREQ[text.charAt(k) - 'a']++;
            }
            // 3. Check first success ?
            if (Arrays.equals(BASELINE_FREQ, WINDOW_FREQ))
                ans.add(0);

            //4. Iterate OVER all SLIDING WINDOW let say of size THREE:   [0, 1, 2, [[[3, 4, 5]]], 6, 7, 8, 9]
            // remove frequency of 3 and add frequency of 6
            // Check valid solution after each sliding window O(K*K*N)
            for (int iNextCharOutWin = word.length(); iNextCharOutWin < text.length(); iNextCharOutWin++) {
                // Step1 -- Remove ch1 freq ....ch1[WINDOWS]ch2
                WINDOW_FREQ[text.charAt(iNextCharOutWin - word.length()) - 'a']--; // SLIDING WIN LOGIC: DEC first char frequency
                // Step2 -- Add ch2 freq ....ch1[WINDOWS]ch2
                WINDOW_FREQ[text.charAt(iNextCharOutWin) - 'a']++; // SLIDING WIN LOGIC: INC curr char frequency
                // Step3 -- Comparison (K*K)
                if (Arrays.equals(BASELINE_FREQ, WINDOW_FREQ))
                    ans.add(iNextCharOutWin - word.length() + 1); // ***SUCCESS-- Solution found
            }
        }
        return ans; // Return indices where anagram was found
    }


}
```

##### Prefix SUM vs Sliding Window Techniques

- Both prefix sum and sliding window are techniques to solve subarray-related problems. The choice between them depends
  on
  the nature of the problem:
- Prefix sum is generally used for problems that ask about the sum of subarrays, as it allows for constant-time range
  sum
  queries.
- The sliding window is typically utilized for problems related to contiguous subarrays of a certain size or condition,
  e.g., maximum sum of subarrays of size 'k'.
- Variation -- Suffix Sum

**Problem: Prefix Sum**
Given an array of integers and an integer target,
find a (SINGLE) subarray that sums to target and return the start and end
indices of the subarray.

```java
/**
 * Input: 1 3 -3 8 5 7  target: 5
 * Output: Indexes [2,4) ......values -3 8
 *
 * Mathematical Derivation: **** **** **** 
 * **** SUM(0-N) - SUM(0-M)  = target
 * **** SUM(0-N) - target = SUM(0-M)
 * **** currCumSum-target = pastCumSum
 * **** **** **** **** **** **** **** ****
 */
class Solution {
    public static List<Integer> subarraySum(List<Integer> arr, int target) {
        HashMap<Integer, Integer> prefixSums = new HashMap<>();

        prefixSums.put(0, 0);
        int curSum = 0;
        //1---------- Calculate prefix sum ON THE FLY
        for (int i = 0; i < arr.size(); i++) {
            //2.1---------- Caculate Current CUMULATIVE Sum
            curSum += arr.get(i);
            //2.2---------- Get compliment of cum sum with target
            int complement = curSum - target;
            // LOGIC: complement is prefix sum for some PAST index
            // After adding target to that sum we get curr cumSum
            // Which means we have got range [iPastPrfixSum, i+1)
            //2.3---------- Check if compliment exist in pre-populated prefix sums so far
            if (prefixSums.containsKey(complement)) {
                //2.4---------- TRICKY: Return mapping of <index_of_compliment, i+1>
                return List.of(prefixSums.get(complement), i + 1);
            }
            //3---------- Update Prefix Sum (Sum to index mapping)
            prefixSums.put(curSum, i + 1);
        }
        return null;
    }
}
```

# References

### Internal Repositories

- [Topic Wise Notes](https://github.com/yash-hiru/Project-DSA-Repo/tree/main/src/com/hiru/dsa/md)

### Resources

Just go through them before interview to **Refresh your cache**

- [PAID--Algo Monster Coding Patterns Illustrations](https://algo.monster/dashboard)
- [PAID--GeeksforGeeks--Questions with Answers ALL problems without restrictions](www.geeksforgeeks.com)
- [How to rock Coding Interview](https://www.freecodecamp.org/news/coding-interviews-for-dummies-5e048933b82b/)
- [Geekforgeeks--Google Question Bank](https://www.geeksforgeeks.org/google-interview-preparation/)
  </span>

