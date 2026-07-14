class Solution {
    public int maxDigitRange(int[] nums) {
       
        int maxrange=-1;
        int sum=0;
        for(int i:nums)
            {
                int temp=i;
                int max=0;
                int min=9;
                while(temp>0)
                    {
                        if(temp==0)
                        {
                            min=0;
                            max=0;
                      }
                        else{
                            
                        
                        int digit=temp%10;
                        max=Math.max(max,digit);
                        min=Math.min(min,digit);
                        temp/=10;
                        }
                    }
                int c=max-min;
                if(c>maxrange)
                {
                    maxrange=c;
                    sum=i;
                }
                else if(c==maxrange)
                {
                    sum+=i;
                }
            }
              
        return sum;
    }
}