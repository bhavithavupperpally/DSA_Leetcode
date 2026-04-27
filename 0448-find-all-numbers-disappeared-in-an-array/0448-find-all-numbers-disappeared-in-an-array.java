class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> s=new HashSet<>();
        List<Integer> res=new ArrayList<>();
        for(int num:nums)
        {
            s.add(num);
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(!s.contains(i))
            res.add(i);
        }
        return res;

    }
}