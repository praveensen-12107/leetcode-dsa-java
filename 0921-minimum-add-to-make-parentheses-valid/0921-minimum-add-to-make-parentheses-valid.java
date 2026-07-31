class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int c=0;
        for( char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else{
                if(st.size()>0){
                    st.pop();
                }
                else{
                    c++;
                }
            }
        }
        return c + st.size();
        
    }
}