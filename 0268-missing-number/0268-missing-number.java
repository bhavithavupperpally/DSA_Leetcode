class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int max=nums[0];
        for(int ele:nums)
        {
            sum+=ele;
            if(ele>max)
            max=ele;
        }
        int n=nums.length;
        int ts=n*(n+1)/2;
       
        return ts-sum;

    }
}