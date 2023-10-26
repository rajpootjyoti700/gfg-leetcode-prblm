class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> list=new ArrayList<>();
        sum(0,target,candidates,ans,list);
        return ans;
    }
    public void sum(int index,int target,int[] arr,List<List<Integer>> ans,List<Integer> list){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=index;i<arr.length;i++){
           if(i>index && arr[i]==arr[i-1])
               continue;
            if(arr[i]>target)
                break;
            list.add(arr[i]);
            sum(i+1,target-arr[i],arr,ans,list);
            list.remove(list.size()-1);
        }
    }
}