class Solution {
    public boolean validPath(int n, int[][] edges, int src, int dest) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(i,new ArrayList<>());
        }
        Queue<Integer> q=new LinkedList<>();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<edges.length;i++)
        {
            int u=edges[i][0];
            int v=edges[i][1];
            mp.get(u).add(v);
            mp.get(v).add(u);

        }
        q.add(src);
        s.add(src);
        
        while(!q.isEmpty())
        {
            int u=q.remove();
            if(u==dest) return true;
            for(int v:mp.get(u))
            {
                if(!s.contains(v))
                {
                    q.add(v);
                    s.add(v);
                }
            }
        }
        return false;
    }
}