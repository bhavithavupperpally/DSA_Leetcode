class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int ele:nums)
        {
            sum+=ele;
        }
        if(sum%2!=0)
        return false;
        int target=sum/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int ele:nums)
        {
           for(int i=target;i>=ele;i--)
           {
            if(dp[i-ele])
            dp[i]=true;
           }
        }
        return dp[target];
    }
}