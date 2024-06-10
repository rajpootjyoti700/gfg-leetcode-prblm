class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int count=0;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=heights[i];
        }
        Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(temp[i]!=heights[i])
                count++;
        }
        return count;
    }
}