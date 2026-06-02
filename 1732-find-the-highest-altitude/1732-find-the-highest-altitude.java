class Solution {
    public int largestAltitude(int[] gain) {
        int ans[] =new int[gain.length];
        ans[0]=gain[0];
        for(int i=1;i<gain.length;i++)
        {
                ans[i]=ans[i-1]+gain[i];
        }
        int max=0;
        for(int ele:ans){
            if(ele>max)
            max=ele;
        }
        return max;
        
    }
}