class Solution {
    public String reverseWords(String str) {
       String s = str.strip();
       String[] arr=s.split("\\s+");
        List<String> list=Arrays.asList(arr);
        Collections.reverse(list);
        String result=String.join(" ",list);
        return result;
    }
}