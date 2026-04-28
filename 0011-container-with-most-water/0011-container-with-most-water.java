class Solution {
    public int maxArea(int[] height) {
        int L=0;
        int R=height.length-1;
        int res=0;
        while(L<R)
        {
            int H=Math.min(height[L],height[R]);
            int W=R-L;
            int vol=H*W;
            res=Math.max(res,vol);
            if(height[L]<height[R])
            L++;
            else R--;
        }
        return res;
    }
}