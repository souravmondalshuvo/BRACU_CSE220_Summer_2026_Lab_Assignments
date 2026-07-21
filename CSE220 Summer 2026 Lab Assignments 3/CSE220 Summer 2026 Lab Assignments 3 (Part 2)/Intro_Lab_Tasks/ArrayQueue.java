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

        if(size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[rear] = element;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public Object dequeue() {
        // TODO: Implement dequeue

        if(isEmpty()) {
            System.out.println("Queue Underflow");
            return null;
        }

        Object removed = queue[front];
        queue[front] = null;
        front = (front + 1) % queue.length;
        size--;
        return removed;
        // return null;
    }

    public Object peek() {
        // TODO: Implement peek

        if(isEmpty()) {
            return null;
        }

        return queue[front];
        // return null;
    }

    public boolean isEmpty() {
        // TODO: Implement isEmpty
        return false;
    }
}
