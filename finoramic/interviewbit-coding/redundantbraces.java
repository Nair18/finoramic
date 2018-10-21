

    public class Solution {
        public int braces(String A) {
            Stack<Character> st = new Stack<>();
            
            for(int i=0;i<A.length();i++){
                if(A.charAt(i)=='(' || A.charAt(i)=='+'|| A.charAt(i)=='-' || A.charAt(i)=='*' || A.charAt(i)=='/'){
                    st.push(A.charAt(i));
                }
                else if(A.charAt(i)==')'){
                    int c=0;
                    while(!st.isEmpty() && st.peek()!='('){
                        st.pop();
                        c++;
                    }
                    
                    if(st.isEmpty()){
                        return 1;
                    }
                    
                    st.pop();
                    if(c==0){
                        return 1;
                    }
                }
            }
     
            return 0;
        }
    }


