public class Task3Tester {

    public static void main(String[] args) {

        int[][] matrix = GraphData.directedWeightedMatrix();
        Edge[] list = GraphData.directedWeightedList();

        System.out.println("Task 3a:");
        GraphData.printAnswer("Task 3a Maximum Outgoing Degree", Task3.Task3a_MaxOutgoingDegree(matrix), "outgoing degree");

        GraphData.printAnswer("Task 3a Maximum Outgoing Weight Sum", Task3.Task3a_MaxOutgoingWeightSum(matrix), "outgoing weight sum");

        System.out.println("\nTask 3b:");
        GraphData.printAnswer("Task 3b Maximum Outgoing Degree", Task3.Task3b_MaxOutgoingDegree(list), "outgoing degree");

        GraphData.printAnswer("Task 3b Maximum Outgoing Weight Sum", Task3.Task3b_MaxOutgoingWeightSum(list), "outgoing weight sum");
    }
}