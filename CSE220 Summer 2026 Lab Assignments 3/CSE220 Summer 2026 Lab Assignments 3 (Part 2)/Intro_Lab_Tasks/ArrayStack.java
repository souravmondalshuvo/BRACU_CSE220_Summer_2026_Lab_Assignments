package Intro_Lab_Tasks;

public class ArrayStack {

    private Object[] stack;
    private int top;

    public ArrayStack(int size) {
        stack = new Object[size];
        top = -1;
    }

    public void push(Object element) {
        // TODO: Implement push

        if(top == stack.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        stack[top] = element;
    }

    public Object pop() {
        // TODO: Implement pop

        if(isEmpty()) {
            System.out.println("Stack Underflow");
            return null;
        }

        Object removed = stack[top];
        stack[top] = null;
        top--;
        return removed;
        // return null;
    }

    public Object peek() {
        // TODO: Implement peek

        if(isEmpty()) {
            return null;
        }

        return stack[top];
        // return null;
    }

    public boolean isEmpty() {
        // TODO: Implement isEmpty
        return false;
    }
    
}
