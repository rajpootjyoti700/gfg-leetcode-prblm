class Solution {
    public int minOperations(String[] logs) {
      // the main conecpt is in the last step what the no of 
        //folder present that no of folder actually we have to return 
         
        // let take no of folder 0
        int count=0;
        for(String arr: logs){
            if(arr.equals("../")){
                if(count>0)
                    count--;
            }
             else if(!arr.equals("./")){
                count++;
            }
        }
        return count;
    }
}