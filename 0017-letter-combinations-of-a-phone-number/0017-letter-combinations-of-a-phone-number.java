class Solution {
   public  void phn(int index,StringBuilder sb,String[] map,List<String> ans,String digits){
        if(index>=digits.length()){
            ans.add(new String(sb));
            return;
        }
        int number=digits.charAt(index)-'0';
        String value=map[number];
        for(int i=0;i<value.length();i++){
            sb=sb.append(value.charAt(i));
            phn(index+1,sb,map,ans,digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<String>();
        if(digits.length()==0)
            return ans;
        int index=0;
        StringBuilder sb=new StringBuilder("");
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        phn(index,sb,map,ans,digits);
        return ans;
        
    }
}