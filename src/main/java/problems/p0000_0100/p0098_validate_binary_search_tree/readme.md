#### 98. Validate Binary Search Tree

<span style="color:#deb800">***Medium***</span>
___

Given the `root` of a binary tree, _determine if it is a valid binary search tree (BST)_.

A **valid BST** is defined as follows:

*   The left subtree of a node contains only nodes with keys **less than** the node's key.
*   The right subtree of a node contains only nodes with keys **greater than** the node's key.
*   Both the left and right subtrees must also be binary search trees.
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2020/12/01/tree1.jpg)

**Input:** root = [2,1,3]

**Output:** true 

**Example 2:**

![](https://assets.leetcode.com/uploads/2020/12/01/tree2.jpg)

**Input:** root = [5,1,4,null,null,3,6]

**Output:** false

**Explanation:** The root node's value is 5 but its right child's value is 4. 

**Constraints:**

*   The number of nodes in the tree is in the range <code>[1, 10<sup>4</sup>]</code>.
*   <code>-2<sup>31</sup> <= Node.val <= 2<sup>31</sup> - 1</code>
___

<details><summary>Related topics</summary>

[#Tree](https://leetcode.com/tag/tree/)
[#Depth-First Search](https://leetcode.com/tag/depth-first-search/)
[#Binary Search Tree](https://leetcode.com/tag/binary-search-tree/)
[#Binary Tree](https://leetcode.com/tag/binary-tree/)

</details>