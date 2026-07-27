class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] res=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int c=target-nums[i];
            if(mp.containsKey(c)&&mp.get(c)!=i)
            {
                res[0]=i;
                res[1]=mp.get(c);
            }
            mp.put(nums[i],i);
        }
        return res;
    }
}