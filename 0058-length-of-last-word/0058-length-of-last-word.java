class Solution {
    public int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String k=str[str.length-1];
        return k.length();
    }
}