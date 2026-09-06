public class Task4Tester {

    public static void main(String[] args) {

        int[][] convertedMatrix = Task4.Task4a(GraphData.directedWeightedMatrix());
        Edge[] convertedList = Task4.Task4b(GraphData.directedWeightedList());

        GraphData.header("===== Task 4a: Directed Matrix Converted to Undirected Matrix =====");
        Task0.printMatrix(convertedMatrix);
        System.out.println();

        GraphData.header("Bidirectional pair 5-6 must sum");
        GraphData.checkValue("Task 4a edge 5-6 = 2 + 3", 5, convertedMatrix[4][5]);

        GraphData.header("Bidirectional pair 4-7 must sum");
        GraphData.checkValue("Task 4a edge 4-7 = 8 + 5", 13, convertedMatrix[3][6]);

        GraphData.header("One-way edges must keep their weight");
        GraphData.checkValue("Task 4a edge 1-2 stays 4", 4, convertedMatrix[0][1]);
        GraphData.checkValue("Task 4a edge 3-4 stays 7", 7, convertedMatrix[2][3]);

        GraphData.header("Absent edges must stay absent");
        GraphData.checkValue("Task 4a edge 1-6 stays 0", 0, convertedMatrix[0][5]);

        GraphData.header("===== Task 4a: Symmetry Check =====");
        GraphData.checkFlag("Task 4a result is symmetric", true, GraphData.isSymmetric(convertedMatrix));

        GraphData.header("===== Task 4a: Edge Count =====");
        GraphData.checkValue("Task 4a has 10 undirected edges (20 cells)", 20, GraphData.countMatrixCells(convertedMatrix));

        GraphData.header("===== Task 4b: Directed List Converted to Undirected List =====");
        Task0.printList(convertedList);
        System.out.println();

        GraphData.checkValue("Task 4b edge 5-6 = 5", 5, GraphData.weightOf(convertedList, 4, 5));
        GraphData.checkValue("Task 4b edge 6-5 = 5", 5, GraphData.weightOf(convertedList, 5, 4));
        GraphData.checkValue("Task 4b edge 4-7 = 13", 13, GraphData.weightOf(convertedList, 3, 6));
        GraphData.checkValue("Task 4b one-way 1-2 stays 4", 4, GraphData.weightOf(convertedList, 0, 1)); 

        GraphData.header("===== Task 4b: Node Count =====");
        GraphData.checkValue("Task 4b has 10 undirected edges (20 nodes)", 20, GraphData.countListNodes(convertedList));

        GraphData.header("===== Task 4: Representation Agreement =====");
        boolean same = true;

        for (int i = 0; i < convertedMatrix.length; i++)
            for (int j = 0; j < convertedMatrix.length; j++)
                if (convertedMatrix[i][j] != GraphData.weightOf(convertedList, i, j)) same = false;

        GraphData.checkFlag("Matrix and list conversions match cell for cell", true, same);
    }
}