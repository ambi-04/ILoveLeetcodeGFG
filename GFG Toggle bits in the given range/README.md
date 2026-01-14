<!-----



Conversion time: 0.357 seconds.


Using this Markdown file:

1. Paste this output into your source file.
2. See the notes and action items below regarding this conversion run.
3. Check the rendered output (headings, lists, code blocks, tables) for proper
   formatting and use a linkchecker before you publish this page.

Conversion notes:

* Docs™ to Markdown version 2.0β1
* Wed Jan 14 2026 01:43:07 GMT-0800 (PST)
* Source doc: Untitled document
* This is a partial selection. Check to make sure intra-doc links work.
----->


**Toggle bits in the given range**

**Difficulty: EasyAccuracy: 65.19%Submissions: 23K+Points: 2**

**Given a non-negative number n and two values l and r. The problem is to toggle the bits in the range l to r in the binary representation of n, i.e., to toggle bits from the lth least significant bit to the rth least significant bit (the rightmost bit as counted as the first bit).**


    **A toggle operation flips a bit 0 to 1 and a bit 1 to 0.**

**Example 1:**

**Input:**

**n = 17 , l = 2 , r = 3**

**Output:**

**23**

**Explanation:**

**(17)10 = (10001)2.  After toggling all**

**the bits from 2nd to 3rd position we get**

**(10111)2 = (23)10**

**Example 2:**

**Input:**

**n = 50 , l = 2 , r = 5**

**Output:**

**44**

**Explanation:**

**(50)10 = (110010)2.  After toggling all**

**the bits from 2nd to 5th position we get**

**(101100)2 = (44)10**

**Your Task: \
You don't need to read input or print anything. Your task is to complete the function toggleBits() which takes three Integers n, l and r as input and returns the modified Integer as the answer.**

**Expected Time Complexity: O(1) \
Expected Auxiliary Space: O(1)**

**Constraints: \
1 &lt;= n &lt;= 105 \
1 &lt;= l&lt;=r &lt;= Number of Bits in n**

**Try more examples**
