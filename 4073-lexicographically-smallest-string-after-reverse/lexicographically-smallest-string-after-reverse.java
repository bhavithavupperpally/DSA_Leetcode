class Solution {
    public String lexSmallest(String s) {
        String small = s;
        for (int k = 1; k <= s.length(); k++) {
            String first = s.substring(0, k);
            String last = s.substring(s.length() - k);

            // Reverse both
            String revFirst = new StringBuilder(first).reverse().toString();
            String revLast = new StringBuilder(last).reverse().toString();

            // Option 1: reverse first k
            String cand1 = revFirst + s.substring(k);
            // Option 2: reverse last k
            String cand2 = s.substring(0, s.length() - k) + revLast;

            // Keep the lexicographically smallest
            if (cand1.compareTo(small) < 0) small = cand1;
            if (cand2.compareTo(small) < 0) small = cand2;
        }
        return small;
    }
}
