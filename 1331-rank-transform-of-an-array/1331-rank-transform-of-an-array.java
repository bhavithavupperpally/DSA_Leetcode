class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted=arr.clone();
        //always remember bhavitha!!! Arrays class do not have .clone method it should be Array_name.clone!!!!!
        Arrays.sort(sorted);
        HashMap<Integer,Integer> mp=new HashMap<>();
        int rank=1;
        for(int ele:sorted)
        {
            if(!mp.containsKey(ele))
            {
            mp.put(ele,rank);
            rank++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=mp.get(arr[i]);
        }
        return arr;
    }
}