class Solution {
    public int leastInterval(char[] tasks, int n) {
         int[] arr = new int[26];
        for (int i=0; i<tasks.length; i++)  {
            int temp = tasks[i]-'A';
            arr[temp]++;
        }
        int ct = 1;
        Arrays.sort(arr);
        int maxi = arr[arr.length-1];
        for (int i=0; i<arr.length-1; i++) {
            if (arr[i]==maxi) ct++;
        }
        int ans = (maxi-1)*(n+1)+ct;
        return Math.max(ans, tasks.length);
    }
}