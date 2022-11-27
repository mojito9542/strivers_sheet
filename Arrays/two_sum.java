class two_sum {
        public pair[] allPairs( long A[], long B[], long N, long M, long X) {
            Arrays.sort(A);
            Arrays.sort(B);
            ArrayList<pair> a=new ArrayList<pair>();
            for(int i=0;i<A.length;i++){
                for(int j=0;j<B.length;j++){
                    if(A[i]+B[j]==X){
                        a.add(new pair(A[i],B[j]));
                    }
                }
            }
            pair []p=new pair[a.size()];
            return a.toArray(p);
        }
    }

    class pair  {  
        long first, second;  
        public pair(long first, long second)  
        {  
            this.first = first;  
            this.second = second;  
        }  
    }