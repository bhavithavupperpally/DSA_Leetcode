class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(!Character.isLetterOrDigit(s.charAt(i)))
            continue;
            sb.append(Character.toLowerCase(s.charAt(i)));
        }
        String o=sb.toString();
        String r=new StringBuilder(sb).reverse().toString();
        return o.equals(r);
    
    }
}