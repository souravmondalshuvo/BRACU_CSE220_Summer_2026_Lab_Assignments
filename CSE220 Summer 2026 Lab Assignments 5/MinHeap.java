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

    public void swap(int a, int b) {

        Integer hold = heap[a];
        heap[a] = heap[b];
        heap[b] = hold;
    }

    public boolean isEmpty(){
        // TODO: Implement isEmpty

        return size == 0;
    }

    // Read-only view of the live heap array, since the fields are private.
    public Integer[] snapshot() {
        Integer[] copy = new Integer[size];

        for(int i = 1; i <= size, i++) {
            copy[i - 1] = heap[i];
        }

        return copy;
    }

    // ===================== TASK 3 =====================
    // Out-of-place heap sort: the heap is the scratch space, the original
    // array is refilled in the order the heap surrenders its minimum.

    public static void outPlaceHeapSort(int[] arr) {

        MinHeap sorter = new MinHeap(arr.length);

        for(int i = 0; i < arr.length; i++) {
            sorter.insert(arr[i]);
        }

        int slot = 0;

        while(!sorter.isEmpty()) {
            arr[slot] = sorter.extractMin();
            slot++;
        }
    }
}