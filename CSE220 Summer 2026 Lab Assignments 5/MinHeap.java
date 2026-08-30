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

        if(isEmpty()) {
            return null;
        }

        Integer smallest = heap[1];
        heap[1] = heap[size];
        heap[size] = null;
        size--;
        heapifyDown(1);

        return smallest;
    }

    public Integer peek() {
         /*
         Steps:
         1. Handle empty heap
         2. Return root value
        */
       // TODO: Implement peek

       if(isEmpty()) {
        return null;
       }

       return heap[1];
    }

    // --------------------------
    // Heapify operations
    // --------------------------
    private void heapifyUp(int index) {
        /*
         Move element up while parent is greater
        */
        // TODO: Implement heapify up

        int parent = index / 2;

        if(parent < 1) {
            return;
        }

        if(heap[parent] <= heap[index]) {
            return;
        }

        swap(parent, index);
        heapifyUp(parent);
    }
    private void heapifyDown(int index) {
        /*
         Move element down by comparing with children
        */
        // TODO: Implement heapify down

        int left = index * 2;
        int right = index * 2 + 1;
        int winner = index;

        if(left <= size && heap[left] < heap[winner]) {
            winner = left;
        }

        if(right <= size && heap[right] < heap[winner]) {
            winner = right;
        }

        if(winner == index) {
            return;
        }

        swap(winner, index);
        heapifyDown(winner);
    }

    public boolean isEmpty(){
        // TODO: Implement isEmpty
    }
}