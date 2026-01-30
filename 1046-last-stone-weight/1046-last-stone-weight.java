class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int s:stones)
        pq.add(s);
        while(pq.size()>1)
        {
            int max1=pq.remove();
            int max2=pq.remove();
            if(max1!=max2)
            pq.add(max1-max2);
        }
        if(pq.isEmpty())
        return 0;
        return pq.peek();
    }
}