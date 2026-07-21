package Intro_Lab_Tasks;

public class ArrayQueue {

    private Object[] queue;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue(int arrayLen) {
        this.queue = new Object[arrayLen];
        this.front = 0;
        this.rear = 0;
	this.size = 0;
    }

    public void enqueue(Object element) {
        // TODO: Implement enqueue
    }

    public Object dequeue() {
        // TODO: Implement dequeue
        return null;
    }

    public Object peek() {
        // TODO: Implement peek
        return null;
    }

    public boolean isEmpty() {
        // TODO: Implement isEmpty
        return false;
    }
}
