class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char[] ch1=s.toCharArray();
                char[] ch2=t.toCharArray();
        Arrays.sort(ch1);
                Arrays.sort(ch2);
        String s1=Arrays.toString(ch1);
                String s2=Arrays.toString(ch2);
        if(s1.equals(s2))
            return true;
        else 
            return false;



    }
}