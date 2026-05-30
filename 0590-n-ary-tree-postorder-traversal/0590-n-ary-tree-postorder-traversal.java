/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
        return ans;
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty())
        {
            Node nd=st.pop();

            for(Node n:nd.children )
            {
                st.push(n);
            }
            ans.add(nd.val);
        }
        Collections.reverse(ans);
        return ans;

    }
}