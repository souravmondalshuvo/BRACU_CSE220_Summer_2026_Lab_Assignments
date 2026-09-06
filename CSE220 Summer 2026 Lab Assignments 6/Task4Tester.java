public class Task4Tester {

    public static void main(String[] args) {

        System.out.println("Task 4a: Directed Matrix Converted to Undirected Matrix");
        int[][] convertedMatrix = Task4.Task4a(GraphData.directedWeightedMatrix());
        Task0.printMatrix(convertedMatrix);

        System.out.println("\nTask 4b: Directed List Converted to Undirected List");
        Edge[] convertedList = Task4.Task4b(GraphData.directedWeightedList());
        Task0.printList(convertedList);
    }
}