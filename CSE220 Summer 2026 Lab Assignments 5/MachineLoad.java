public class MachineLoad {
    
    public static Integer[] distribute(int[] tasks, int m) {

        MinHeap kaaj = new MinHeap(m);

        for(int i = 0; i < m; i++) {
            kaaj.insert(0);
        }

        for(int j = 0; j < tasks.length; j++) {
            int ekdom_halka = kaaj.extractMin();
            kaaj.insert(ekdom_halka + tasks[j]);
        }

        return kaaj.snapshot();
    }
}
