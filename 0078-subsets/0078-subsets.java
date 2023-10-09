      class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
         List<List<Integer>> ans=new ArrayList<>();
        backtrac(nums,0,curr,ans);
        return ans;
    }
        public void backtrac(int[] nums,int i,List<Integer>curr,List<List<Integer>>ans){
            if(i==nums.length){
                ans.add(new ArrayList<Integer>(curr));
                return;
            }
            curr.add(nums[i]);
            backtrac(nums,i+1,curr,ans);
            curr.remove(curr.size()-1);
            backtrac(nums,i+1,curr,ans);
        }
        
            }
        
    