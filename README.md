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

Most of the problem belongs to some category or theme with minor tweaks viz. as Datatype, constraints, conditions,
names.
Identifying the right category saves time, gives us skeleton and also boost confidence since end to end code is ready.

**Quote**

```
Do not worry about things like whether you will get the job, why my friends are doing better than me, etc. 
Focus on the problem in front of you. Life is a single-player game. 
You are competing against only yourself. 
Focus on the game and you will do better.
```

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
    - Second Draft:
        - Generalize, Optimize, bug fix
    - Thidrd Draft (If asked and time permits)
        - Scale (If Possible and asked)
- **[5 mins]** Self and Peer Review, Edge cases, Other suggestions
- ```-------------------------------------------------------```
- **[5 mins]** Mention extra areas if improvement and few additions.
- ```-------------------------------------------------------```

---

## Coding Problem Generic Patterns

### Intro

- **Quote:**
  ```The essence of problem-solving is to draw from familiar challenges when faced with unfamiliar ones.```

- **PTS System**
    - Patterns: **Master common patterns**. The good news is that there are only a handful of common patterns you need
      to know.
    - Templates: Never make coding mistakes again using our **templates** for each pattern
    - Speedrun: Expanding your knowledge by **going through many problems quickly**

![Patterns](https://algomonster.s3.us-east-2.amazonaws.com/stats.png)

### Worst working choices as per input size  (machine with 2GZ computations which is 2000, 000,000 executions)

| **Input**             | **Worst working algo**        | **Time Complexity** | **Required Computations** |
|-----------------------|-------------------------------|-----------------|---------------------------|
| N < 20                | Brute force/Backtracking      | O(2^N) , O(N!)  | 1,000,000                 |
| N < 3000              | Dynamic Programming           | O(N^2)          | 9,000,000                 |
| 3000 < N < 10,000,000 | 2Pointer, Greedy, Heap, Sorting | O(N), O(N logN) | 10,000,000                |
| N > 1000000           | Binary Search, Math           | O(log N) , O(1) | 3,000                     |

### Time Complexity Hints

- Constant ====> O(1)
    - Hashmap, Stack
    - math formula
    - index access
    - Heap--Get Min
- Logarithmic ====> O(Log N)
    - Binary seach /variant
    - Balanced binary tree lookup
    - Number's digits processing
    - Heap insert, Pop ONE element
- Linear ====> O(N)
    - Array/List go through
    - Two pointers
    - Some greedy
    - Tree/Graph Traversal (N nodes, N visits)
    - Stack queue full usage
- O(K log N)
    - Heap insert, Pop K elements
    - K times Binary search
- O(N Log N)
    - Sorting
    - Divide N conquer-- LogN for divide and N for linear operations
- O(N^2)
    - Nested Loops
    - Multiple times brute force solutions
    - Some DP problems
- Combinational -- O(K^N)
    - Combinational problems, arrangements, backtracking
    - Fullon recursive tree for N depth... ( 2^N+1 - 1) elements)
- O(N!)
    - Backtracking problems..Grows rapidly
    - Brute force recusion

### Keyword to Algorithm Cheatsheet

##### Top k

Heap: K closest points

##### How many ways..

- DFS: Decode ways
- DP: Robot paths

##### Substring

- Sliding window: Longest substring without repeating characters

##### Palindrome

- two pointers: Valid Palindrome
- DFS: Palindrome Partitioning
- DP: Palindrome Partitioning II

##### Tree

- shortest, level-order
- BFS: Binary Tree Level-Order Traversal
- else: DFS: Max Depth

##### Parentheses

- Stack: Valid Parentheses

##### Subarray

- Sliding window: Maximum subarray sum
- Prefix sum: Subarray sum
- Hashmap: Continuous subarray sum
- Max subarray
- Greedy: Kadane's Algorithm

##### X Sum

- Two pointer: Two sum

##### Max/longest sequence

- Dynamic programming, DFS: Longest increasing subsequence
- mono deque: Sliding window maximum

##### Minimum/Shortest

- Dynamic programming, DFS: Minimal path sum
- BFS: Shortest path

##### Partition/split ... array/string

- DFS: Decode ways

##### Subsequence

- Dynamic programming, DFS: Longest increasing subsequence
- Sliding window: Longest increasing subsequence

##### Matrix

- BFS, DFS: Flood fill, Islands
- Dynamic programming: Maximal square

##### Jump

- Greedy/DP: Jump game

##### Game

- Dynamic programming: Divisor game, Stone game

##### Connected component

##### Cut/remove

##### Regions/groups/connections

- Union Find: Number of connected components, Redundant connections
- Transitive relationship
- If the items are related to one another and the relationship is transitive, then chances are we can build a graph and
- use BFS or Union Find.
- string converting to another, BFS: Word Ladder
- string converting to another, BFS, Union Find: Sentence Similarity
- numbers having divisional relationship, BFS, Union Find: Evaluate Division

##### Word Lookup

- Trie

##### Find all arrangements

- backtracking

##### Range search

- Interval trees

##### Graph-DAG, Dependency first

- Toplogical sorting

##### Binary tree traversal

- Multiple traversals (FIND and PROCESS stages) with trigger and backtrack path
- Ancestors passon and let them run PROCESS() function recursively.
-

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

Similar problems of **0/1 knapsack** (N, wt [], val[], W) with constraints and objectives

- Inputs, Constraints, Objective
    - Num items: N
    - Available Options ( wt[N] )
    - **Available Values (val[N])
    - Constraint(s) : W is max weight of knapsack
    - Objective: MAX (profit)
- Choices
    - IF NO REPEATATIONS -->  Choose/Dont Choose
    - IF REPEATATIONS --> FOR(options)
    - Aggregate ( current state, [subproblem1, subproblem 2...])
- Variable Arguments
    - i ++
    - W - wt[i]
- States
    - Initial State: i== 0
    - Next State: i = i+1
    - Final State: Valid / Invalid
- Base Condition
    - SAD --- If W exceeding after adding i
    - HAPPY --- W matches after adding i
    - HAPPY --- No more weights and W is still not filled

#### Time complexity

- **Before DP---Exponential**:  O(2^N)
- **After Memoization DP----Linear or Quadratic**: O(N) /O(NxM) -- Depending on memo dimentionality

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

- **Wrong Data Assumptions**
    - Type-- Dont assume positive int as type.
    - Arrays-- Assuming implicit ordering
    - Graphs-- Assuming its fully connected and/or undirected.
    - Trees-- Assuming its BST or binary tree
    - Size-- Assuming its fitting in memory ( scale for million ?)

- **Improper Index Handling:**
    - Avoid overflows wherever you are ++ or -- index
    - Base conditions for bound checks
    - FOR OPTIONS EXPLORATION LOOPS: Pay attention to conditions, Start value for ( j= i+1)

- **Initial/Invalid values Usages**
    - Coin change can not be -ve but account balance could
    - Choosing Boolean over boolean allow us to use ```null as invalid/uninitialied value```
    - Count could never be -ve hence choose 0 as initial and -1 as invalid value
    - Adding up MAX_INT would lead to overflow..Avoid it

- **Causing Overflows:**
    - Caller can return MAX_VALUE/MIN_VALUE
    - Discard those in callee to avoid overflows.
    - Choose long for int+int
    - MAX-1 value before incrementing it by 1. Or check overflow before it occurs.
    - Avoid overflow for INVALID state returns.

- **Not Following this DP soln format:**
    - ```1 (HappyCases, Sad Cases and IndexBounds)``` Sequence chances as per problem
    - ```2.DelegateToNextState```
    - ```3. Memo Lookup```
    - ```4. Recursive Happy```
    - ```5. Recursive Sad```
    - ```6. Invalid--Default return if any```
    - Add other base conditions beyond just bound check - e.g. invalid W in knapsack,

- **Final return**:
    - Declare what does int return indicates for no solution exists scenario.
    - e.g. Min coins ( coins[2,5,7] and change 3) ==> Integer.MAX_VALUE here should indicate no solution exist

- **Memo handling -- DP(Memo) :**
    - Initialize ALL dimentions with EXTRA (+1) dimension.
    - Pass memo to recursive calls
    - Choose correct ( -1 if possible) INITIAL VALUE.
    - Add READ block before recursion. WRITE block inside FOR loop or A/B choices.
    - Check MAX_VALUE/ MIN_VALUE after read to avoid overflow

- **DP (subsequence vs substring)**
    - Subsequnce -- C1 or MAX(C2,C3)
    - Substring -- MAX(C1,C2, C3)

- **Avoid simplification of conditions/base cases:**
    - Ok to have redudency than missing any case in the process of over-simplification/coolness
    - OK to add separate if for separate case since return value per IF block could vary

- **Graphs**
    - Assuming fully connected and hence avoiding multiple DFS/BFSs
    - Not tracking visited nodes
    - Visiting node without checking status
    - (As applicable) Hesitating to check all visited condition (O(N^2) call) -- We need it we should have it.

- **Trees**
    - Hesitating to do ```NESTED``` traversal from any node.

#### ====Implementation====

**1. Bounded 0/1 Knapsack (without repeatations)**

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

**2. Unbouded 0/1 Knapsack (WITH repeatations) -- Min coins change problem**
```N recursive trees emerging for first FOR loop from first call```

```java
class MinCoinsChange {
    static int DP_unboudedKnap_minCoins(int[] coins, int change, int[] memo) {
        if (change == 0) {
            return 0; // No coins could be used
        }

        // Memoize- cache hit
        if (memo[change] != -1) {
            return memo[change];
        }

        int sol = Integer.MAX_VALUE; // Min calculations 
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

**3. Min Cuts Palindrome Partitioning (Complex Variant of Knapsack..MUST REMEMBER)**

```java
class GFG {
    // Function to find the minimum number of cuts needed
    // for palindrome partitioning
    static int minPalPartition(String str, int i, int j) {
        // Base case: If the substring is empty or a
        // palindrome, no cuts needed
        if (i >= j || isPalindrome(str, i, j))
            return 0;

        int minCuts = Integer.MAX_VALUE;

        // Iterate through all possible partitions and find
        // the minimum cuts needed
        for (int k = i; k < j; k++) {
            int cuts = minPalPartition(str, i, k)
                    + minPalPartition(str, k + 1, j) + 1;
            minCuts = Math.min(minCuts, cuts);
        }

        return minCuts;
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

#### Time Complexity

Same as knapsack.

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

**1. Length of Longest Palindrome Sub-STRING (Special)**
Alternative:

```
Note: This could be solved using NON DP way too..Please refer String theme with solves even complex problem--Get actual longest palindrome substring
```

Complexity:

```
Time complexity: O(N^2), Where N is the size of the string
Space complexity: O(N^2)
```

Code:

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

#### [Category]  BFS for directed and undirected graphs

**Points to Ponder:**

- Representation:
  ```java
  class GFG {
      int V;
      List<Integer>[] adj = new LinkedList<Integer>[V];
      // OR
      List<Integer>[] adj = new List[V];
      adj[0] = Arrays.asList(1, 2, 3);
  }
  ```
- For directed Graph:
    - Unlike tree BFS(which starts from root), Graph BFS does NOT gurantee cover all the vertices.
    - E.g. Starting from sink node with no outdegree will lead to BFS for only just that node
- For Undirected Graph:
    - Start from all the unvisited nodes if there are more than one components (islands)
- Queue:
    - ```LinkedList<Integer>``` as Queue
    - Useful methods: ```isEmtpty``` , ```add``` and ```poll```

**=====Implementation=====**

**1. Directed and Undirected BFS appraoches**

```java
class GFG {

    /**
     * BFS for any DIRECTED graph..Even Null Graph too.
     * UTIL method ==> allVisited(visited)) returns -1 if ALL visited or return any unvisited node index.
     *
     * @param V Number of Nodes of graph
     * @param adj List<Integer> [] adjacency List of graph
     */
    static void bfsForDirected(int V, LinkedList<Integer>[] adj) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];

        // Unlike tree BFS(which starts from root), Graph BFS does NOT gurantee cover all the vertices.
        // E.g. Starting from sink node with no outdegree will lead to BFS for only just that node
        // Hence its extremely important to visit ALL the nodes BFS way UNTIL ALL are VISITED.
        int unvisited = 0;
        // -1 indicates that all nodes visited. Exit Main BFS
        while ((unvisited = allVisited(visited)) != -1) {
            // STEP: 1 >>>> PIck unvisited Node
            // STEP 2 >>>> BFS for unvisited node
            // STEP 3 >> Visit Node and Start local BFS by queuing it
            visited[unvisited] = true;
            queue.add(unvisited);

            //STEP 4 >>>> LOCAL BFS  >> Explore Adjacencies and add them to the queue and process all the
            System.out.println("Local BFS for : " + unvisited);
            while (queue.isEmpty() == false) {
                int u = queue.poll();
                System.out.println(u);
                //STEP 4.1 >>>> Loop through adjancent nodes of u
                for (int v : adj[u]) {
                    //STEP 4.2 >>>> Visit and add unvisited nodes.
                    if (visited[v] == false) {
                        visited[v] = true;
                        queue.add(v);
                    }
                }
            }
        }
    }

    /**
     * BFS for any CONNECTED UNDIRECTED graph. (Single component)
     *
     * @param V Number of Nodes of graph
     * @param adj List<Integer> [] adjacency List of graph
     */
    static void bfs(int V, LinkedList<Integer>[] adj) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[V];

        // Start from ANY vertex since its UNDIRECTED CONNECTED graph.
        int startVertex = 3;
        visited[startVertex] = true;
        queue.add(startVertex);

        // BFS  >> Explore Adjacencies and add them to the queue and process all the
        while (queue.isEmpty() == false) {
            int u = queue.poll();
            System.out.println(u);
            //STEP 4.1 >>>> Loop through adjancent nodes of u
            for (int v : adj[u]) {
                //STEP 4.2 >>>> Visit and add unvisited nodes.
                if (visited[v] == false) {
                    visited[v] = true;
                    queue.add(v);
                }
            }
        }
    }
}
```

#### [Category]  Paths and Connectivity

**=====Implementations=====**

**1. Transitive Closure: (Adj Matrix way)**

```java
class Graph {
    /**
     * Time complexity -- O(N3) 
     */
    int[][] transitiveClosure() {
        int reach[][] = new int[V][V]; // STEP1: Additional output data structure (reach[][] = Path exist=1, path no exist=0)
        // STEP2: O(N^3) combinations of 3 vertices hence 3 for loops
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                for (int k = 0; k < V; k++) {
                    // STEP3: Update Transitive connectivity/Path from i to j
                    // If {i,j} path exist OR {i,k} and {k,j} path exists ? ==> update {i,j} = 1 (Some path exist from i to j) 
                    reach[i][j] =
                            (reach[i][j] != 0) ||
                                    ((reach[i][k] != 0) && (reach[k][j] != 0)) ? 1 : 0;
                }
            }
        }
        // STEP4: Return the output
        return reach; // return transitive closure
    }
}

```

**2. Find Connected Components/Islands in Maze (Special Graph/Special representation)**

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
        return numberOfIslands;
    }
}

```

**3. Detect Cycle in directed graph**

```java
class GFG {
    /**
     * Check cycles originating from ALL nodes DFS way
     * @return
     */
    boolean isCyclic() {
        // STEP 1 >>> Intialize Boolean OBJECT array for visited node tracking
        Boolean visited[] = new Boolean[V]; // Pass by reference
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // STEP 2 >>> Call the recursive helper function to detect cycle in different DFS trees
        for (int u = 0; u < V; u++) {
            // STEP 3 >>> Don't recur for u if already visited
            if (!visited[u])
                if (BFS_isCyclicUtil(u, visited, -1))
                    return true; // STEP 4 >>> Return true if we find cycle in this subtree 
        }
        return false; // STEP 5: Return false if we DID NOT find ANY cycle from ANY node
    }

    //////////////////////////////////////////////////////////////////

    /**
     * Detect cycle from each of the start node recursively
     */
    boolean BFS_isCyclicUtil(int u, Boolean visited[],
                             int parent) {
        // Mark the current node as visited
        visited[u] = true;
        Integer i;
        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> it = adj[u].iterator();
        while (it.hasNext()) {
            i = it.next();
            // NON VISITED ADJ --> Recur 
            if (!visited[i]) {
                if (BFS_isCyclicUtil(i, visited, u))
                    return true;
            }
            // VISITED ADJ -->  
            else {
                // If an adjacent is visited and not parent of current vertex, 
                // then there is a cycle.
                if (i != parent)
                    return true;
            }
        }
        return false;
    }
}

```

#### [Category] Topological Sorting for DAG dependency

- USECASES: Extremely important for compiler, dependency and job sequencing
- CONDITIONS ==>
    - Supported Data Structures:  **Directed Acyclic Graph**(including all **Trees** and **DAG forest**)
    - Feature:
        - The first vertex in topological sorting is always a vertex with an in-degree of 0 (a vertex with no incoming
          edges).
        - In case of tree, ROOT will always be FIRST vertex in output

- Example (DAG forest):

**====Implementation====**
**1. Implement Topological Sort:**

```java
class GFG {
    /////////////////////// (Driver code)
    public void topologicalSort(int V, List<List> adj) {
        // STEP1: Assume unconnected graph hence multiple FOR(DFS)
        boolean[] visited = new boolean[V];
        Stack stack = new Stack(); // java.utils.colections
        // STEP2: Push the element in PECULIER order (LIFO-DFS) to stack
        for (int u = 0; u < V; u++) {
            DFS_topologicalSort_UTIL(V, adj, visited, stack, u);
        }
        // STEP3: Print elements of stack, thats it (LIFO-- Deepest child node will get printed first) (Works for islands too)
    }

    ///////////////////////// DFS (Tweaked)
    public void DFS_topologicalSort_UTIL(int V, List<List> adj, boolean[] visited, Stack stack, int u) {
        // STEP1: Visit element
        visited[u] = true;

        // STEP2: DFS adj nodes (
        for (int v = 0; v < adj.size(); v++) {
            DFS_topologicalSort_UTIL(V, adj, visited, stack, v);
        }
        // STEP3: Push current node to Stack(after adj)
        stack.push(u);
    }
}
```

- Example (Binary Tree- N ary):

```java
class Demo {
    void toplogicalSortBinaryTree(Node node, Stack stack) {
        if (node == null) {
            return;
        }
        // Simpler( No need to keep track of visited elements due to fully connected tree property)
        toplogicalSortBinaryTree(node.l);
        toplogicalSortBinaryTree(node.r);

        stack.add(node.data);
    }
}
// Then print elements of stack

```

#### [Category]  Flows and Fills

TODO

#### [Category] Spanning Trees, Connect Multiple, Shortest paths

TODO

#### [Category]  Coloring

- Find Minimum Colors (Chromatic Number)
    - This is SIMPLE problem
    - Iterate through all adj and store outdegrees for each v
    - Return MAX all the outdegrees +1 as MIN colors
- M-Coloring ==> Can color using M colors ?
    - Backtracking DFS is the way forward
    - Start from s..[Color..Conflict=NO ...Recurse..Backtrack]
    - Return true if ALL nodes are colored
    - **** Breadth-First-Search ```DOES NOT WORK``` with ```backtracking```
- Detect Bipartile Graph?
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

#### Backtracking Pseudocode

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

#### Known Problems (Remember list)

Maze:

- Longest Possible Route in a Matrix with Hurdles
- Rat in maze
- Chess N Queen
- Chess Knight tour
- Suduko
- Work Break

Arrays:

- Partition of a set into K subsets with equal sum
- Combination Sum
- Palindrome Partitioning
- All subsets
- All permutations of string
- All permutations of Phone Letter digits

Graph:

- M-coloring problem
- Find hamilton Cycles (If exist, count and print all)
- Print all longest common sub-sequences in lexicographical order

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

- **Problem: kSum Path (How paths are being processed) ==>**
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

- **Problem: Burn Tree (PreOrder traversal and Special processing for node on return path) ==>**
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

#### Binary Search Trees (Sorts-Traversals)

- Use recursion
- InOrder, PreOrder, PostOrder DFS
- BFS using queue.
- Decisions==> based on input and output returned by subtree calls
- Pass parameters by val/ref to children calls
- Split problems into parts (e.g. Border traversal)

#### Binary Trees (Traversal)

- Traverse using recursive DFS or queue based BFS.
- Decisions==> based on input and output returned by subtree calls
- Pass parameters by val/ref to children calls
- Split problems into parts (e.g. Border traversal)

#### Heap (Max-Min-Median)

- Array implementation is common
- ```iLeftChild = 2*iParent + 1``` and ```iRightChild = 2*iParent*2```
- ```iParent = floor(iChild/2)```
- Min-Max heap types
- Common use cases:
    - min+max heap for median of infinite stream
    - Heap for K-largest

---

## 6. Theme ==> Trie (N-ary tree as PRE-processed dictionary)

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
    boolean isEndOfWord; // Indicates End of word node
    int numOccurances;
}
```

**====Implementation====**

- **Problem: Implement Trie**

```java
class Trie {
    ///////////////// Insert //////////////
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

- Count words: (INSERT ==> ++ maintain the count on the go)
- Count Most Frequent Word: (INSERT ==> ++ maintain the maxCount on the go)
- Count Kth Frequent Word: (INSERT ==> ++ maintain the HEAP of TrieNodes (with occurance as key param)
- Search Word/Prefix ==> (SEARCH)
- Count Words with Prefix ==> (SEARCH -- BFS -- Start BFS from end of prefix)
- Work Break Problem (String and Dict) ==> Build trie of dict and use DP to solve it

##### USAGES

- Phone Dictionary, Prefix tree, String lookup

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
    String str1 = "01234";
    str1.charAt(1) == '1' ;
    str1.charAt(3) == '3' ;
    StringUtils.equals(str1.substring(3, 4), "3") ; // Extract Single character at i by s.substring(i,i+1); 
    StringUtils.equals(str1.substring(4, 5), "4") ; // Extract Single character at i by s.substring(i,i+1); 
    StringUtils.equals(str1.substring(0, 2), "01") ; // Extract k character at i by s.substring(i,i+k+1) ==> s.substring(0,0+1+1) ==> s.substring(0,2) ==> "01"
    StringUtils.equals(str1.substring(2, 4), "23") ; // Same as above
    StringUtils.equals(str1.substring(0, str1.length()), str1) ; // Dont worry about index out of bound for referring s.length() index as endIndex

    String str2 = "1[[22]]33"; // Input String
    str2.indexOf('[') == 1 ; // Returns first char occurance index (use for pranthesis matching--open paranthesis)
    str2.lastIndexOf(']') == 6; //Returns last char occurance index (use for pranthesis matching--close paranthesis)
  ```
- All primitive types including , String are pass BY VALUE. Safe to pass without worring.
- Substring usage== > **endIndex + 1**  to include endIndex char
- e.g. ```"aaBBBcc".substring(2, 4+1)``` to get **BBB**

-- **PROBLEM--Print Actual Longest Common Palindrome Substring (Not DP yet same time complexity of Quadratic)**

```java
package com.hiru.dsa.java.datastructures.string;

public class DP_LongestPalindromeSubString_GetString {
    public static void main(String[] args) {
        System.out.println(longestPalindromeString("9912321456"));
    }

    static public String intermediatePalindrome(String s, int left, int right) {
        if (left > right) return null;
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }

    // O(n^2) -- Not Optimal yet effective appraoch with less complex code
    public static String longestPalindromeString(String s) {
        if (s == null) return null;
        String longest = s.substring(0, 1);
        for (int i = 0; i < s.length() - 1; i++) {
            //odd cases like 121
            String palindrome = intermediatePalindrome(s, i, i);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
            //even cases like 1221
            palindrome = intermediatePalindrome(s, i, i + 1);
            if (palindrome.length() > longest.length()) {
                longest = palindrome;
            }
        }
        return longest;
    }
}
```

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

- **PROBLEM--Decode Bash Command Expansion**

-

```java
  public class DecodeBashExpansion {
    //////////////////////////////////////////////////////////////////////////////
    String getExpandedString(String input, int size) {
        // STEP 1 ====> Validity Check using stack.
        // Push { and pop it for each } ignore other characters.
        // At the end both string and stack should be empty
        if (isValid(input, size)) {
            // STEP 2 ====> Divide and process parts to results list of lists
            // Expand each pair of brackets separately
            // At the end both string and stack should be empty'
            ArrayList<ArrayList<String>> parts = new ArrayList<ArrayList<String>>();
            int i = 0;
            String result;
            while (true) {
                String ch = input.substring(i, i + 1);
                if (ch != "{") {
                    // Process continuous string of non special part
                    String part = input.substring(i, input.indexOf('{'));//TODO--safeguard
                    parts.add(Collections.singletonList(part));
                    i += input.indexOf('{'); // Change index
                } else {
                    // Special part(range)
                    input = input.substring(i, input.length()); // reduce string
                    int i1 = input.indexOf('{');
                    int i2 = input.indexOf('}');
                    String range = input.substring(i1 + 1, i2); // Without { and }
                    results.add(expand(range));
                    i = i2 + 1; // Advance to next character to "}"
                }
                if (i >= size)
                    break;

            }

            // Step3 ===> Generate final string
            ArrayList<String> result1 = results.get(0);
            List<String> result2 = results.get(1);
            String solution = ""; //########## THIS IS OUTPUT
            for (int ss = 2; ss < results.size(); ss++) {
                ArrayList<String> result1 = new ArrayList<String>();
                ArrayList<String> result2 = new ArrayList<String>();
                result1 = results.get(ss);

                if (ss + 1 < size)
                    result2 = results.get(ss + 1);
                // Merge 2 lists along with previously processed prefix
                solution = merge(solution, prevString, currentString);
            }
            return solution;
        }
    }

    //////////////////////////////////////////////////////////////////////////////
    ArrayList<String> expand(String range) {
        ArrayList<String> res = new ArrayList<String>();

        if (range == "a--z") {
            for (int i = 0; i < 26; i++) {
                res.add("" + ('a' + i));
            }

        } else if (range == "a--z") {
            res.add("" + ('A' + i));

        } else if (range == "1,2,3") {
            res.add("1");
            res.add("2");
            res.add("3");

        } else {
            res = decodeSpecialX(range); // SCOPE for future expansion in same framework
        }
        return res;
    }

    //////////////////////////////////////////////////////////////////////////////
    String merge(String prefix, ArrayList<String> list1, ArrayList<String> list1) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                prefix += list1.get(i) + list2.get(j);
            }
        }
        return prefix;
    }
}
```

- **PROBLEM--Word Break (can String be broken into Dict words)**
  ```java
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
  ```

### Queue (Java)  ---------------------------------------------------------------------------------------

- Inbuilt Queue: ```LinkedList<Integer> queue = new LinkedList<>();```
- Enque/ADD: ```list.add(e);```
- Deque/POLL: ```int e = list.poll();```
- PEEK (Gets but DONT removes): ```int e = list.peek(e);```

### Stack (Java)  ---------------------------------------------------------------------------------------

```java
class Test {
    // Pushing element on the top of the stack
    static void stackUsage() {
        java.util.Stack<Integer> stack; // Inbuilt stack for use
        stack.push(10); // Push
        int peekedElement = stack.peek(); //Peek 
        int poppedElement = stack.pop(); // pop
    }
}
```

### HashSet (Java) ---------------------------------------------------------------------------------------

- Use as cache for ```unsorted``` past seen element lookup
- ```Matching pair sum problem``` for ```unsorted``` array could be solved using that in O(N) time. like below

 ```java
class Demo {
    public static boolean findPair(List<Integer> arr, int sum) {
        HashSet<Integer> cache = new HashSet<>(); // You dont need hashmap since you dont have any value to be stored
        for (int i = 0; i < arr.size(); i++) {
            if (!cache.contains(arr.get(i))) {
                cache.add(arr.get(i));
            }
            if (cache.contains(sum - arr.get(i))) {
                return true;
            }
        }
        return false;
    }
}
```

### PRIMITIVE TYPES e.g Integer (Java Wrapper Classes) ---------------------------------------------------------------------------------------

**[API guide for java.lang.Integer](https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/lang/Integer.html)**

- **Binary String of Int**

```java
    String binString=Integer.toBinaryString(i);
```

- **String to Int**

```java
Integer i=Integer.parseInt(strInt);
```

- **Decode** (Decodes any type of string and return Integer)

```
public static Integer decode(String nm);

DecodableString:
Signopt DecimalNumeral
Signopt 0x HexDigits
Signopt 0X HexDigits
Signopt # HexDigits
Signopt 0 OctalDigits

```

--- 

## 9. Theme ==> BitMagic (solve at least 10 problems)

TODO--Update this section

---

## 10. Theme ==> Binary Search

### (VARIANT 1) Binary Search On SORTED Input

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

##### PROBLEM:Find the Peak of mountain array

Input: [1,2,3,40, 35,7,4]
Output: 40

- Follow same technique as rotated array..
- Decision to move left and right based on ```increasing/decreasing flow mid index```

### (VARIANT 2) Binary Search to REFINE possible solution on GENERATED SORTED [MIN,MAX] RANGE
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
                actuallyUsedWorkers++;
            }
            singleWorkerTime += onePaperReadTime;
        }
        if (singleWorkerTime >= 0)
            actuallyUsedWorkers++;
    }
    return availableWorkers >=actuallyUsedWorkers; // TRUE-- job was performed with given or less number of workers..We can reduce timeLimit further as optimization
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

##### Arrays and String Problems

- Sequencial Storage viz. string array
- Reduces time cmplexity from O(N2) to O(N)
- Types
    - BOTH FORWARD: i1 fast and i2 Slow
    - INC DEC : i1 inc and i2 dec
    - BOTH BACKWARD: i1 fast dec, i2 slow dec

**Problem: Sliding Window Find N-grams**

```java
package com.hiru.dsa.java.algomonster_typical.TwoPointers;

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

**Problem: Variable Sliding Window to find substring without repeating chars**

```java
public class LongestSubstringWithoutRepeatingChar {
    public static void main(String args[]) {
        //System.out.println("3|" + getLenOfLongestSubString("abccaba"));
        //System.out.println("1|" + getLenOfLongestSubString("aa"));
        System.out.println("1|" + getLenOfLongestSubString("A"));
    }

    private static int getLenOfLongestSubString(String s) {
        int max = 0;
        HashSet<Character> window = new HashSet<>();
        int p1 = 0;

        for (int p2 = 0; p2 < s.length(); p2++) {
            Character ch = s.charAt(p2);
            // Contains vs Not contain
            if (window.contains(ch)) {
                max = Math.max(max, window.size());

                // Slide Window P1 pointer and point to next index after old occurance of ch
                for (int k = p1; k < p2; k++) {
                    Character chOld = s.charAt(k);
                    window.remove(chOld);
                    if (ch == s.charAt(k)) {
                        p1 = k + 1;
                        break;
                    }
                }
                window.add(ch); // Redundant if we remove window.remove() call
                // ..Just added for visibility
            } else {
                window.add(ch);
            }
        }
        max = Math.max(max, window.size());
        return max;
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

