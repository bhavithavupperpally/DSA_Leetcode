class Solution {
    public List<List<Integer>> generate(int numRows) {
        int[][] pascal = new int[numRows][numRows];
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
            
                if (j == 0 || j == i) {
                    pascal[i][j] = 1;
                } else {
                   
                    pascal[i][j]=pascal[i - 1][j - 1] + pascal[i - 1][j];
                }
                row.add(pascal[i][j]);
            }
            result.add(row);
        }

        return result;
    }
}