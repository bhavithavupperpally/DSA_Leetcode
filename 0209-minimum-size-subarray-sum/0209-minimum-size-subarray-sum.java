class Solution {
   
    
    public int minSubArrayLen(int target, int[] nums) {
        int min=Integer.MAX_VALUE;
        int l=0;
        int sum=0;
        for(int r=l;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                min=Math.min(min,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(min==Integer.MAX_VALUE)
        min=0;
        return min;
    
    }
}