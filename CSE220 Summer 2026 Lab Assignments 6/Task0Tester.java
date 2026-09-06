public class Task0Tester {

    public static void main(String[] args) {

        System.out.println("Task 0a: Adjacency Matrix");
        Task0.printMatrix(GraphData.undirectedWeightedMatrix());

        System.out.println("\nTask 0b: Adjacency List");
        Task0.printList(GraphData.undirectedWeightedList());

        System.out.println("\nDirected Adjacency Matrix");
        Task0.printMatrix(GraphData.directedWeightedMatrix());

        System.out.println("\nDirected Adjacency List");
        Task0.printList(GraphData.directedWeightedList());
    }
}