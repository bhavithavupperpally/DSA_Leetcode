class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int k=n/2;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int ele:nums)
        mp.put(ele,mp.getOrDefault(ele,0)+1);
        for(int ele:mp.keySet())
        {
            if(mp.get(ele)>k)
            return ele;
        }
        return -1;
    }
}