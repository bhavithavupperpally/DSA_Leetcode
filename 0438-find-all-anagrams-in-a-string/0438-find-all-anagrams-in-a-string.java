class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (p.length() > s.length()) return res;

        Map<Character, Integer> freqP = new HashMap<>();
        Map<Character, Integer> freqWindow = new HashMap<>();

        // Build frequency map for p
        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            freqP.put(ch, freqP.getOrDefault(ch, 0) + 1);
        }

        // Build frequency map for first window
        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            freqWindow.put(ch, freqWindow.getOrDefault(ch, 0) + 1);
        }

        // Check first window
        if (freqWindow.equals(freqP)) {
            res.add(0);
        }

        // Sliding window
        for (int i = p.length(); i < s.length(); i++) {

            char enter = s.charAt(i);
            char leave = s.charAt(i - p.length());

            // Add entering character
            freqWindow.put(enter, freqWindow.getOrDefault(enter, 0) + 1);

            // Remove leaving character
            freqWindow.put(leave, freqWindow.get(leave) - 1);

            if (freqWindow.get(leave) == 0) {
                freqWindow.remove(leave);
            }

            // Compare maps
            if (freqWindow.equals(freqP)) {
                res.add(i - p.length() + 1);
            }
        }

        return res;
    }
}
