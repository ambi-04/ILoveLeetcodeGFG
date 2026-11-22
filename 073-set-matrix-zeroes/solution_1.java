class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row_z[] = new int[n];
        int col_z[] = new int[m];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++){
                if (matrix[i][j] == 0){
                    row_z[i] = -1;
                    col_z[j] = -1;
                }
                
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row_z[i] == -1 || col_z[j] == -1)
                    matrix[i][j] = 0;
            }
        }
        
    }
}