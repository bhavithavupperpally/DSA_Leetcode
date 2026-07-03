class Solution {
   public int dfs(int[][] grid,int row,int col)
   {
    if(row<0||col<0||row>=grid.length||col>=grid[0].length)
    {
        return 0;
    }
    if(grid[row][col]==0)
    return 0;
    int area=1;
    grid[row][col]=0;
    area+=dfs(grid,row,col-1);
    area+=dfs(grid,row-1,col);
    area+=dfs(grid,row,col+1);
    area+=dfs(grid,row+1,col);
    return area;
   }
    public int maxAreaOfIsland(int[][] grid) {
        int maxarea=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                int p=dfs(grid,i,j);
                maxarea=Math.max(maxarea,p);
            }
        }
        return maxarea;
    }
}