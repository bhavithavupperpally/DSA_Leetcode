class Solution {
    public int lengthOfLongestSubstring(String s) {
          int[] lastIndex = new int[256]; // ASCII
        for (int i = 0; i < 256; i++) lastIndex[i] = -1;

        int maxLen = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If character seen after start, move start
            if (lastIndex[c] >= start) {
                start = lastIndex[c] + 1;
            }

            lastIndex[c] = i; // Update last seen index
            maxLen = Math.max(maxLen, i - start + 1);
        }

        return maxLen;
    }
}