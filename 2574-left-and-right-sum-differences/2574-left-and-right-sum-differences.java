class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        
        // Calculate the total sum of the array first
        for (int num : nums) {
            rightSum += num;
        }
        
        int[] ans = new int[nums.length];
        
        // Compute differences on the fly
        for (int i = 0; i < nums.length; i++) {
            // Exclude the current element from the right side sum
            rightSum -= nums[i]; 
            
            // Calculate absolute difference
            ans[i] = Math.abs(leftSum - rightSum); 
            
            // Include the current element into the left side sum for the next index
            leftSum += nums[i]; 
        }
        
        return ans;
    }
}
