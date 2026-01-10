<!-----



Conversion time: 0.339 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Sat Jan 10 2026 09:59:33 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


# Count distinct elements in every window

Difficulty: MediumAccuracy: 41.83%Submissions: 176K+Points: 4Average Time: 20m

Given an integer array arr[] and a number k. Find the count of distinct elements in every window of size k in the array.

Examples:

Input: arr[] = [1, 2, 1, 3, 4, 2, 3], k = 4

Output: [3, 4, 4, 3]

Explanation:

First window is [1, 2, 1, 3], count of distinct numbers is 3.

Second window is [2, 1, 3, 4] count of distinct numbers is 4.

Third window is [1, 3, 4, 2] count of distinct numbers is 4.

Fourth window is [3, 4, 2, 3] count of distinct numbers is 3.

Input: arr[] = [4, 1, 1], k = 2

Output: [2, 1]

Explanation:

First window is [4, 1], count of distinct numbers is 2.

Second window is [1, 1], count of distinct numbers is 1.

Input: arr[] = [1, 1, 1, 1, 1], k = 3

Output: [1, 1, 1]

Explanation: Every window of size 3 in the array [1, 1, 1, 1, 1], contains only the element 1, so the number of distinct elements in each window is 1.

Constraints:

1 ≤ k ≤ arr.size() ≤ 105

1 ≤ arr[i] ≤ 105
