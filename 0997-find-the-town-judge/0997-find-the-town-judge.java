class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] arr=new int[n+1];
        for(int[] r:trust)
        {
            int a=r[0];
            int b=r[1];
            arr[a]-=1;
            arr[b]+=1;


        }
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==n-1)
            return i;
        }
        return -1;
    }
}