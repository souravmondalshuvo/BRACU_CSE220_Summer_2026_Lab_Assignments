public class GraphData {

    public static int n = 7;

    // ===================== Undirected Graph =====================

    public static int[][] undirectedEdges = {
        {0, 1, 4},
        {0, 2, 3},
        {0, 3, 2},
        {1, 2, 5},
        {1, 4, 6},
        {2, 3, 7},
        {2, 5, 4},
        {3, 5, 1},
        {3, 6, 8},
        {4, 5, 2},
        {4, 6, 3},
        {5, 6, 6}
    };

    // ===================== Directed Graph =====================

    public static int[][] directedEdges = {
        {0, 1, 4},
        {0, 2, 3},
        {0, 3, 2},
        {1, 2, 5},
        {1, 4, 6},
        {2, 3, 7},
        {2, 5, 4},
        {3, 5, 1},
        {3, 6, 8},
        {4, 5, 2},
        {5, 4, 3},
        {6, 3, 5}
    };

    public static int[][] undirectedWeightedMatrix() {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < undirectedEdges.length; i++) {
            Task0.addUndirectedMatrixEdge(matrix, undirectedEdges[i][0], undirectedEdges[i][1], undirectedEdges[i][2]);
        }

        return matrix;
    }

    public static Edge[] undirectedWeightedList() {
        Edge[] list = new Edge[n];

        for (int i = 0; i < undirectedEdges.length; i++) {
            Task0.addUndirectedListEdge(list, undirectedEdges[i][0], undirectedEdges[i][1], undirectedEdges[i][2]);
        }

        return list;
    }

    // Weight 1 everywhere, since Task 1 only cares whether an edge exists.
    public static int[][] undirectedUnweightedMatrix() {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < undirectedEdges.length; i++) {
            Task0.addUndirectedMatrixEdge(matrix, undirectedEdges[i][0], undirectedEdges[i][1], 1);
        }

        return matrix;
    }

    public static Edge[] undirectedUnweightedList() {
        Edge[] list = new Edge[n];

        for (int i = 0; i < undirectedEdges.length; i++) {
            Task0.addUndirectedListEdge(list, undirectedEdges[i][0], undirectedEdges[i][1], 1);
        }

        return list;
    }

    public static int[][] directedWeightedMatrix() {
        int[][] matrix = new int[n][n];

        for (int i = 0; i < directedEdges.length; i++) {
            Task0.addDirectedMatrixEdge(matrix, directedEdges[i][0], directedEdges[i][1], directedEdges[i][2]);
        }

        return matrix;
    }

    public static Edge[] directedWeightedList() {
        Edge[] list = new Edge[n];

        for (int i = 0; i < directedEdges.length; i++) {
            Task0.addDirectedListEdge(list, directedEdges[i][0], directedEdges[i][1], directedEdges[i][2]);
        }

        return list;
    }

    public static void printAnswer(String taskName, int[] answer, String valueName) {
        System.out.println(taskName + ": Vertex = " + (answer[0] + 1) + ", " + valueName + " = " + answer[1]);
    }
}