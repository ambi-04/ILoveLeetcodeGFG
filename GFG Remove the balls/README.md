<!-----



Conversion time: 0.311 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Thu Jan 22 2026 12:04:36 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


**Remove the balls**

**Difficulty: MediumAccuracy: 58.66%Submissions: 45K+Points: 4**

**You are given two arrays <code>color</code> and <code>radius</code>, representing a sequence of balls:**



* **<code>color[i]</code> is the color of the i-th ball.**
* **<code>radius[i]</code> is the radius of the i-th ball.**

**If two consecutive balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.**

**Return the number of balls remaining after all possible removals.**

**Examples:**

**Input: color[] = [2, 3, 5], radius[] = [3, 3, 5]**

**Output: 3**

**Explanation: All the 3 balls have different colors and radius.**

**Input: color[] = [2, 2, 5], radius[] = [3, 3, 5]**

**Output: 1**

**Explanation: First ball and second ball have same color 2 and same radius 3. So, after removing only one ball is left. It cannot be removed from the array. Hence, the final array has length 1.**

**Constraints: \
1 ≤ color.size() = radius.size() ≤ 105 \
1 ≤ color[i] ≤ 109 \
1 ≤ radius[i] ≤ 109                 **
