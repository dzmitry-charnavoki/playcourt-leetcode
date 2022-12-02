### 796. Rotate String

<span style="color:green">***Easy***</span>
___

Given two strings `s` and `goal`, return `true` _if and only if_ `s` _can become_ `goal` _after some number of **shifts** on_ `s`.

A **shift** on `s` consists of moving the leftmost character of `s` to the rightmost position.

*   For example, if `s = "abcde"`, then it will be `"bcdea"` after one shift.
___

**Example 1:**

>**Input:** s = "abcde", goal = "cdeab"
>
>**Output:** true 
___

**Example 2:**

>**Input:** s = "abcde", goal = "abced"
>
>**Output:** false 
___

**Constraints:**

*   `1 <= s.length, goal.length <= 100`
*   `s` and `goal` consist of lowercase English letters.