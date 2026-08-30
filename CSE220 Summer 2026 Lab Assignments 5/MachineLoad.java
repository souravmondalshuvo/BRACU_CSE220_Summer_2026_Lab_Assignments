public class MachineLoad {
    
    public static Integer[] distribute(int[] tasks, int m) {

        MinHeap kaaj = new MinHeap(m);

        for(int i = 0; i < m; i++) {
            kaaj.insert(0);
        }

        for(int x = 0; x < tasks.length; x++) {
            int ekdom_halka = kaaj.extractMin();
            kaaj.insert(ekdom_halka + tasks[x]);
        }

        return kaaj.snapshot();
    }
}
