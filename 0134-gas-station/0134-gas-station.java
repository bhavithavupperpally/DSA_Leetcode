class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int balance=0;
        int start=0;
        for(int i=0;i<gas.length;i++)
        {
            balance+=gas[i]-cost[i];
        }
        if(balance<0)
        return -1;
        balance=0;
        for(int i=0;i<gas.length;i++)
        {
            balance+=gas[i]-cost[i];
            if(balance<0)
            {
                balance=0;
                start=i+1;
            }
        }
        return start;
    }
}