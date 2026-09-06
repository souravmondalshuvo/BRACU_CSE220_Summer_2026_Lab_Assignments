public class Task1 {

    // ========================== Task 1a ==========================

    public static int[] Task1a(int[][] matrix) {

        int maxDeg = -1;
        int maxVert = -1;

        for(int x = 0; x < matrix.length; x++) {
            
            int deg = 0;

            for(int y = 0; y < matrix[x].length; y++) {
                if(matrix[x][y] != 0) {
                    deg++;
                }
            }

            if(deg > maxDeg) {
                maxDeg = deg;
                maxVert = x;
            }
        }

        return new int[] {maxVert, maxDeg};
    }

    // ========================== Task 1b ==========================

    public static int[] Task1b(Edge[] list) {

        int maxVert = -1;
        int maxDeg = -1;

        for(int p = 0; p < list.length; p++) {
            int deg = 0;
            
            Edge current = list[p];

            while(current != null) {
                deg++;
                current = current.next;
            }

            if(deg > maxDeg) {
                maxDeg = deg;
                maxVert = p;
            }
        }

        return new int[] {maxVert, maxDeg};
    }
}