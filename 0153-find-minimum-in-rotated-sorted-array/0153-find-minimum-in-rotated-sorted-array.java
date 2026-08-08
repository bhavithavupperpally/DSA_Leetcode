class Solution {
    public int findMin(int[] nums) {
       int n=nums.length;
       int last=nums[n-1];
        int low=0,high=n;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]>last)
            low=mid+1;
            else
            high=mid;

        }
        return nums[low];
}
}