#### 230. Kth Smallest Element in a BST

<span style="color:#deb800">***Medium***</span>
___

Given the `root` of a binary search tree, and an integer `k`, return _the_ <code>k<sup>th</sup></code> _smallest value (**1-indexed**) of all the values of the nodes in the tree_.
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/01/28/kthtree1.jpg)

**Input:** root = [3,1,4,null,2], k = 1

**Output:** 1 

**Example 2:**

![](https://assets.leetcode.com/uploads/2021/01/28/kthtree2.jpg)

**Input:** root = [5,3,6,2,4,null,null,1], k = 3

**Output:** 3 
___

**Constraints:**

*   The number of nodes in the tree is `n`.
*   <code>1 <= k <= n <= 10<sup>4</sup></code>
*   <code>0 <= Node.val <= 10<sup>4</sup></code>

**Follow up:** If the BST is modified often (i.e., we can do insert and delete operations) and you need to find the kth smallest frequently, how would you optimize?
___

<details><summary>Related topics</summary>

[#Tree](https://leetcode.com/tag/tree/)
[#Depth-First Search](https://leetcode.com/tag/depth-first-search/)
[#Binary Search Tree](https://leetcode.com/tag/binary-search-tree/)
[#Binary Tree](https://leetcode.com/tag/binary-tree/)

</details>