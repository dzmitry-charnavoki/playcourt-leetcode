#### 973. K Closest Points to Origin

<span style="color:#deb800">***Medium***</span>
___

Given an array of `points` where <code>points[i] = [x<sub>i</sub>, y<sub>i</sub>]</code> represents a point on the **X-Y** plane and an integer `k`, return the `k` closest points to the origin `(0, 0)`.

The distance between two points on the **X-Y** plane is the Euclidean distance (i.e., <code>√(x<sub>1</sub> - x<sub>2</sub>)<sup>2</sup> + (y<sub>1</sub> - y<sub>2</sub>)<sup>2</sup></code>).

You may return the answer in **any order**. The answer is **guaranteed** to be **unique** (except for the order that it is in).
___

**Example 1:**

![](https://assets.leetcode.com/uploads/2021/03/03/closestplane1.jpg)

**Input:** points = [[1,3],[-2,2]], k = 1

**Output:** [[-2,2]]

**Explanation:**

The distance between (1, 3) and the origin is sqrt(10).

The distance between (-2, 2) and the origin is sqrt(8).

Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.

We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].

**Example 2:**

**Input:** points = [[3,3],[5,-1],[-2,4]], k = 2

**Output:** [[3,3],[-2,4]]

**Explanation:** The answer [[-2,4],[3,3]] would also be accepted.
___

**Constraints:**

*   <code>1 <= k <= points.length <= 10<sup>4</sup></code>
*   <code>-10<sup>4</sup> < x<sub>i</sub>, y<sub>i</sub> < 10<sup>4</sup></code>
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Math](https://leetcode.com/tag/math/)
[#Divide and Conquer](https://leetcode.com/tag/divide-and-conquer/)
[#Geometry](https://leetcode.com/tag/geometry/)
[#Sorting](https://leetcode.com/tag/sorting/)
[#Heap (Priority Queue)](https://leetcode.com/tag/heap-priority-queue/)
[#Quickselect](https://leetcode.com/tag/quickselect/)

</details>
