<!-----



Conversion time: 0.268 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Sat Jan 10 2026 19:33:06 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


**Subarrays with sum K**

Difficulty: MediumAccuracy: 49.74%Submissions: 101K+Points: 4

Given an unsorted array arr[] of integers, find the number of subarrays whose sum exactly equal to a given number k.

Examples:

Input: arr[] = [10, 2, -2, -20, 10], k = -10

Output: 3

Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.

Input: arr[] = [9, 4, 20, 3, 10, 5], k = 33

Output: 2

Explaination: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.

Input: arr[] = [1, 3, 5], k = 0

Output: 0

Explaination: No subarray with 0 sum.

Constraints: \
1 ≤ arr.size() ≤ 105 \
-103 ≤ arr[i] ≤ 103 \
-105 ≤ k ≤ 105
