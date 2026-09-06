public class Task2 {
    
    // ========================== Task 2a ==========================

    public static int[] Task2a (int[][] matrix) {

        int maxVert = -1;
        int maxWSum = -1;

        for(int p = 0; p < matrix.length; p++) {
            int wSum = 0;

            for(int q = 0; q < matrix[p].length; q++) {
                wSum += matrix[p][q];
            }

            if(wSum > maxWSum) {
                maxWSum = wSum;
                maxVert = p;
            }
        }

        return new int[] {maxVert, maxWSum};
    }

    // ========================== Task 2a ==========================
    
    public static int[] Task2b (Edge[] list) {

        int maxVert = -1;
        int maxWSum = -1;

        for(int x = 0; x < list.length; x++) {
            int wSum = 0;

            Edge current = list[x];

            while(current != null) {
                wSum += current.weight;
                current = current.next;
            }

            if(wSum > maxWSum) {
                maxWSum = wSum;
                maxVert = x;
            }
        }

        return new int[] {maxVert, maxWSum};
    }
}