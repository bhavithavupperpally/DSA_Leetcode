class Solution {
    public long sumAndMultiply(int n) {
        int num=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++)
        {
            int digit=str.charAt(i)-'0';
            if(digit!=0)
            num=num*10+digit;
        }
        int or=num;
        int sum=0;
        while(num>0)
        {
            int rem=num%10;
            sum+=rem;
            num=num/10;
        }
        return (long)or*sum;
    }
}