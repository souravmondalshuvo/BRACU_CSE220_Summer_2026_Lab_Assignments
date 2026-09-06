public class Task3 {
    
    // ========================== Task 3a ==========================

    public static int[] Task3a_MaxOutgoingDegree(int[][] matrix) {

        int maxVert = -1;
        int maxOutDeg = -1;

        for(int p = 0; p < matrix.length; p++) {
            int outDeg = 0;

            for(int q = 0; q < matrix[p].length; q++) {
                if(matrix[p][q] != 0) {
                    outDeg++;
                }
            }

            if(outDeg > maxOutDeg) {
                maxOutDeg = outDeg;
                maxVert = p;
            }
        }

        return new int[] {maxVert, maxOutDeg};
    }

    public static int[] Task3a_MaxOutgoingWeightSum(int[][] matrix) {

        int maxVert = -1;
        int maxWSum = -1;

        for(int x = 0; x < matrix.length; x++) {
            int wSum = 0;

            for(int y = 0; y < matrix[x].length; y++) {
                wSum += matrix[x][y];
            }

            if(wSum > maxWSum) {
                maxWSum = wSum;
                maxVert = x;
            }
        }

        return new int[] {maxVert, maxWSum};
    }

    // ========================== Task 3b ==========================

    public static int[] Task3b_MaxOutgoingDegree(Edge[] list) {

        int maxVert = -1;
        int maxOutDeg = -1;

        for(int a = 0; a < list.length; a++) {
            int outDeg = 0;

            Edge current = list[a];

            while(current != null) {
                outDeg++;
                current = current.next;
            }

            if(outDeg > maxOutDeg) {
                maxOutDeg = outDeg;
                maxVert = a;
            }
        }

        return new int[] {maxVert, maxOutDeg};
    }

    public static int[] Task3b_MaxOutgoingWeightSum(Edge[] list) {


        int maxVert = -1;
        int maxWSum = -1;

        for(int i = 0; i < list.length; i++) {
            int wSum = 0;
            
            Edge current = list[i];

            while(current != null) {
                wSum += current.weight;
                current = current.next;
            }

            if(wSum > maxWSum) {
                maxWSum = wSum;
                maxVert = i;
            }
        }

        return new int[] {maxVert, maxWSum};
    }
}