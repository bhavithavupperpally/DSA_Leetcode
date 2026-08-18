class Solution {
    public String longestNiceSubstring(String s) {
        if(s.length()<2)
        return "";
        Set<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            set.add(ch);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!set.contains(Character.toUpperCase(ch))||!set.contains(Character.toLowerCase(ch)))
            {
                String left=longestNiceSubstring(s.substring(0,i));
                String right=longestNiceSubstring(s.substring(i+1,s.length()));
                if(left.length()>=right.length())
                return left;
                else
                return right;
            }
        }
            return s;
    }
}