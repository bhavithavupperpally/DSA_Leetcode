class Solution {
    public String largestEven(String s) {
        int n=s.length();
        int index=-1;
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch=='2'){
            index=i;
            break;
            }
        }
        String str="";
        if(index!=-1)
        {
            for(int k=0;k<index+1;k++)
            {
                str+=s.charAt(k);
            }
        }
        return str;
    }
}