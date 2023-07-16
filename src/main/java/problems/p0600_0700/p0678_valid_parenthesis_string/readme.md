#### 678. Valid Parenthesis String

<span style="color:#deb800">***Medium***</span>
___

Given a string `s` containing only three types of characters: `'('`, `')'` and `'*'`, return `true` _if_ `s` _is **valid**_.

The following rules define a **valid** string:

*   Any left parenthesis `'('` must have a corresponding right parenthesis `')'`.
*   Any right parenthesis `')'` must have a corresponding left parenthesis `'('`.
*   Left parenthesis `'('` must go before the corresponding right parenthesis `')'`.
*   `'*'` could be treated as a single right parenthesis `')'` or a single left parenthesis `'('` or an empty string `""`.
___

**Example 1:**

**Input:** s = "()"

**Output:** true

**Example 2:**

**Input:** s = "(\*)"

**Output:** true

**Example 3:**

**Input:** s = "(\*))"

**Output:** true
___

**Constraints:**

*   `1 <= s.length <= 100`
*   `s[i]` is `'('`, `')'` or `'*'`.
___

<details><summary>Related topics</summary>

[#String](https://leetcode.com/tag/string/)
[#Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)
[#Stack](https://leetcode.com/tag/stack/)
[#Greedy](https://leetcode.com/tag/greedy/)

</details>