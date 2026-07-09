
    class Solution {
    public boolean dfs(ArrayList<ArrayList<Integer>> graph,
                       boolean[] visited,
                       boolean[] pathVisited,
                       int node) {
        visited[node] = true;
        pathVisited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(graph, visited, pathVisited, neighbor))
                    return true;    
            }
            else if (pathVisited[neighbor]) {
                return true;        
            }
        }
        pathVisited[node] = false;

        return false;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            graph.get(edge[1]).add(edge[0]);
        }
        boolean[] visited = new boolean[numCourses];
        boolean[] pathVisited = new boolean[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (!visited[i]) {

                if (dfs(graph, visited, pathVisited, i))
                    return false;   
            }
        }

        return true;                
    }
}