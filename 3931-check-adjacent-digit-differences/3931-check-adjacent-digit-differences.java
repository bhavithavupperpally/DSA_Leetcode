class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0;i<s.length()-1;i++)
            {
                int cu=s.charAt(i)-'0';
                int nex=s.charAt(i+1)-'0';

                if(Math.abs(cu-nex)>2)
                    return false;
            }
        return true;
    }
}