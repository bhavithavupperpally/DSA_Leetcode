class Solution {
    public int minRotations(String s) {
        int rotation=0;
            int current=0;;
        for(int i=0;i<s.length();i++)
        {
            int next=s.charAt(i)-'0';
            rotation+=Math.min(Math.abs(current-next),(10-Math.abs(current-next)));
            current=s.charAt(i)-'0';
        }
        return rotation;
        
    }
}