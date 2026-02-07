class Solution 
{
    public boolean isValidSudoku(char[][] board) 
    {
        
        for(int i = 0; i < 9; i++)
        {
            int cnt = -1;
            HashSet<Character> set1 = new HashSet<>();
            HashSet<Character> set2 = new HashSet<>();
            HashSet<Character> set3 = new HashSet<>();
            for(int j = 0; j < 9; j++)
            {
                
                if(j % 3 == 0)
                    cnt++;
                if(board[i][j] != '.')
                {
                    if(set1.contains(board[i][j]))
                        return false;
                    set1.add(board[i][j]);
                }
                if(board[j][i] != '.')
                {
                    if(set2.contains(board[j][i]))
                        return false;
                    set2.add(board[j][i]);
                }
                if(board[cnt + 3 * (i/3)][j%3 + (i%3)*3] != '.')
                {
                    
                    if(set3.contains(board[cnt + 3 * (i/3)][j%3 + (i%3)*3]))
                        return false;
                    set3.add(board[cnt + 3 * (i/3)][j%3 + (i%3)*3]);
                }
                
            }
            
        }
        return true;
        
    }
}