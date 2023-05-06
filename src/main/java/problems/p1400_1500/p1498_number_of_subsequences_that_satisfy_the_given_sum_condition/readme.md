#### 1498. Number of Subsequences That Satisfy the Given Sum Condition

<span style="color:#deb800">***Medium***</span>
___

You are given an array of integers `nums` and an integer `target`.

Return _the number of **non-empty** subsequences of_ `nums` _such that the sum of the minimum and maximum element on it is less or equal to_ `target`. Since the answer may be too large, return it **modulo** <code>10<sup>9</sup> + 7</code>.
___

**Example 1:**

**Input:** nums = [3,5,6,7], target = 9

**Output:** 4

**Explanation:** There are 4 subsequences that satisfy the condition.

[3] -> Min value + max value <= target (3 + 3 <= 9)

[3,5] -> (3 + 5 <= 9)

[3,5,6] -> (3 + 6 <= 9)

[3,6] -> (3 + 6 <= 9)

**Example 2:**

**Input:** nums = [3,3,6,8], target = 10

**Output:** 6

**Explanation:** There are 6 subsequences that satisfy the condition. (nums can have repeated numbers). [3] , [3] , [3,3], [3,6] , [3,6] , [3,3,6]

**Example 3:**

**Input:** nums = [2,3,3,4,6,7], target = 12

**Output:** 61

**Explanation:** There are 63 non-empty subsequences, two of them do not satisfy the condition ([6,7], [7]). Number of valid subsequences (63 - 2 = 61).
___

**Constraints:**

*   <code>1 <= nums.length <= 10<sup>5</sup></code>
*   <code>1 <= nums[i] <= 10<sup>6</sup></code>
*   <code>1 <= target <= 10<sup>6</sup></code>
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Two Pointers](https://leetcode.com/tag/two-pointers/)
[#Binary Search](https://leetcode.com/tag/binary-search/)4
[#Sorting](https://leetcode.com/tag/sorting/)

</details>