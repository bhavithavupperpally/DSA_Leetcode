class Solution {
    public int firstMissingPositive(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n:nums)
        {
            if(n>0)
            arr.add(n);
        }
        int[] a=new int[arr.size()];
        for(int i=0;i<arr.size();i++)
        {
            a[i]=arr.get(i);
        }
        Arrays.sort(a);
        int target=1;
        for(int n:a)
        {
            if(n==target)
            target++;
            else if(n>target)
            return target;
        }
        return target;
    }
}