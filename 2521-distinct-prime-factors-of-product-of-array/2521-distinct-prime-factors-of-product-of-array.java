class Solution {
    public int distinctPrimeFactors(int[] nums) {
       int n=nums.length;
       HashSet<Integer> s=new HashSet<>();
       for(int num:nums)
       {
        for(int i=2;i*i<=num;i++)
        {
            while(num%i==0)
            {
                s.add(i);
                num=num/i;
            }
        }

       if(num>1)
       s.add(num);
       }
        return s.size();
    }
}