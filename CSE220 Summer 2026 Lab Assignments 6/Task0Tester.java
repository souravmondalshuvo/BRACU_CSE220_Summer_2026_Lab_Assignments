public class Task0Tester {

    public static void main(String[] args) {

        int[][] undirectedMatrix = GraphData.undirectedWeightedMatrix();
        Edge[] undirectedList = GraphData.undirectedWeightedList();
        int[][] directedMatrix = GraphData.directedWeightedMatrix();
        Edge[] directedList = GraphData.directedWeightedList();

        GraphData.header("===== Task 0a: Undirected Adjacency Matrix =====");
        Task0.printMatrix(undirectedMatrix);
        System.out.println();

        GraphData.checkValue("Task 0a undirected cell count", 24, GraphData.countMatrixCells(undirectedMatrix));

        GraphData.checkFlag("Task 0a matrix is symmetric", true, GraphData.isSymmetric(undirectedMatrix));

        GraphData.header("===== Task 0b: Undirected Adjacency List =====");
        Task0.printList(undirectedList);
        System.out.println();

        GraphData.checkValue("Task 0b undirected node count", 24, GraphData.countListNodes(undirectedList));

        GraphData.header("===== Task 0a: Directed Adjacency Matrix =====");
        Task0.printMatrix(directedMatrix);
        System.out.println();

        GraphData.checkValue("Task 0a directed cell count", 12, GraphData.countMatrixCells(directedMatrix));

        GraphData.header("===== Task 0b: Directed Adjacency List =====");
        Task0.printList(directedList);
        System.out.println();

        GraphData.checkValue("Task 0b directed node count", 12, GraphData.countListNodes(directedList));
    }
}