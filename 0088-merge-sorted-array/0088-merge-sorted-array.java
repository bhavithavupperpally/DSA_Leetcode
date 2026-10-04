class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> l=new ArrayList<>();
        for(int ele=0;ele<m;ele++)
        l.add(nums1[ele]);
        for(int ele:nums2)
        l.add(ele);
        Collections.sort(l);
         for(int i=0;i<nums1.length;i++)
         {
            nums1[i]=l.get(i);
         }
       

    }
}