class Solution {
    public void rotate(int[] nums, int k) {
        int[] arr=new int[nums.length];
        int n=nums.length;
        int l=0;
        k=k%n;
        for(int i=n-k;i<n;i++)
        {
            arr[l++]=nums[i];
            
        }
        for(int i=0;i<=n-k-1;i++)
        {
            arr[l++]=nums[i];

        }
        for(int i=0;i<n;i++)
        {
            nums[i]=arr[i];
        }
    }
}