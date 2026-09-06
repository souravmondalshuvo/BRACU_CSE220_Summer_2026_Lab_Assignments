public class Task0 {
    
    // ========================== Task 0a ==========================

    public static void addUndirectedMatrixEdge(int[][] matrix, int u, int v, int w) {

        matrix[u][v] = w;
        matrix[v][u] = w;
    }

    public static void addDirectedMatrixEdge(int[][] matrix, int f, int t, int w) {

        matrix[f][t] = w;
    }

    public static void printMatrix(int[][] matrix) {

        for(int x = 0; x < matrix.length; x++) {
            for(int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + "\t");
            }

            System.out.println();
        }
    }

    // ========================== Task 0b ==========================    

    public static void addDirectedListEdge(Edge[] list, int f, int t, int w) {

        list[f] = new Edge(t, w, list[f]);
    }

    public static void addUndirectedListEdge(Edge[] list, int u, int v, int w) {

        addDirectedListEdge(list, u, v, w);
        addDirectedListEdge(list, v, u, w);
    }

    public static void printList(Edge[] list) {

        for(int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + " -> ");

            Edge current = list[i];

            while(current != null) {
                System.out.println("(" + (current.to + 1) + ", w=" + current.weight + ") ");
                current = current.next;
            }

            System.out.println();
        }
    }
}