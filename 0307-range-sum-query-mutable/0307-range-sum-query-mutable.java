class NumArray{
    int[] a,st;
    int n;

    public NumArray(int[] arr){
        n=arr.length;
        a=new int[n];
        for(int i=0;i<n;i++) a[i]=arr[i];
        st=new int[4*n];
        build_st(0,0,n-1);
    }

    void build_st(int idx,int ss,int se){
        if(ss==se){
            st[idx]=a[ss];
            return;
        }

        int m=(ss+se)/2;
        build_st(2*idx+1,ss,m);
        build_st(2*idx+2,m+1,se);
        st[idx]=st[2*idx+1]+st[2*idx+2];
    }

    public void update(int index,int val){
        updatef(0,0,n-1,index,val);
    }

    void updatef(int idx,int ss,int se,int pos,int val){
        if(ss==se){
            a[pos]=val;
            st[idx]=val;
            return;
        }

        int m=(ss+se)/2;

        if(pos<=m)
            updatef(2*idx+1,ss,m,pos,val);
        else
            updatef(2*idx+2,m+1,se,pos,val);

        st[idx]=st[2*idx+1]+st[2*idx+2];
    }

    public int sumRange(int left,int right){
        return rangeSum(0,0,n-1,left,right);
    }

    int rangeSum(int idx,int ss,int se,int qs,int qe){
        if(qe<ss||qs>se) return 0;

        if(qs<=ss&&se<=qe) return st[idx];

        int m=(ss+se)/2;

        int lhs=rangeSum(2*idx+1,ss,m,qs,qe);
        int rhs=rangeSum(2*idx+2,m+1,se,qs,qe);

        return lhs+rhs;
    }
}