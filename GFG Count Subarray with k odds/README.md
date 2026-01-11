<!-----



Conversion time: 0.214 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Sat Jan 10 2026 19:22:52 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


**Count Subarray with k odds**

Difficulty: MediumAccuracy: 51.12%Submissions: 23K+Points: 4Average Time: 20m

You are given an array arr[] of positive integers and an integer k. You have to count the number of subarrays that contain exactly k odd numbers.

Examples:

Input: arr[] = [2, 5, 6, 9], k = 2

Output: 2

Explanation: There are 2 subarrays with 2 odds: [2, 5, 6, 9] and [5, 6, 9].

Input: arr[] = [2, 2, 5, 6, 9, 2, 11], k = 2

Output: 8

Explanation: There are 8 subarrays with 2 odds: [2, 2, 5, 6, 9], [2, 5, 6, 9], [5, 6, 9], [2, 2, 5, 6, 9, 2], [2, 5, 6, 9, 2], [5, 6, 9, 2], [6, 9, 2, 11] and [9, 2, 11].

Constraint: \
1 ≤ k ≤ arr.size() ≤ 105 \
1 ≤ arr[i] ≤ 109
