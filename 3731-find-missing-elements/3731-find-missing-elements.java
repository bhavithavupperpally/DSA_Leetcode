class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        for(int ele:nums)
        {
            min=Math.min(min,ele);
            max=Math.max(max,ele);
        }
        HashSet<Integer> s=new HashSet<>();
        for(int ele:nums)
        {
            s.add(ele);
        }
        for(int i=min;i<=max;i++)
        {
            if(!s.contains(i))
            ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
}