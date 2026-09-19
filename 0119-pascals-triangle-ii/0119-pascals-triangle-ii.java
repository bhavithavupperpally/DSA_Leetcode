class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] pascal=new int[34][34];
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<34;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0||j==i)
                pascal[i][j]=1;
                else
                pascal[i][j]=pascal[i-1][j-1]+pascal[i-1][j];
                row.add(pascal[i][j]);
            }
            result.add(row);
        }
        return result.get(rowIndex);
    }
}