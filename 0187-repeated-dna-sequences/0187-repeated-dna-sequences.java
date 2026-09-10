class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> ans=new ArrayList<>();
        Map<String,Integer> mp=new HashMap<>();
        for(int l=0;l<=s.length()-10;l++)
        {
            String sub=s.substring(l,l+10);
            mp.put(sub,mp.getOrDefault(sub,0)+1);
            int count=mp.get(sub);
            if(count==2)
            ans.add(sub);

        }
        return ans;
    }
}