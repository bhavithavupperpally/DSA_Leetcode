class Solution {

            public boolean dfs(int node,int destination,ArrayList<ArrayList<Integer>> adj,HashSet<Integer> visited)
            {

                if(node==destination)
                return true;
                visited.add(node);
                for(int neighbour:adj.get(node))
                {
                    if(!visited.contains(neighbour))
                    
                    if(dfs(neighbour,destination,adj,visited))
                    return true;
                }
                return false;
            }
   
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
            
        }
        
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
            boolean ans=dfs(source,destination,adj,visited);
            return ans;
    }
}