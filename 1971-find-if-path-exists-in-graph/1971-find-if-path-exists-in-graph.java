class Solution {
   int[] leader;
   int size[];
   int find(int x)
   {
    if(x==leader[x])
    return x;
    return leader[x]=find(leader[x]);
   }
   void merge(int a,int b)
   {
    int sla=find(a);
    int slb=find(b);
    if(sla!=slb)
    {
    
    leader[sla]=slb;
    }
 }
   
    public boolean validPath(int n, int[][] edges, int source, int destination) {
       leader=new int[n];
       size=new int[n];
        for(int i=0;i<n;i++)
        {
            leader[i]=i;
            size[i]=1;
        }
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            merge(u,v);
        }
        if(find(source)==find(destination))
        return true;
    else
        return false;
       

    }
}