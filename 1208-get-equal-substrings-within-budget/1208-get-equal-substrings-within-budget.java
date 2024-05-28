class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
         int n = s.length();
        int start = 0;
        int current_cost = 0;
        int max_length = 0;

        for (int end = 0; end < n; ++end) {
            current_cost += Math.abs(s.charAt(end) - t.charAt(end));

            while (current_cost > maxCost) {
                current_cost -= Math.abs(s.charAt(start) - t.charAt(start));
                ++start;
            }

            max_length = Math.max(max_length, end - start + 1);
        }

        return max_length;
    }
}