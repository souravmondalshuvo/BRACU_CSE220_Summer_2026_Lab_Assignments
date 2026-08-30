public class Scheduler {
    
    public static String[] schedule(String[] taskNames, int[] priorities) {

        Task6MaxHeap qiu = new Task6MaxHeap(taskNames.length);

        for(int z = 0; z < taskNames.length; z++) {
            qiu.insert(taskNames[z], priorities[z]);
        }

        String[] order = new String[taskNames.length];
        int slot = 0;

        while(!qiu.isEmpty()) {

            order[slot] = qiu.extractMax();
            slot++;
        }

        return order;
    }
}
