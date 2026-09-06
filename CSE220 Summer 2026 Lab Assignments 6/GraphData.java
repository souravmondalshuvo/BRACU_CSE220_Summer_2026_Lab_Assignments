public class GraphData {

    public static int n = 7;

    static String green = "\u001B[32m", red = "\u001B[31m", cyan = "\033[0;96m";
    static String bold = "\u001B[1m", normal = "\033[0;0m";

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

    // ===================== Checkers =====================

    public static void checkAnswer(String taskName, int[] answer, String valueName, int expVertex, int expValue) {

        String expected = "Vertex = " + expVertex + ", " + valueName + " = " + expValue;
        String actual = (answer == null) ? "null" : "Vertex = " + (answer[0] + 1) + ", " + valueName + " = " + answer[1];

        System.out.println("Expected   : " + expected);
        System.out.println("Your Output: " + actual);

        if (expected.equals(actual)) pass(taskName);
        else fail(taskName);
    }

    public static void checkValue(String taskName, int expected, int actual) {
        System.out.println("Expected   : " + expected);
        System.out.println("Your Output: " + actual);

        if (expected == actual) pass(taskName);
        else fail(taskName);
    }

    public static void checkFlag(String taskName, boolean expected, boolean actual) {
        System.out.println("Expected   : " + expected);
        System.out.println("Your Output: " + actual);

        if (expected == actual) pass(taskName);
        else fail(taskName);
    }

    public static int countMatrixCells(int[][] matrix) {
        int total = 0;

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] != 0) total++;

        return total;
    }

    public static int countListNodes(Edge[] list) {
        int total = 0;

        for (int i = 0; i < list.length; i++) {
            Edge current = list[i];

            while (current != null) {
                total++;
                current = current.next;
            }
        }

        return total;
    }

    public static int weightOf(Edge[] list, int from, int to) {
        Edge current = list[from];

        while (current != null) {
            if (current.to == to) return current.weight;
            current = current.next;
        }

        return 0;
    }

    public static boolean isSymmetric(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix.length; j++)
                if (matrix[i][j] != matrix[j][i]) return false;

        return true;
    }

    // ===================== Colored Printers =====================

    public static void header(String text) {
        System.out.println(cyan + bold + text + normal);
    }

    public static void pass(String text) {
        System.out.println(green + "PASS: " + text + normal + "\n");
    }

    public static void fail(String text) {
        System.out.println(red + "FAIL: " + text + normal + "\n");
    }
}