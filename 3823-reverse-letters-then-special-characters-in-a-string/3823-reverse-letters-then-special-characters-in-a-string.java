class Solution {
    public String reverseByType(String s) {
        List<Character> letters=new ArrayList<>();
        List<Character> specials=new ArrayList<>();
        for(char ch:s.toCharArray())
        {
            if(ch>='a'&&ch<='z')
            {
                letters.add(ch);
            }
            else
            specials.add(ch);
        }
        Collections.reverse(letters);
        Collections.reverse(specials);
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        for(char ch:s.toCharArray())
        {
            if(ch>='a'&&ch<='z')
            {
                sb.append(letters.get(i++));
            }
            else
            sb.append(specials.get(j++));
        }
        return sb.toString();
    }
}