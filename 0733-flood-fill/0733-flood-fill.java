class Solution {
    public void dfs(int[][] image,int sr,int sc,int c,int color)
    {
        if(sr<0||sc<0||sr>=image.length||sc>=image[0].length)
        return;
        
        if(image[sr][sc]!=c)
        return;
        image[sr][sc]=color;
        dfs(image, sr-1, sc, c,color);
        dfs(image, sr+1, sc, c,color);
        dfs(image, sr, sc+1, c,color);
        dfs(image, sr, sc-1, c,color);
        
        
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       
               
               int c=image[sr][sc];
               if (c == color)
                 return image;
                dfs(image,sr,sc,c,color);
                return image;
    }
}