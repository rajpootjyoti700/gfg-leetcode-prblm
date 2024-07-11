class Solution {
    public String reverseParentheses(String s) {
     // we will solve this with the help stack 
        // in which we will store the index of pair of open and close bracket 
        // and change the direction whenever we got the counter bracket
        Stack<Integer> st=new Stack<>();
        int n=s.length();
        // take an array which will contain index of the close and the open 
        // bracket;
        int[] pair=new int[n];
        
        // start traversing 
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                int j=st.pop();
                pair[i]=j;
                pair[j]=i;
            }
        }
        
        int i=0;
        // we have to take the builder for any typeof modification in the string 
        StringBuilder sb =new StringBuilder();
        int direction=1;
        
      while(i<n){
          // take the corrosponding pair of index in close or open 
          if(s.charAt(i)=='(' || s.charAt(i)==')'){
              direction =-direction;
              i=pair[i];
          }
          else{
              sb.append(s.charAt(i));
          }
          i=i+direction;
      }
        return sb.toString();
     }
}