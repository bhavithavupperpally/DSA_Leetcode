class Solution {
    public int findMin(int[] nums) {
       int min=nums[0];
       for(int ele:nums)
       {
        if(ele<min)
        min=ele;
       } 
       return min;
    }
}