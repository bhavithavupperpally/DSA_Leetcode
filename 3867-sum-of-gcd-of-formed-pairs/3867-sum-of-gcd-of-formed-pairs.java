class Solution {
    
    public int gcd(int a,int b)
    {
        return b==0?a:gcd(b,a%b);
    }
    
    public long gcdSum(int[] nums) {
        int max=nums[0];
        int prefix[] =new int[nums.length]; 
        for(int i=0;i<nums.length;i++)
         {
         max=Math.max(max,nums[i]); 
         prefix[i]=gcd(nums[i],max); 
         }
         Arrays.sort(prefix);
         long ans=0;
         int left=0;
         int right=prefix.length-1;
         while(left<right)
         {
            ans+=gcd(prefix[left],prefix[right]);
            left++;
            right--;
         }
         return ans;
    }
}