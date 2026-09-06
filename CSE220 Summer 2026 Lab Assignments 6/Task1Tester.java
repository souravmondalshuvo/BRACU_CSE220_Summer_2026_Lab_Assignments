public class Task1Tester {

    public static void main(String[] args) {

        GraphData.header("===== Task 1a: Maximum Degree (Matrix) =====");
        GraphData.checkAnswer("Task 1a", Task1.Task1a(GraphData.undirectedUnweightedMatrix()), "degree", 3, 4);

        GraphData.header("===== Task 1b: Maximum Degree (List) =====");
        GraphData.checkAnswer("Task 1b", Task1.Task1b(GraphData.undirectedUnweightedList()), "degree", 3, 4);

        GraphData.header("===== Task 1: Representation Agreement =====");
        int fromMatrix = Task1.Task1a(GraphData.undirectedUnweightedMatrix())[1];
        int fromList = Task1.Task1b(GraphData.undirectedUnweightedList())[1];
        GraphData.checkValue("Matrix and list report the same degree", fromMatrix, fromList);
    }
}