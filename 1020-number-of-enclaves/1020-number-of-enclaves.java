class Solution {
    public void dfs(int[][] grid,int row,int col)
    {
        if(row<0||col<0||row>=grid.length||col>=grid[0].length)
        return;
        if(grid[row][col]!=1)
        return;
        grid[row][col]=5;
        dfs(grid,row+1,col);
        dfs(grid,row-1,col);
        dfs(grid,row,col+1);
        dfs(grid,row,col-1);
    }
    public int numEnclaves(int[][] grid) {
        int c=0;
        int m=grid.length;
        int n=grid[0].length;
        for(int i=0;i<grid[0].length;i++)
        {
            if(grid[0][i]==1)
            dfs(grid,0,i);
        }
        for(int i=0;i<grid[0].length;i++)
        {
            if(grid[m-1][i]==1)
            dfs(grid,m-1,i);
        }
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][0]==1)
            dfs(grid,i,0);
        }
        for(int i=0;i<grid.length;i++)
        {
            if(grid[i][n-1]==1)
            dfs(grid,i,n-1);
        }
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                c++;
            }
        }
        return c;
    }
}