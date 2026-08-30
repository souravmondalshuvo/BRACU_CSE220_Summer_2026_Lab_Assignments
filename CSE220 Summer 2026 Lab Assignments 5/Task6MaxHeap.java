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
}
