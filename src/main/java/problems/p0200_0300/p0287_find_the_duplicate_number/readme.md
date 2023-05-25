#### 287. Find the Duplicate Number

<span style="color:#deb800">***Medium***</span>
___

Given an array of integers `nums` containing `n + 1` integers where each integer is in the range `[1, n]` inclusive.

There is only **one repeated number** in `nums`, return _this repeated number_.

You must solve the problem **without** modifying the array `nums` and uses only constant extra space.
___

**Example 1:**

**Input:** nums = [1,3,4,2,2]

**Output:** 2 

**Example 2:**

**Input:** nums = [3,1,3,4,2]

**Output:** 3 

**Example 3:**

**Input:** nums = [1,1]

**Output:** 1 

**Example 4:**

**Input:** nums = [1,1,2]

**Output:** 1 
___

**Constraints:**

*   <code>1 <= n <= 10<sup>5</sup></code>
*   `nums.length == n + 1`
*   `1 <= nums[i] <= n`
*   All the integers in `nums` appear only **once** except for **precisely one integer** which appears **two or more** times.

**Follow up:**

*   How can we prove that at least one duplicate number must exist in `nums`?
*   Can you solve the problem in linear runtime complexity?
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Two Pointers](https://leetcode.com/tag/two-pointers/)
[#Binary Search](https://leetcode.com/tag/binary-search/)
[#Bit Manipulation](https://leetcode.com/tag/bit-manipulation/)

</details>