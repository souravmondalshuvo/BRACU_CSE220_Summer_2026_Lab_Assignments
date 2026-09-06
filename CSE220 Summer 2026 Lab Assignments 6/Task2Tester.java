public class Task2Tester {

    public static void main(String[] args) {

        System.out.println("Task 2a:");
        GraphData.printAnswer("Task 2a", Task2.Task2a(GraphData.undirectedWeightedMatrix()), "sum of edge weights");

        System.out.println("\nTask 2b:");
        GraphData.printAnswer("Task 2b", Task2.Task2b(GraphData.undirectedWeightedList()), "sum of edge weights");
    }
}