class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums); // Sort the input array
        fun(nums, 0, ds, res);

        for (List<Integer> subset : res) {
            ans.add(subset);
        }

        return ans;
    }

    private void fun(int[] nums, int index, List<Integer> ds, Set<List<Integer>> res) {
        if (index == nums.length) {
            res.add(new ArrayList<>(ds)); 
            return;
        }

        ds.add(nums[index]);
        fun(nums, index + 1, ds, res);
        ds.remove(ds.size() - 1);
        fun(nums, index + 1, ds, res);
    }
}