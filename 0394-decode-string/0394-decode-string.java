class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> mainStack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                int num=0;
                while(i<s.length() && Character.isDigit(s.charAt(i))){
                    num= num*10 + (s.charAt(i)-'0');
                    i++;
                }
                i--;
                numStack.push(num);
            }
            else if(ch!=']'){
                mainStack.push(ch+"");
            }
            else{
                String str="";
                while(!mainStack.peek().equals("[")){
                    str= mainStack.pop() + str;
                }
                mainStack.pop();
                StringBuilder sb = new StringBuilder("");
                int repetition= numStack.pop();
                while(repetition>0){
                    sb.append(str);
                    repetition--;
                }
                mainStack.push(sb.toString());
                




            }






        }
        StringBuilder ans = new StringBuilder("");
        while(mainStack.size()>0){
            ans.insert(0,mainStack.pop());

        }
        return ans.toString();
        
    }
}