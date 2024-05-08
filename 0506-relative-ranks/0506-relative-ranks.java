class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);
        Map<Integer, String> mp = new HashMap<>();
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) mp.put(temp[i], "Gold Medal");
            else if (i == temp.length - 2) mp.put(temp[i], "Silver Medal");
            else if (i == temp.length - 3) mp.put(temp[i], "Bronze Medal");
            else {
                mp.put(temp[i], Integer.toString(temp.length - i));
            }
        }
        for (int i = 0; i < score.length; i++) {
            ans[i] = mp.get(score[i]);
        }
        return ans; 
    }
}