        class Node{
            String word;
            int x;
            Node(String word,int x)
            {
                this.word=word;
                this.x=x;
            }
        }
class Solution {
    public boolean isNeighbour(String word1,String word2)
    {
        int diff=0;
        for(int i=0;i<word1.length();i++)
        {
            if(word1.charAt(i)!=word2.charAt(i))
            diff++;
        }
        if(diff==1)
        return true;
        else
        return false;
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Node> q=new LinkedList<>();
        HashSet<String> s=new HashSet<>();
        if(!wordList.contains(endWord))
            return 0;
        
        q.add(new Node(beginWord,1));
        s.add(beginWord);
         
            while(!q.isEmpty())
            {
            Node p=q.remove();
        for(String str:wordList)
        {
            if(isNeighbour(p.word,str)&&(!s.contains(str)))
            {
                if(str.equals(endWord))
                return p.x+1;
                else
                {
                q.add(new Node(str,p.x+1));
                s.add(str);
                }
            }
            }

        }
        return 0;

    }
}