class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] dist=new int[n][n];
        int INF=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
           Arrays.fill(dist[i],INF);
            dist[i][i]=0;
            
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            dist[u][v] = w;
            dist[v][u] = w;
        }

        for(int m=0;m<n;m++)
        {
            for(int s=0;s<n;s++)
            {
                for(int e=0;e<n;e++)
                {
                    if(dist[s][m]==INF||dist[m][e]==INF)
                    continue;
                    dist[s][e]=Math.min(dist[s][e],dist[s][m]+dist[m][e]);
                }
            }
        }
        int min=INF;
        int resultcity=-1;
        for(int i=0;i<n;i++)
        {
            int reachablecount=0;
            for(int j=0;j<n;j++)
            {
                if(dist[i][j]<=distanceThreshold)
                
                reachablecount++;
            }
           if(reachablecount<=min)
           {
           min=reachablecount;
            resultcity=i;
           }
           
        }
        return resultcity;
    }
}