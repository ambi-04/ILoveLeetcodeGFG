# Linear Probing in Hashing 
Link : https://www.geeksforgeeks.org/problems/linear-probing-in-hashing-1587115620/1  
Difficulty: EasyAccuracy: 25.49%Submissions: 59K+Points: 2Average Time: 30m  
Given an array arr[] of integers and a hash table of size m, insert the elements of the array into the hash table using linear probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table, while colliding elements must be mapped to the position [(value+1) % m].  

Note: If there is no space left to insert a new element, simply discard that element.  
Linear probing is a collision-handling technique used in hashing. According to linear probing, whenever a collision occurs, the algorithm searches for the next immediate available position.  

<b>Examples:  </b>

Input: arr[] = [3, 11, 10], m = 3 
Output: [3, 10, 11]  
<b>Explanation: </b>  
3 % 3 = 0, So insert 3 in hashtable[0],  
11 % 3 = 2, So insert 11 in hashtable[2],   
10 % 3 = 1, So insert 10 in hashtable[1].    
Input: arr[] = [4, 14, 24, 44], m = 10    
Output: [-1, -1, -1, -1, 4, 14, 24, 44, -1, -1]    
<b>Explanation:</b>   
4 % 10 = 4, So insert 4 in hashtable[4],  
14 % 10 = 4, but hashtable[4] is already filled Since there is a collision, use a linear Probing to find the next available slot.     
Insert 14 into next available position which is hashtable[5].   
Continue the process for remaining element.  
Input: arr[] = [5, 5, 5, 5, 5], m = 5   
Output: [5, -1, -1, -1, -1]  
<b>Explanation:</b>   
5 % 5 = 0, So insert 5 in hashtable[0],  
Next, 5 % 5 = 0, but hashtable[0] is already filled and since number is same, it is mapped to the same position in the hash table.  
Constraints:  
1 ≤ arr.size() ≤ 104  
1 ≤ arr[i] ≤ 105  
1 ≤ m ≤ 1000  

