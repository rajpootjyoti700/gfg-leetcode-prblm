class Solution {
    public void phn(int index,String digits,StringBuilder sb,List<String> ans,String[] map){
        if(index>=digits.length()){
            ans.add(new String(sb));  // convert the string builder into string
                return;
        }
        int number=digits.charAt(index)-'0';
        String value=map[number];
        for(int i=0;i<value.length();i++){
            sb=sb.append(value.charAt(i));
            phn(index+1,digits,sb,ans,map);
            sb.deleteCharAt(sb.length()-1);
        }
            
    }
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0)
            return ans;
            
        int index=0;
        String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder("");
        phn(index,digits,sb,ans,map);
        return ans;
        
    }
}