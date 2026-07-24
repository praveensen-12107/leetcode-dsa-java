class MinStack {
    Stack<Integer> st;
    Stack<Integer> minst;

    public MinStack() {
        st= new Stack<>();
        minst = new Stack<>();
        
    }
    
    public void push(int value) {
        if(st.size()==0 || value<=minst.peek()){
            minst.push(value);
        }
        st.push(value);

        
    }
    
    public void pop() {
        if(st.size()>0){
            int ele=st.peek();
            int ele1=minst.peek();
            if(ele==ele1){
                
                minst.pop();
            }
            st.pop();
        }
        
    }
    
    public int top() {
        return st.peek();
        
    }
    
    public int getMin() {
        return minst.peek();
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */