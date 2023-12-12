class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> mp1=new HashSet<>();
        HashSet<Integer> mp2=new HashSet<>();
        for(int a : nums1){
            mp1.add(a);
        }
        for(int n2: nums2){
            if(mp1.contains(n2)){
                mp2.add(n2);
            }
        }
       // int[] arr=new int[nums2.length];
       // for(int i=0;i<nums2.length;i++){
            
       // }
        int[] result=new int[mp2.size()];
        int i=0;
        for(int c: mp2){
            result[i]=c;
            i++;
        }
        return result;
    }
}