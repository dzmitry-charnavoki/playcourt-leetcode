#### 130. Surrounded Regions

<span style="color:#deb800">***Medium***</span>
___

Given an `m x n` matrix `board` containing `'X'` and `'O'`, _capture all regions that are 4-directionally surrounded by_ `'X'`.

A region is **captured** by flipping all `'O'`s into `'X'`s in that surrounded region.
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/02/19/xogrid.jpg)

**Input:** board = [["X","X","X","X"],["X","O","O","X"],["X","X","O","X"],["X","O","X","X"]]

**Output:** [["X","X","X","X"],["X","X","X","X"],["X","X","X","X"],["X","O","X","X"]]

**Explanation:** Surrounded regions should not be on the border, which means that any 'O' on the border of the board are not flipped to 'X'. Any 'O' that is not on the border and it is not connected to an 'O' on the border will be flipped to 'X'. Two cells are connected if they are adjacent cells connected horizontally or vertically. 

**Example 2:**

**Input:** board = [["X"]]

**Output:** [["X"]] 
___

**Constraints:**

*   `m == board.length`
*   `n == board[i].length`
*   `1 <= m, n <= 200`
*   `board[i][j]` is `'X'` or `'O'`.
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Depth-First Search](https://leetcode.com/tag/depth-first-search/)
[#Binary Search Tree](https://leetcode.com/tag/binary-search-tree/)
[#Union Find](https://leetcode.com/tag/union-find/)
[#Matrix](https://leetcode.com/tag/matrix/)

</details>