class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int ele:prices)
        {
            if(ele<min)
            min=ele;
            if(ele-min>profit)
            profit=ele-min;
        }
        return profit;

        
    
    }
}