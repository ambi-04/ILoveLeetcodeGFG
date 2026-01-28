<!-----

You have some errors, warnings, or alerts. If you are using reckless mode, turn it off to see useful information and inline alerts.
* ERRORs: 0
* WARNINGs: 0
* ALERTS: 3

Conversion time: 1.248 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β2
* Wed Jan 28 2026 03:10:52 GMT-0800 (Pacific Standard Time)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
* This document has images: check for >>>>>  gd2md-html alert:  inline image link in generated source and store images to your server. NOTE: Images in exported zip file from Google Docs may not appear in  the same order as they do in your doc. Please check the images!

----->





**Word Search**

Difficulty: MediumAccuracy: 32.69%Submissions: 90K+Points: 4Average Time: 20m

You are given a matrix mat[][] of size n*m containing english alphabets and a string word. Check if the word exists on the mat[][] or not. The word can be constructed by using letters from adjacent cells, either horizontally or vertically. The same cell cannot be used more than once.

Examples :

Input: mat[][] = [['T', 'E', 'E'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"

Output: true

Explanation: Word "GEEK" can be found in the given grid as follows.



Input: mat[][] = [['T', 'E', 'U'], ['S', 'G', 'K'], ['T', 'E', 'L']], word = "GEEK"

Output: false

Explanation: Word "GEEK" cannot be found in the given grid.



Input: mat[][] = [['A', 'B', 'A'], ['B', 'A', 'B']], word = "AB"

Output: true

Explanation: There are multiple ways to construct the word "AB".

Constraints: \
1 ≤ n, m ≤ 6 \
1 ≤ word.size() ≤ 15 \
mat and word consists of only lowercase and uppercase English letters.

**Try more examples**
