## Problem Description

Koko loves to eat bananas. There are n piles of bananas, the **ith pile has piles[i] bananas**. The guards have gone and
will come back in **h hours**.

Koko can decide her **bananas-per-hour** eating speed of **k**.

**Each hour**, she chooses some pile of bananas and **eats k bananas**
from that pile. **If the pile has less than k bananas**, she eats **all of them instead** and will **not eat any more
bananas during this hour.**

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

**Return the minimum integer k (Speed per hour) such that she can eat all the bananas within h hours.**

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

#### Constraints:

```
1 <= piles.length <= 104
piles.length <= h <= 109
1 <= piles[i] <= 109
```

#**Solution**

consider example1.
Input: piles = [3,6,7,11], h = 8
Output: 4

```
K cases =====>
We know best case would be max pile size and worst case as min pile size.

- (MAX k) Max Pile Size = 11 ---> Num Hours 8 --> hours = 4 (Valid yet too fast..reduce speed , we still have 4 hours)
- (INVALID-MIN) Min Pile Size = 3 ---> Num Hours 8 --> hours = 11 (Invalid .. watchman came before all bananas eaten)
- (VALID-MIN k) Expected Balanaced speed k = 4 --> hours = 8 (All finished just before watchman came)
```

**Algorithm**

- Init LEFT=3, RIGHT=11; //Mid will be k
- LOOP-BinSearch
    - Keep on calculating MID bin seach until canFinishReturns(piles,h, K=MID) TRUE
    - ANS=MID
    - See if we can reduce further k if valid
    - Exit upon finding no further solution
- return ANS

**Solution: Core function canFinish(piles, h, k) being used in Bin search**

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