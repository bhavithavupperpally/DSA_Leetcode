class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums)
        set.add(ele);
        int i=0;
        for(int ele:set)
        {
            nums[i++]=ele;
        }
        if(set.size()<3)
        return Collections.max(set);
       set.remove(Collections.max(set));
       set.remove(Collections.max(set));
       return Collections.max(set);
    }
}