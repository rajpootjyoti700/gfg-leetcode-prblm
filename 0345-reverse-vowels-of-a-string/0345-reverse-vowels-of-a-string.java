class Solution {
    public String reverseVowels(String s) {
      HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u',
                                                            'A', 'E', 'I', 'O', 'U'));
        StringBuilder sb = new StringBuilder(s);
        int i = 0, j = s.length() - 1;

        while(i < j)
        {
            while(i < j && !set.contains(sb.charAt(i)))
                i++;
            
            while(i < j && !set.contains(sb.charAt(j)))
                j--;
            
            if (i < j) 
            {
                char temp = sb.charAt(i);
                sb.setCharAt(i, sb.charAt(j));
                sb.setCharAt(j, temp);
                i++;
                j--;
            }
        }
        return sb.toString();    
        
    }
}