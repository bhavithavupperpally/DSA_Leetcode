class Solution {
    public int minCostConnectPoints(int[][] points) {
      int n=points.length;
        List<Edge> allEdges=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                
                int dist=Math.abs(points[i][0]-points[j][0])+Math.abs(points[i][1]-points[j][1]);

                allEdges.add(new Edge(i,j,dist));
            }
        }
        Collections.sort(allEdges,(a,b)->a.cost-b.cost);
        USDF uf=new USDF(n);
        int totalCost=0;
        int edgesUsed=0;
        for(Edge edge:allEdges)
        {
            if(uf.union(edge.u,edge.v))
            {
                totalCost+=edge.cost;
                edgesUsed++;
                if(edgesUsed==n-1)
                {
                    break;
                }
            }
        }
        return totalCost;
    }
}
class Edge{
int u,v,cost;
Edge(int u,int v,int cost)
{
    this.u=u;
    this.v=v;
    this.cost=cost;
}
}
class USDF
{
int[] parent;
int[] rank;
USDF(int n)
{
    parent=new int[n];
    rank=new int[n];
    for(int i=0;i<n;i++)
    {
        parent[i]=i;
        rank[i]=i;
    }
}
int find(int i)
{
    if(parent[i]==i)
    {
        return i;
    }
    return parent[i]=find(parent[i]);
}
boolean union(int i,int j)
{
    int rooti=find(i);
    int rootj=find(j);
    if(rooti!=rootj)
    {
        if(rank[rooti]>rank[rootj])
        parent[rootj]=rooti;
        else if(rank[rooti]<rank[rootj])
        parent[rooti]=rootj;
        else
        parent[rootj]=rooti;
        rank[rooti]++;
    return true;
    }
return false;
}
}