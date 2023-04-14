#### 99. Recover Binary Search Tree

<span style="color:#deb800">***Medium***</span>
___

You are given the `root` of a binary search tree (BST), where the values of **exactly** two nodes of the tree were swapped by mistake. _Recover the tree without changing its structure_.
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/10/28/recover1.jpg)

**Input:** root = [1,3,null,null,2]

**Output:** [3,1,null,null,2]

**Explanation:** 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 makes the BST valid. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/10/28/recover2.jpg)

**Input:** root = [3,1,4,null,null,2]

**Output:** [2,1,4,null,null,3]

**Explanation:** 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 and 3 makes the BST valid. 
___

**Constraints:**

*   The number of nodes in the tree is in the range `[2, 1000]`.
*   <code>-2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1</code>

**Follow up:** A solution using `O(n)` space is pretty straight-forward. Could you devise a constant `O(1)` space solution?
___

<details><summary>Related topics</summary>

[#Tree](https://leetcode.com/tag/tree/)
[#Depth-First Search](https://leetcode.com/tag/depth-first-search/)
[#Binary Search Tree](https://leetcode.com/tag/binary-search-tree/)
[#Binary Tree](https://leetcode.com/tag/binary-tree/)

</details>