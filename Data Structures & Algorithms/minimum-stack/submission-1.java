class MinStack {
    private List<Integer> stack;
    private List<Integer> minStack;
    public MinStack() {
        this.stack = new ArrayList<>();
        this.minStack = new ArrayList<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            minStack.add(val);
        } else {
            if(val <= minStack.get(minStack.size()-1)) {
                minStack.add(val);
            }
        }
        stack.add(val);
    }
    
    public void pop() {
        int valueToRemove = top();
        if(valueToRemove <= minStack.get(minStack.size()-1)) {
            minStack.remove(minStack.size()-1);
        }
        stack.remove(stack.size()-1);
    }
    
    public int top() {
        return stack.get(stack.size()-1);
    }
    
    public int getMin() {
        return minStack.get(minStack.size()-1);
    }
}
