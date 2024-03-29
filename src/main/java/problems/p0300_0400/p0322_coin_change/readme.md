#### 322. Coin Change

<span style="color:#deb800">***Medium***</span>
___

You are given an integer array `coins` representing coins of different denominations and an integer `amount` representing a total amount of money.

Return _the fewest number of coins that you need to make up that amount_. If that amount of money cannot be made up by any combination of the coins, return `-1`.

You may assume that you have an infinite number of each kind of coin.
___

**Example 1:**

**Input:** coins = [1,2,5], amount = 11

**Output:** 3

**Explanation:** 11 = 5 + 5 + 1 

**Example 2:**

**Input:** coins = [2], amount = 3

**Output:** -1 

**Example 3:**

**Input:** coins = [1], amount = 0

**Output:** 0 
___

**Constraints:**

*   `1 <= coins.length <= 12`
*   <code>1 <= coins[i] <= 2<sup>31</sup> - 1</code>
*   <code>0 <= amount <= 10<sup>4</sup></code>
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)
[#Breadth-First Search](https://leetcode.com/tag/breadth-first-search/)

</details>
