public class Task1Tester {

    public static void main(String[] args) {

        System.out.println("Task 1a:");
        GraphData.printAnswer("Task 1a", Task1.Task1a(GraphData.undirectedUnweightedMatrix()), "degree");

        System.out.println("\nTask 1b:");
        GraphData.printAnswer("Task 1b", Task1.Task1b(GraphData.undirectedUnweightedList()), "degree");
    }
}