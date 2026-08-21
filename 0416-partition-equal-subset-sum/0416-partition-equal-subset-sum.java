class Solution {
    public boolean canPartition(int[] nums) {
        int totSum = 0;
     
        
        for(int i = 0; i<nums.length; i++){
            totSum+=nums[i];
        }
        if(totSum%2!=0) return false;
        int target = totSum/2;
           Boolean[][] dp = new Boolean[nums.length+1][target+1]; 
           
       return function(nums.length-1,target, nums,dp);
    }
    public boolean function(int i, int target, int[] nums, Boolean[][] dp){
        if(target == 0){
            return true;
        }
        
      if(i<0){
        return false;
      }
      if(dp[i][target] != null){
      return   dp[i][target];
      }
       boolean notTake = function(i-1, target,nums,dp);
       boolean take = false;
       if(nums[i]<=target){
         take =  function (i-1,target-nums[i],nums,dp);
       }

       return  dp[i][target] = take || notTake;
    }
}