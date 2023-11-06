class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];
        for(var chr : t.toCharArray()){
            freq[chr - 'a']++;
        }
        for(var chr : s.toCharArray()){
            freq[chr - 'a']--;
        }
        for(int diff = 0; diff < 26; diff++){
            if(freq[diff] != 0){
                return (char)(diff + 'a');
            }
        }
        return '*';
    }
}