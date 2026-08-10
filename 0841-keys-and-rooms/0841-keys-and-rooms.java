class Solution {

    void dfs(int room,HashSet<Integer>visited,List<List<Integer>> rooms)
    {
        visited.add(room);
       
            for(int key:rooms.get(room))
            {
                if(!visited.contains(key))
                {
                    dfs(key,visited,rooms);
                }
            }
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited=new HashSet<>();
        dfs(0,visited,rooms);
    
        if(visited.size()==rooms.size())
        return true;
        return false;
    }
}