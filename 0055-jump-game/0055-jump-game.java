class Solution {
    public boolean canJump(int[] nums) {
        int far=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i>far)
            return false;
            int val=i+nums[i];
            far=Math.max(far,val);
        }
        if(far>=nums.length-1)
        return true;
        return false;
    }
}