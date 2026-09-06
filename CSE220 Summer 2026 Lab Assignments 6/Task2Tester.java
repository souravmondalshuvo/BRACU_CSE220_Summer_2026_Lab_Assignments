public class Task2Tester {

    public static void main(String[] args) {

        GraphData.header("===== Task 2a: Max Weight Sum (Matrix) =====");
        GraphData.checkAnswer("Task 2a", Task2.Task2a(GraphData.undirectedWeightedMatrix()), "sum of edge weights", 3, 19);

        GraphData.header("===== Task 2b: Max Weight Sum (List) =====");
        GraphData.checkAnswer("Task 2b", Task2.Task2b(GraphData.undirectedWeightedList()), "sum of edge weights", 3, 19);

        GraphData.header("===== Task 2: Representation Agreement =====");
        int fromMatrix = Task2.Task2a(GraphData.undirectedWeightedMatrix())[1];
        int fromList = Task2.Task2b(GraphData.undirectedWeightedList())[1];
        GraphData.checkValue("Matrix and list report the same sum", fromMatrix, fromList);
    }
}