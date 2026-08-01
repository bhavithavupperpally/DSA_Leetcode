class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for(char ele:letters)
        {
            if(ele>target)
            return ele;
        }
        return letters[0];
    }
}