class MyStack {
    Queue<Integer> qt;
    Queue<Integer> helper;

    public MyStack() {
        qt = new LinkedList<>();
        helper = new LinkedList<>();

        
    }
    
    public void push(int x) {
        while(qt.size()!=0){
            helper.add(qt.remove());

            
        }
        qt.add(x);
        while(helper.size()!=0){
            qt.add(helper.remove());
        }
        
    }
    
    public int pop() {
        return qt.remove();
        
    }
    
    public int top() {
        return qt.peek();
        
    }
    
    public boolean empty() {
        if(qt.size()==0){
            return true;
        }
        else {
            return false;
        }
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */