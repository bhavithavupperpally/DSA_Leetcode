class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        UnionFind uf = new UnionFind(n);

        for(int[] edge: edges){
            if( ! uf.union(edge[0]-1, edge[1]-1) ){
                return edge;
            }
        }

        return new int[]{};     // won't reach here as per problem.
    }

    static class UnionFind {
        int[] parent;

        public UnionFind(int n) {
            parent = new int[n];
            Arrays.fill(parent, -1);        // no parent, single node currently in component, khud ka parent
        }

        public int find(int x) {
            if (parent[x] == -1) {
                return x;
            }
            return parent[x] = find(parent[x]);       // pruning , path compression
        }

        public boolean union(int a, int b) {
            a = find(a);
            b = find(b);
            if (a != b) {
                parent[a] = b;
                return true;    
            }
            return false;       // already part of one component. 
        }
    }
}