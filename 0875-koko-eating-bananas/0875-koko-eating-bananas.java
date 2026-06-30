class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int ele:piles)
        {
            if(ele>max)
            max=ele;
        }
        int low=1,high=max;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            long totalhours=0;
            for(int ele:piles){
                int q=ele/mid;
                int r=ele%mid;
                if(r>0)
                {
                totalhours+=q+1;
                }
            else
                totalhours+=q;
            }
            if(totalhours>h)
            low=mid+1;
            else
            high=mid-1;
        }
        return low;
    }
}