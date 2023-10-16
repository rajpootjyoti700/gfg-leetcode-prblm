class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr=new int[3];
        int i=0;
        int j=0;
        int count=0;
        while(j<s.length()){
            arr[s.charAt(j)-'a']++;
            while(arr[0]!=0 &&arr[1]!=0 && arr[2]!=0){
                arr[s.charAt(i)-'a']--;
                i++;
            }
            j++;
            count=count+i;
        }
        return count;
    }
}