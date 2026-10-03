class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();
        
        for(int k=1;k<n;k++)
        {
            if(n%k!=0)
            continue;
            boolean same =true;
            for(int i=k;i<n;i++)
            {
                if(s.charAt(i)!=s.charAt(i%k))
                {
                    same =false;
                    break;
                }
            }
            if(same)
            return true;
        }
        return false;
    }
}