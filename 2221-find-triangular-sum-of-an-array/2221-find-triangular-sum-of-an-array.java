class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        int[][] matrix=new int[n][n];
        for(int i=0;i<n;i++)
        {
            matrix[0][i]=nums[i];
        }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                matrix[i][j]=(matrix[i-1][j+1]+matrix[i-1][j])%10;
            }
        }
        return matrix[n-1][0];
    }
}