class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int length=0;
        for(int i=0;i<arr1.length;i++){
            length=Math.max(length,arr1[i]);
        }
        int[] count=new int[length+1];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]++;
        }
        int[] ans=new int[arr1.length];
        int k=0;
        for(int i=0;i<arr2.length;i++){
            while(count[arr2[i]]>0){
                ans[k]=arr2[i];
                k++;
                count[arr2[i]]--;
                 }
        }
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                ans[k]=i;
                k++;
                count[i]--;
            }
        }
        return ans;
    }
}