class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] leftmax=new int[n];
        int[] rightmax=new int[n];
        int[] arr=new int[n];
        leftmax[0]=height[0];
        rightmax[n-1]=height[n-1];
        
            
            for(int j=1;j<n;j++)
            {
                leftmax[j]=Math.max(leftmax[j-1],height[j]);
            }
            for(int j=n-2;j>=0;j--)
            {
                rightmax[j]=Math.max(rightmax[j+1],height[j]);
            }

        
        int sum=0;
        for(int i=0;i<n;i++)
        {
            
            arr[i]=(Math.min(leftmax[i],rightmax[i])-height[i]);
            sum+=arr[i];
        }
        return sum;
    }
}