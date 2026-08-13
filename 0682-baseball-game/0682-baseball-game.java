class Solution {

    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for( String str : operations){
            if(str.equals("C")){
                if(st.size()>0){
                    st.pop();
                }
                
            }
            else if (str.equals("D")){
                if(st.size()>0){
                int ele=st.pop();

                st.push(ele);
                st.push(ele*2);
                }
                }
            else if(str.equals("+")){
                int sum=0;
               if(st.size()>=2){
                int ele=st.pop();
                int ele2=st.peek();
               
               st.push(ele);
               st.push(ele+ele2);
                
                }
            }
            else{
                int ele = Integer.parseInt(str);
                st.push(ele);
            }
        }
        int ans=0;
        while(st.size()!=0){
            ans+=st.pop();
        }
        return ans;
    }
}