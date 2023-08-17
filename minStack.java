class MinStack {
    int[] stack;
    int ptr;

    public MinStack() {
        stack = new int[10000];
        ptr = -1;
    }
    
    public void push(int val) {
        ptr++;
        stack[ptr] = val;
    }
    
    public void pop() {
        ptr--;
    }
    
    public int top() {
        return stack[ptr];
    }
    
    public int getMin() {
        int min = 2147483647;
        for(int i = 0; i <= ptr; i++) {
            if(stack[i] < min) {
                min = stack[i];
            }
        }
        return min;
    }
}
