class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end = height.length-1;
        int cur=0,max=0;
       while(start<end)
            {
                cur =(end-start) * Math.min(height[start],height[end]);
                max = Math.max(max,cur);
                if(height[start]<=height[end])
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        return max;
    }
}