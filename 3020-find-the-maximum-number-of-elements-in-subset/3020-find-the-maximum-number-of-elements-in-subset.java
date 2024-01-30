class Solution {
    public int maximumLength(int[] nums) {
       int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) map.put(n, map.getOrDefault(n, 0) + 1);
        
        for(int n : nums) {
            int num = n * n;
            int count = 0;

            if(n != 1 && map.get(n) > 1) {
                count += 2;
                while(map.containsKey(num) && map.get(num) > 1){
                    num = num * num;
                    count += 2;
                }

            }else {
                count = map.get(n);
                ans = Math.max(ans, count % 2 == 0 ? count - 1 : count);
                continue;
            }

            if(map.containsKey(num)) {
                ans = Math.max(ans, count + 1);
            }else {
                ans = Math.max(ans, count - 1);
            }
        }
        return ans; 
    }
}