class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!mp.containsKey(sorted))
            mp.put(sorted,new ArrayList<>());
            mp.get(sorted).add(s);
        }
       return new ArrayList<>(mp.values());
    }
}