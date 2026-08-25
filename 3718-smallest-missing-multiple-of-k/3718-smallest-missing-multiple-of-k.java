class Solution {
    public int missingMultiple(int[] nums, int k) {
        int m=k;
        while(true)
        {
            boolean found=false;
        for(int i :nums)
        {   
            if(i==m)
            {
                found=true;
                break;
            }
        }
        if(!found)
        return m;
        else
        m=m+k;
        }
    }
}