class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        //So we will raverse left to right ,right to bottom bottom to left
        // and left to top
        // reduce all those directions
        int top=0;
        int right=n-1;
        int bottom=m-1;
        int left=0;
        
        // iterete from left to right 
        while(top<=bottom && left<=right){
        for(int i=left;i<=right;i++){
            list.add(matrix[top][i]);
        }
            top++;
            
            for(int i=top;i<=bottom ;i++){
                list.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--){
                list.add(matrix[bottom][i]);
            }
            bottom--;
            }
            if(left<=right){
            for(int i=bottom; i>=top;i--){
                list.add(matrix[i][left]);
            }
            left++;
            }
        }
       return list; 
    }
}