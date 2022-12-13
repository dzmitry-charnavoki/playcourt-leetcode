#### 338. Counting Bits

<span style="color:green">***Easy***</span>
___

Given an integer `n`, return _an array_ `ans` _of length_ `n + 1` _such that for each_ `i` (`0 <= i <= n`)_,_ `ans[i]` _is the **number of**_ `1`_**'s** in the binary representation of_ `i`.
___

**Example 1:**

**Input:** n = 2

**Output:** [0,1,1]

**Explanation:**

    0 --> 0
    1 --> 1
    2 --> 10 

**Example 2:**

**Input:** n = 5

**Output:** [0,1,1,2,1,2]

**Explanation:**

    0 --> 0
    1 --> 1
    2 --> 10
    3 --> 11
    4 --> 100
    5 --> 101 
___

**Constraints:**

*   <code>0 <= n <= 10<sup>5</sup></code>

**Follow up:**

*   It is very easy to come up with a solution with a runtime of `O(n log n)`. Can you do it in linear time `O(n)` and possibly in a single pass?
*   Can you do it without using any built-in function (i.e., like `__builtin_popcount` in C++)?
___

<details><summary>Related topics</summary>

[#Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)
[#Bit Manipulation](https://leetcode.com/tag/bit-manipulation/)

</details>

___
<details><summary>Notes</summary>


<code>even = 2<sup>m</sup></code> 2,4,8,16 - 1's bit is 1

<code>odd = 2<sup>m</sup>+x</code> ; 

<code>7 = 2<sup>2</sup>+3 = (1 bit) + (count of bit for 3) = 1 + 2 = 3 bits</code>

<code>6 = 6/2 = cbits(3) + 1IfItIsOdd(6) = 2 bits</code>

<code>5 = 5/2 + 1 = cbits(1) + 1IfItIsOdd(1) = 2 bits</code>

| N   | #                            |      Bits |count|
|-----|------------------------------|-----------|-----|
| 0   |                              | ________0 |   0 |
| 1   |                              | ________1 |   1 |
| 2   | <code>2<sup>1</sup></code>   | _______10 |   1 |
| 3   | <code>2<sup>1</sup>+1</code> | _______11 |   2 |
| 4   | <code>2<sup>2</sup></code>   | ______100 |   1 |
| 5   | <code>2<sup>2</sup>+1</code> | ______101 |   2 |
| 6   | <code>2<sup>2</sup>+2</code> | ______110 |   2 |
| 7   | <code>2<sup>2</sup>+3</code> | ______111 |   3 |
| 8   | <code>2<sup>3</sup></code>   | _____1000 |   1 |
| 9   | <code>2<sup>3</sup>+1</code> | _____1001 |   2 |
| 10  | <code>2<sup>3</sup>+2</code> | _____1010 |   2 |
| 11  |                              | _____1011 |   3 |
| 12  |                              | _____1100 |   2 |
| 13  |                              | _____1101 |   3 |
| 14  |                              | _____1110 |   3 |
| 15  |                              | _____1111 |   4 |
| 16  |                              | 0001_0000 |   1 |
| 17  |                              | 0001_0001 |   2 |
| 18  |                              | 0001_0010 |   2 |
| 19  |                              | 0001_0011 |   3 |
| 20  |                              | 0001_0100 |   2 |


</details>





