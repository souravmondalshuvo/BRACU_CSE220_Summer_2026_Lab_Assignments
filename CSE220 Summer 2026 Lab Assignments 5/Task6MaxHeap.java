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
}
