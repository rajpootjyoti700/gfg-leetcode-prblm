class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            mat[i][j]=matrix[n-j-1][i];
        }
        }
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            matrix[i][j]=mat[i][j];
        }
        }
    }
}