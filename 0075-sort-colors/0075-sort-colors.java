class Solution {
    public void sortColors(int[] nums) {
        int cz=0,co=0,ct=0;
        for(int num:nums)
        {
            if(num==0)
            cz++;
            else if(num==1)
            co++;
            else
            ct++;
        }
        int i=0;
        while(cz>0)
        {
            nums[i++]=0;
            cz--;
        }
        while(co>0)
        {
            nums[i++]=1;
            co--;
        }
        while(ct>0)
        {
            nums[i++]=2;
            ct--;
        }
        
    }
}