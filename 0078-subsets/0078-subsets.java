class Solution {
     List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         //List<List<Integer>> ans = new ArrayList<>();
       // Set<List<Integer>> res = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array
        fun(nums, 0, ds);

       // for (List<Integer> subset : res) {
           // ans.add(subset);
       // }

        return ans;
    }

    private void fun(int[] nums, int index, List<Integer> ds) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(ds)); 
            return;
        }

        ds.add(nums[index]);
        fun(nums, index + 1, ds);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds);
    }
}