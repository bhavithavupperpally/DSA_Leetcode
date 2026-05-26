class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> st=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        for(int ele:nums1)
        {
            st.add(ele);
        }
        for(int num:nums2)
        {
            if(st.contains(num))
            {
            ans.add(num);
            st.remove(num);
            }
        }
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
           result[i]=ans.get(i);
        }
        return result;
    }
}