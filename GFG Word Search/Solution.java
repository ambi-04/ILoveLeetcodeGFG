class Solution 
{
    public static boolean func(char[][] mat, int x, int y, String word, int p, int n, int m)
    {
        if(p == word.length() - 1)
            return true;
        boolean ans = false;
        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        for(int i = 0;i < 4; i++)
        {
            int x1 = x + dir[i][0];
            int y1 = y + dir[i][1];
            if( x1 >= 0 && y1 >= 0 && x1 < n && y1 < m && word.charAt(p + 1) == mat[x1][y1])
            {
                mat[x1][y1] = '*';
                ans = ans || func(mat,x1, y1, word,p + 1,n,m);
                mat[x1][y1] = word.charAt(p + 1);
            }
                
            if(ans == true)
                break;
                
        }
        //System.out.println(mat);
        return ans;
        
        
        
    }
    public boolean isWordExist(char[][] mat, String word) 
    {
        // Code here
        int n = mat.length;
        int m = mat[0].length;
        boolean ans = false;
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(mat[i][j] == word.charAt(0))
                {
                    mat[i][j] = '*';
                    ans = ans || func(mat,i,j,word,0,n,m);
                    if(ans == true)
                        break;
                    mat[i][j] = word.charAt(0);
                }
                    
            }
        }
        return ans;
        
    }
}
