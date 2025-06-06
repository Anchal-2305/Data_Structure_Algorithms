package Leetcode;
import java.util.LinkedList;
import java.util.Queue;

class MyStack {
        private Queue<Integer> mainQueue;
        private Queue<Integer> helperQueue;

        public MyStack() {
            mainQueue = new LinkedList<>();
            helperQueue = new LinkedList<>();
        }

        public void push(int x) {
            while (!mainQueue.isEmpty()) {
                helperQueue.add(mainQueue.remove());
            }
            mainQueue.add(x);
            while (!helperQueue.isEmpty()) {
                mainQueue.add(helperQueue.remove());
            }
        }

        public int pop() {
            if (mainQueue.isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            return mainQueue.remove();
        }

        public int top() {
            if (mainQueue.isEmpty()) {
                throw new RuntimeException("Stack is empty!");
            }
            return mainQueue.peek();
        }

        public boolean empty() {
            return mainQueue.isEmpty();
        }

        public static void main(String[] args) {
            MyStack stack = new MyStack();

            stack.push(10);
            stack.push(20);
            stack.push(30);

            System.out.println("Top element: " + stack.top());  // Output: 30
            System.out.println("Popped element: " + stack.pop());  // Output: 30
            System.out.println("Top element after pop: " + stack.top());  // Output: 20

            stack.push(40);
            System.out.println("Top element after pushing 40: " + stack.top());  // Output: 40

            System.out.println("Is stack empty? " + stack.empty());  // Output: false

            stack.pop();
            stack.pop();
            stack.pop();

            System.out.println("Is stack empty after popping all elements? " + stack.empty());  // Output: true
        }
    }


