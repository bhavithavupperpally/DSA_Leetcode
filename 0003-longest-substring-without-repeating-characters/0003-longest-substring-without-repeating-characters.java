class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int L=0;
        Set<Character> window=new HashSet<>();
        for(int R=0;R<s.length();R++)
        {
            while(window.contains(s.charAt(R)))
            {
                window.remove(s.charAt(L));
                L++;
            }
            window.add(s.charAt(R));
            max=Math.max(max,R-L+1);
        }
        return max;
    }
}