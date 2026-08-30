public class Task6MaxHeap {
    

    private String[] names;
    private Integer[] ranks;
    private int size;
    private int capacity;

    public Task6MaxHeap(int capacity) {

        this.capacity = capacity;
        this.names = new String[capacity + 1];
        this.ranks = new Integer[capacity + 1];
        this.size = 0;
    }

    public void insert(String name, int priority) {

        if(size >= capacity) {
            System.out.println("Heap is full");
            return;
        }

        size++;
        names[size] = name;
        ranks[size] = priority;
        heapifyUp(size);
    }

    public String extractMax() {

        if(isEmpty()) {
            return null;
        }

        String winner = names[1];
        names[1] = names[size];
        names[size] = null;

        ranks[1] = ranks[size];
        ranks[size] = null;

        size--;
        heapifyDown(1);

        return winner;
    }

    private void heapifyUp(int index) {

        int parent = index / 2;

        if(parent < 1) {
            return;
        }

        if(ranks[parent] >= ranks[index]) {
            return;
        }

        swap(parent, index);
        heapifyUp(parent);
    }

    private void heapifyDown(int index) {

        int left = index * 2;
        int right = index * 2 + 1;
        int winner = index;

        if(left <= size && ranks[left] > ranks[winner]) {
            winner = left;
        }

        if(right <= size && ranks[right] > ranks[winner]) {
            winner = right;
        }

        if(winner == index) {
            return;
        }

        swap(winner, index);
        heapifyDown(winner);
    }

    private void swap(int a, int b) {

        String hold_name = names[a];
        names[a] = names[b];
        names[b] = hold_name;

        Integer hold_rank = ranks[a];
        ranks[a] = ranks[b];
        ranks[b] = hold_rank;
    }

    public boolean isEmpty() {

        return size == 0;
    }
}
