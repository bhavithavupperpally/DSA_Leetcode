class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int n=numbers.length;
        int j=numbers.length-1;
        while(i<n)
        {
            if(numbers[i]+numbers[j]>target)
            {
                j--;
            }
            else if(numbers[i]+numbers[j]<target)
            i++;
            else
            return new int[]{i+1,j+1};
        }
        return new int[]{};
        
    }
}