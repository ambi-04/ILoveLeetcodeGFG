<!-----



Conversion time: 0.301 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Sat Jan 10 2026 02:36:35 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


# Largest subarray with 0 sum

Difficulty: MediumAccuracy: 41.84%Submissions: 448K+Points: 4Average Time: 20m

Given an array arr[] containing both positive and negative integers, the task is to find the length of the longest subarray with a sum equals to 0.

Note: A subarray is a contiguous part of an array, formed by selecting one or more consecutive elements while maintaining their original order.

Examples:

Input: arr[] = [15, -2, 2, -8, 1, 7, 10, 23]

Output: 5

Explanation: The longest subarray with sum equals to 0 is [-2, 2, -8, 1, 7].

Input: arr[] = [2, 10, 4]

Output: 0

Explanation: There is no subarray with a sum of 0.

Input: arr[] = [1, 0, -4, 3, 1, 0]

Output: 5

Explanation: The longest subarray with sum equals to 0 is [0, -4, 3, 1, 0]

Constraints:

1 ≤ arr.size() ≤ 106

−103 ≤ arr[i] ≤ 103

Expected Complexities

Time Complexity: O(n)

Auxiliary Space: O(n)
