class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int ele:prices)
        {
            if(ele<min)
            min=ele;
            else if(ele-min>maxprofit)
            maxprofit=ele-min;
        }

        return maxprofit;
    }
}