#### 763. Partition Labels

<span style="color:#deb800">***Medium***</span>
___

You are given a string `s`. We want to partition the string into as many parts as possible so that each letter appears in at most one part.

Return _a list of integers representing the size of these parts_.
___

**Example 1:**

**Input:** s = "ababcbacadefegdehijhklij"

**Output:** [9,7,8]

**Explanation:**

    The partition is "ababcbaca", "defegde", "hijhklij".
    This is a partition so that each letter appears in at most one part.
    A partition like "ababcbacadefegde", "hijhklij" is incorrect, because it splits s into less parts. 

**Example 2:**

**Input:** s = "eccbbbbdec"

**Output:** [10] 
___

**Constraints:**

*   `1 <= s.length <= 500`
*   `s` consists of lowercase English letters.
___

<details><summary>Related topics</summary>

[#Hash Table](https://leetcode.com/tag/hash-table/)
[#Two Pointers](https://leetcode.com/tag/two-pointers/)
[#String](https://leetcode.com/tag/string/)
[#Greedy](https://leetcode.com/tag/greedy/)

</details>