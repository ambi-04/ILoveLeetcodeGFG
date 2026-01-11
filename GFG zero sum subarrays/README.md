<!-----



Conversion time: 0.248 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Sat Jan 10 2026 19:16:44 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


# Zero Sum Subarrays

Difficulty: MediumAccuracy: 51.49%Submissions: 148K+Points: 4Average Time: 60m

You are given an array arr[] of integers. Find the total count of subarrays with their sum equal to 0.

Examples:

Input: arr[] = [0, 0, 5, 5, 0, 0]

Output: 6

Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].

Input: arr[] = [6, -1, -3, 4, -2, 2, 4, 6, -12, -7]

Output: 4

Explanation: The 4 subarrays are [-1, -3, 4], [-2, 2], [2, 4, 6, -12], 

and [-1, -3, 4, -2, 2]

Input: arr[] = [0]

Output: 1

Explanation: The only subarray is [0].

Constraints:    

1 &lt;= n &lt;= 106

-109 &lt;= arr[ i ] &lt;= 109
