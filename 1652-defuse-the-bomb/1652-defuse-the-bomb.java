class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] result=new int[code.length];
        int n=code.length;
            if(k==0)
            return result;
            else if(k>0)
            {
             for(int i=0;i<n;i++)
             {
                int sum=0;
                for(int j=1;j<=k;j++)
                {
                    sum+=code[(i+j)%n];

                }
                result[i]=sum;
             }   

            }
            else
            {
                for(int i=0;i<code.length;i++)
                {
                    int sum=0;
                    for(int j=1;j<=-k;j++)
                    {
                        sum+=code[((i-j)+n)%n];
                    }
                    result[i]=sum;
                }
            }
            return result;

            }
}