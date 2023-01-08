#### 20. Valid Parentheses

<span style="color:green">***Easy***</span>
___

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1.  Open brackets must be closed by the same type of brackets.
2.  Open brackets must be closed in the correct order.
___

**Example 1:**

**Input:** s = "()"

**Output:** true 

**Example 2:**

**Input:** s = "()[]{}"

**Output:** true 

**Example 3:**

**Input:** s = "(]"

**Output:** false 

**Example 4:**

**Input:** s = "([)]"

**Output:** false 

**Example 5:**

**Input:** s = "{[]}"

**Output:** true 
___

**Constraints:**

*   <code>1 <= s.length <= 10<sup>4</sup></code>
*   `s` consists of parentheses only `'()[]{}'`.
___

<details><summary>Related topics</summary>

[#String](https://leetcode.com/tag/string/)
[#Stack](https://leetcode.com/tag/stack/)

</details>
