

    public class Solution {
        // DO NOT MODIFY THE LIST. IT IS READ ONLY
        static boolean match(String s, String ss){
            int[] aa = new int[125];
            int[] bb = new int[125];
            
            for(int i=0;i<s.length();i++){
                aa[(int)(s.charAt(i))]++;
            }
            for(int i=0;i<ss.length();i++){
                bb[(int)(ss.charAt(i))]++;
            }
            
            for(int i=0;i<125;i++){
                if(aa[i]!=bb[i]){
                    return false;
                }
            }
            return true;
        }
        public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
            ArrayList<Integer> aa = new ArrayList<>();
            ArrayList<ArrayList<Integer>> bb = new ArrayList<ArrayList<Integer>>();
            HashSet<Integer> hs = new HashSet<>();
            int n = A.size();
            for(int i=0;i<n;i++){
                if(!hs.contains(i+1)){
                    aa.add(i+1);
                }
                else{
                    continue;
                }
                
                for(int j=i+1;j<n;j++){
                    if(match(A.get(i),A.get(j))){
                        aa.add(j+1);
                        hs.add(j+1);
                    }
                }
                if(aa.size()!=0){
                  bb.add(aa);    
                }
                aa = new ArrayList<>();
            }
            
            return bb;
        }
    }


