class Solution {
    public long removeZeros(long n) {
        long result=0;
        while(n>0)
        {
            long rem=n%10;
            if(rem!=0)
            {
                result=result*10+rem;
            }
            n=n/10;
        }
        long finalresult=0;
        while(result>0)
        {
            long rem=result%10;
            finalresult=finalresult*10+rem;
            result=result/10;
        }
        return finalresult;


    }
}