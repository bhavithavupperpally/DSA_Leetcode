class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int ele:nums)
        {
            freq.put(ele,freq.getOrDefault(ele,0)+1);
        }
        for(Map.Entry<Integer,Integer> ele:freq.entrySet())
        {
            int f=ele.getValue();
            if(f>1)
            return true;
        }
        return false; 
        
    }
}