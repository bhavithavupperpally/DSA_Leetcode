class Solution {
    public int dominantIndices(int[] nums) {
    int n = nums.length;
    int rsum = 0;

        for(int i = 0; i < nums.length; i++){
            rsum = rsum + nums[i];
        }
        int dcount =0;

        for(int i =0; i <nums.length - 1; i++){
            rsum -= nums[i];
            int relements =n - i-1;
            if((long)nums[i] * relements > rsum){
                dcount++;
            }
        }
        
    return dcount;}
}