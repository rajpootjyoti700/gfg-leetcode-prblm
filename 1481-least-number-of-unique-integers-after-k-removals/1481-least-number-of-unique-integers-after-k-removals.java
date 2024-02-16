class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=arr.length;
        int[] nums=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            if(mp.containsKey(arr[i])){
               mp.put(arr[i],mp.get(arr[i])+1); 
            }
            else
                mp.put(arr[i],1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int a: mp.values()){
            list.add(a);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            if(k>list.get(i)){
                k=k-list.get(i);
                list.set(i,0);
            }
            else{
                list.set(i,list.get(i)-k);
                k=0;
            }
             if(list.get(i)!=0)
                 count++;
        }
        return count;
        
    }
}