class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sum(0,candidates,target,ans,list);
        return ans;
        
    }
    private void sum(int index, int[] arr, int target,List<List<Integer>> ans,List<Integer> list ){
        if(index==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[index]<=target){
            list.add(arr[index]);
            sum(index,arr,target-arr[index],ans,list);
            list.remove(list.size()-1);
            
        }
        sum(index+1,arr,target,ans,list);
    }
}