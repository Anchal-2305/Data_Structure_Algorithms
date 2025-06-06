import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        if (st.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
        st.push(val);
    }

    public void pop() {
        if (!st.isEmpty()) {
            int ele1 = st.pop();
            if (ele1 == min.peek()) {
                min.pop();
            }
        }
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(5);
        minStack.push(2);
        minStack.push(8);
        minStack.push(1);

        System.out.println("Minimum: " + minStack.getMin());
        minStack.pop();
        System.out.println("Top Element: " + minStack.top());
        System.out.println("Minimum: " + minStack.getMin());
    }
}

