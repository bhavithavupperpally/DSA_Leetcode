class Solution{
    public int createSortedArray(int[] instructions){
        final int MOD=1000000007;
        int maxval=0;
        for(int x:instructions) maxval=Math.max(maxval,x);
        ST st=new ST(maxval);
        long totalcost=0;
        for(int i=0;i<instructions.length;i++){
            int x=instructions[i];
            long lesscount=st.rangeQuery(0,x-1);
            long greatercount=st.rangeQuery(x+1,maxval);
            totalcost=(totalcost+Math.min(lesscount,greatercount))%MOD;
            long currentcount=st.rangeQuery(x,x);
            st.update(x,(int)currentcount+1);
        }
        return (int)totalcost;
    }
}

class ST{
    long[] st;
    int mxVal=0;

    public ST(int mxVal){
        st=new long[4*(mxVal+4)];
        this.mxVal=mxVal;
    }

    long rangeQuery(int l,int r){
        if(l>r) return 0;
        return rangeHelper(0,0,mxVal,l,r);
    }

    long rangeHelper(int idx,int ss,int se,int qs,int qe){
        if(qe<ss||qs>se) return 0;
        if(ss>=qs&&se<=qe) return st[idx];

        int mid=ss+(se-ss)/2;
        long lhs=rangeHelper(2*idx+1,ss,mid,qs,qe);
        long rhs=rangeHelper(2*idx+2,mid+1,se,qs,qe);
        return lhs+rhs;
    }

    public void update(int idx,int val){
        updateHelper(0,0,mxVal,idx,val);
    }

    private void updateHelper(int node,int ss,int se,int idx,int val){
        if(ss==se){
            st[node]=val;
            return;
        }

        int mid=ss+(se-ss)/2;

        if(idx<=mid)
            updateHelper(2*node+1,ss,mid,idx,val);
        else
            updateHelper(2*node+2,mid+1,se,idx,val);

        st[node]=st[2*node+1]+st[2*node+2];
    }
}