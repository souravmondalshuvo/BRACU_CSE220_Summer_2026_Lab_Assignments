public class MaxHeap {
    
    private Integer[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {

        this.capacity = capacity;
        this.heap = new Integer[capacity + 1];
        this.size = 0;
    }

    public void insert(int value) {

        if(size >= capacity) {
            System.out.println("Heap is full");
            return;
        }

        size++;
        heap[size] = value;
        heapifyUp(size);
    }

    public Integer extractMax() {

        if(isEmpty()) {
            return null;
        }

        Integer largest = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        heapifyDown(1);

        return largest;
    }

    public Integer peek() {

        if(isEmpty()) [
            return null;
        ]

        return heap[1];
    }
}
