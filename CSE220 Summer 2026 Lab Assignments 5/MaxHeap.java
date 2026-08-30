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

    // Only the direction of the comparison changes from MinHeap.
    private void heapifyUp(int index) {

        int parent = index / 2;

        if(parent < 1) {
            return;
        }

        if(heap[parent] >= heap[index]) {
            return;
        }

        swap(parent, index);
        heapifyUp(parent);
    }

    private void heapifyDown(int index) {

        int left = index * 2;
        int right = index * 2 + 1;
        int winner = index;

        if(left <= size && heap[left] > heap[winner]) {
            winner = left;
        }

        if(right <= size && heap[right] > heap[winner]) {
            winner = right;
        }

        if(winner == index) {
            return;
        }

        swap(winner, index);
        heapifyDown(winner);
    }
}
