class Solution {

    int[] leader;

    int find(int x)
    {
        if(x == leader[x])
            return x;

        return leader[x] = find(leader[x]);
    }

    void merge(int a, int b)
    {
        int sla = find(a);
        int slb = find(b);

        if(sla != slb)
            leader[sla] = slb;
    }

    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;
        int dummy=m*n;
        leader=new int[m*n+1];
        for(int i = 0; i < leader.length; i++)
        {
            leader[i] = i;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]!='O')
                continue;
                int current=i*n+j;

                if(i==0||i==m-1||j==0||j==n-1)
                {
                    merge(current,dummy);
                }
                if(i+1<m&&board[i+1][j]=='O')
                merge(current,(i+1)*n+j);
                if(i-1>=0&&board[i-1][j]=='O')
                merge(current,(i-1)*n+j);
                if(j+1<n&&board[i][j+1]=='O')
                merge(current,(i)*n+j+1);
                if(j-1>=0&&board[i][j-1]=='O')
                merge(current,(i)*n+j-1);

            }
        }
        

       
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(board[i][j] == 'O')
                {
                    int current = i * n + j;

                    if(find(current) != find(dummy))
                    {
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }
}