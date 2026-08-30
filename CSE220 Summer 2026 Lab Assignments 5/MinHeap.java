public class MinHeap {

    private Integer[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new Integer[capacity + 1]; // +1 because we are using 1-based indexing
        this.size = 0;
    }
    public void insert(int value) {
        /*
         Steps:
         1. Check if heap is full
         2. Insert at end
         3. Heapify up
        */

        // TODO: Implement insert method

        if(size >= capacity) {
            System.out.println("Heap is full");
            return;
        }

        size++;
        heap[size] = value;
        heapifyUp(size);
    }

    public Integer extractMin() {
        /*
         Steps:
         1. Handle empty heap
         2. Store root
         3. Move last element to root
         4. Reduce size
         5. Heapify down
        */
        // TODO: Implement extraction logic
    }

    public Integer peek() {
         /*
         Steps:
         1. Handle empty heap
         2. Return root value
        */
       // TODO: Implement peek
    }

    // --------------------------
    // Heapify operations
    // --------------------------
    private void heapifyUp(int index) {
        /*
         Move element up while parent is greater
        */
        // TODO: Implement heapify up
    }
    private void heapifyDown(int index) {
        /*
         Move element down by comparing with children
        */
        // TODO: Implement heapify down
    }

    public boolean isEmpty(){
        // TODO: Implement isEmpty
    }
}