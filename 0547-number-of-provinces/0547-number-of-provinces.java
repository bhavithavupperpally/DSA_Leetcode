class Solution {
    void dfs(int[][] g,int i,HashSet<Integer> visited,int n)
    {
       visited.add(i);
       for(int j=0;j<n;j++)
       {
            if(g[i][j]==1&&!visited.contains(j))
            {
                dfs(g,j,visited,n);
            }
       }
        
    }
    public int findCircleNum(int[][] g) {
        int n=g.length;
        int count=0;
        HashSet<Integer> visited=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!visited.contains(i))
            {
                count++;
                dfs(g,i,visited,n);
            }
        }
        return count;
    }
}