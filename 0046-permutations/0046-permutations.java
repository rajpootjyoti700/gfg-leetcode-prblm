class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();


        permuteHelper(nums, result, new ArrayList<>());

        return result;
     
    }


    private void permuteHelper(int nums[], List<List<Integer>> result, List<Integer> temp){

        if(temp.size() == nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        

        for(int num: nums){

            if(temp.contains(num)){
                continue;
            }

            temp.add(num);

            permuteHelper(nums, result, temp);

            temp.remove(temp.size()-1);
        }
    }
}