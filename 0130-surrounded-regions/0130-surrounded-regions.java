class Solution {
    public void dfs(char[][] board,int row,int col)
    {
        if(row<0||col<0||row>=board.length||col>=board[0].length)
        return;
        if(board[row][col]!='O')
        return;
        board[row][col]='#';
        dfs(board,row+1,col);
        dfs(board,row-1,col);
        dfs(board,row,col+1);
        dfs(board,row,col-1);
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<board[0].length;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board,0,i);
            }
        }
        for(int i=0;i<board[0].length;i++)
        {
                 if(board[m-1][i]=='O')
            {
                dfs(board,m-1,i);
            }
        }
        for(int i=0;i<board.length;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board,i,0);
            }
        }
        for(int i=0;i<board.length;i++)
        {
             if(board[i][n-1]=='O')
            {
                dfs(board,i,n-1);
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(board[i][j]=='O')
                board[i][j]='X';
                else if(board[i][j]=='#')
                board[i][j]='O';
            }
        }
    }
}