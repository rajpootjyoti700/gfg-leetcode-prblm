class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
    boolean[][] dummy=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    // we will mark the places where 0 occure as true
                    dummy[i][j]=true;
                }
            }
            
        }
        // now will travers when we got dummy 0 that row and that col will replacd 
        // as 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dummy[i][j]){
                    for(int c=0;c<n;c++){
                        matrix[i][c]=0;
                    }
                    
                    for(int r=0;r<m;r++){
                        matrix[r][j]=0;
                    }
                }
            }
        }
    }
}