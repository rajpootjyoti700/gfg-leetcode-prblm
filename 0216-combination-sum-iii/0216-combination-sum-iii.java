class Solution {
    public void sum(int index,int sum,int k,int n,List<List<Integer>> ans,List<Integer> list){
        if(sum==n && k==0){
            ans.add(new ArrayList<>(list));
                return;
        }
        if(sum>n)
            return;
        for(int i=index;i<=9;i++){
            if(i>n)
                break;
            list.add(i);
        sum(i+1,sum+i,k-1,n,ans,list);
            list.remove(list.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        sum(1,0,k,n,ans,list);
        return ans;
    }
}