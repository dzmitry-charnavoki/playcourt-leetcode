#### 435. Non-overlapping Intervals

<span style="color:#deb800">***Medium***</span>
___

Given an array of intervals `intervals` where <code>intervals[i] = [start<sub>i</sub>, end<sub>i</sub>]</code>, return _the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping_.
___

**Example 1:**

**Input:** intervals = [[1,2],[2,3],[3,4],[1,3]]

**Output:** 1

**Explanation:** [1,3] can be removed and the rest of the intervals are non-overlapping. 

**Example 2:**

**Input:** intervals = [[1,2],[1,2],[1,2]]

**Output:** 2

**Explanation:** You need to remove two [1,2] to make the rest of the intervals non-overlapping. 

**Example 3:**

**Input:** intervals = [[1,2],[2,3]]

**Output:** 0

**Explanation:** You don't need to remove any of the intervals since they're already non-overlapping. 
___

**Constraints:**

*   <code>1 <= intervals.length <= 10<sup>5</sup></code>
*   `intervals[i].length == 2`
*   <code>-5 * 10<sup>4</sup> <= start<sub>i</sub> < end<sub>i</sub> <= 5 * 10<sup>4</sup></code>
___

<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)
[#Greedy](https://leetcode.com/tag/greedy/)
[#Sorting](https://leetcode.com/tag/sorting/)

</details>
