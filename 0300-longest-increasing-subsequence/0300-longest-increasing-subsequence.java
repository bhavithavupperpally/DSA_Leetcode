class Solution {
    int lcsLen(int[] nums1,int nums2[])
    {
        int n1=nums1.length;
        int n2=nums2.length;
        int[][] dp=new int[n1+1][n2+1];
        for(int i=n1-1;i>=0;i--)
        {
            for(int j=n2-1;j>=0;j--)
            {
                if(nums1[i]==nums2[j])
                {
                    dp[i][j]=1+dp[i+1][j+1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        return dp[0][0];
    }

    public int lengthOfLIS(int[] nums) {
        Set<Integer> st=new TreeSet<>();

        for(int e:nums)
        {
            st.add(e);
        }
        int[] nums2=new int[st.size()];
        int i=0;
        for(int ele:st)
        {
            nums2[i]=ele;
            i++;
        }
        int len=lcsLen(nums,nums2);
        return len;

    }
}