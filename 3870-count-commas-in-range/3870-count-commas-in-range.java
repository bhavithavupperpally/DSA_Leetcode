class Solution {
    public int countCommas(int n) {
        int totalcommas=0;
        for(long i=1000;i<=n;i*=10000)
            {
                totalcommas+=(n-i+1);
            }
        return totalcommas;
    }
}