#### 235. Lowest Common Ancestor of a Binary Search Tree

<span style="color:green">***Easy***</span>
___

Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

According to the [definition of LCA on Wikipedia](https://en.wikipedia.org/wiki/Lowest_common_ancestor): “The lowest common ancestor is defined between two nodes `p` and `q` as the lowest node in `T` that has both `p` and `q` as descendants (where we allow **a node to be a descendant of itself**).”
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png)

**Input:** root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8

**Output:** 6

**Explanation:** The LCA of nodes 2 and 8 is 6. 

**Example 2:**

![](https://assets.leetcode.com/uploads/2018/12/14/binarysearchtree_improved.png)

**Input:** root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4

**Output:** 2

**Explanation:** The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition. 

**Example 3:**

**Input:** root = [2,1], p = 2, q = 1

**Output:** 2 
___

**Constraints:**

*   The number of nodes in the tree is in the range <code>[2, 10<sup>5</sup>]</code>.
*   <code>-10<sup>9</sup> <= Node.val <= 10<sup>9</sup></code>
*   All `Node.val` are **unique**.
*   `p != q`
*   `p` and `q` will exist in the BST.
___

<details><summary>Related topics</summary>

[#Tree](https://leetcode.com/tag/tree/)
[#Depth-First Search](https://leetcode.com/tag/depth-first-search/)
[#Binary Search Tree](https://leetcode.com/tag/binary-search-tree/)
[#Binary Tree](https://leetcode.com/tag/binary-tree/)

</details>