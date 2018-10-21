

    public class Solution {
        public int threeSumClosest(ArrayList<Integer> A, int B) {
            Collections.sort(A);
            int ans=0;
            int diff=Integer.MAX_VALUE;
            for(int i=0;i<A.size()-2;i++){
                int num = A.get(i);
                int l = i+1;
                int r= A.size()-1;
                while(l<r){
                    if(B==num+A.get(l)+A.get(r)){
                        return B;
                    }
                    else if(B>num+A.get(l)+A.get(r)){
                        if(diff>Math.abs(B-(num+A.get(l)+A.get(r)))){
                            ans = num+A.get(l)+A.get(r);
                            diff = Math.abs(B-(num+A.get(l)+A.get(r)));
                        }
                        l++;
                    }
                    else{
                        if(diff>Math.abs(B-(num+A.get(l)+A.get(r)))){
                            ans = num+A.get(l)+A.get(r);
                            diff = Math.abs(B-(num+A.get(l)+A.get(r)));
                        }
                        r--;
                    }
                }
            }
            
            return ans;
        }
    }


