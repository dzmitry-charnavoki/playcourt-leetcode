#### 139. Word Break

<span style="color:#deb800">***Medium***</span>
___

Given a string `s` and a dictionary of strings `wordDict`, return `true` if `s` can be segmented into a space-separated sequence of one or more dictionary words.

**Note** that the same word in the dictionary may be reused multiple times in the segmentation.
___

**Example 1:**

**Input:** s = "leetcode", wordDict = ["leet","code"]

**Output:** true

**Explanation:** Return true because "leetcode" can be segmented as "leet code". 

**Example 2:**

**Input:** s = "applepenapple", wordDict = ["apple","pen"]

**Output:** true

**Explanation:** Return true because "applepenapple" can be segmented as "apple pen apple". Note that you are allowed to reuse a dictionary word. 

**Example 3:**

**Input:** s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]

**Output:** false 
___

**Constraints:**

*   `1 <= s.length <= 300`
*   `1 <= wordDict.length <= 1000`
*   `1 <= wordDict[i].length <= 20`
*   `s` and `wordDict[i]` consist of only lowercase English letters.
*   All the strings of `wordDict` are **unique**.
___


<details><summary>Related topics</summary>

[#Array](https://leetcode.com/tag/array/)
[#Hash Table](https://leetcode.com/tag/hash-table/)
[#String](https://leetcode.com/tag/string/)
[#Dynamic Programming](https://leetcode.com/tag/dynamic-programming/)
[#Trie](https://leetcode.com/tag/trie/)
[Memoization](https://leetcode.com/tag/memoization/)

</details>