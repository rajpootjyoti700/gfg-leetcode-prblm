class Solution {
    public String frequencySort(String s) {
         // Step 1: Count the frequency of each character
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Step 2: Sort characters based on their frequency in descending order
        List<Character> sortedChars = new ArrayList<>(charCount.keySet());
        Collections.sort(sortedChars, (a, b) -> charCount.get(b) - charCount.get(a));

        // Step 3: Build the result string by repeating characters according to their frequency
        StringBuilder result = new StringBuilder();
        for (char c : sortedChars) {
            result.append(String.valueOf(c).repeat(charCount.get(c)));
        }

        // Step 4: Return the final sorted string
        return result.toString();
    }
}