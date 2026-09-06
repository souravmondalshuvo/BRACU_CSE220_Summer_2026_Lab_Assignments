public class Task3Tester {

    public static void main(String[] args) {

        int[][] matrix = GraphData.directedWeightedMatrix();
        Edge[] list = GraphData.directedWeightedList();

        GraphData.header("===== Task 3a: Max Outgoing Degree (Matrix) =====");
        GraphData.checkAnswer("Task 3a Maximum Outgoing Degree", Task3.Task3a_MaxOutgoingDegree(matrix), "outgoing degree", 1, 3);

        GraphData.header("===== Task 3a: Max Outgoing Weight Sum (Matrix) =====");
        GraphData.checkAnswer("Task 3a Maximum Outgoing Weight Sum", Task3.Task3a_MaxOutgoingWeightSum(matrix), "outgoing weight sum", 2, 11);

        GraphData.header("===== Task 3b: Max Outgoing Degree (List) =====");
        GraphData.checkAnswer("Task 3b Maximum Outgoing Degree", Task3.Task3b_MaxOutgoingDegree(list), "outgoing degree", 1, 3);

        GraphData.header("===== Task 3b: Max Outgoing Weight Sum (List) =====");
        GraphData.checkAnswer("Task 3b Maximum Outgoing Weight Sum", Task3.Task3b_MaxOutgoingWeightSum(list), "outgoing weight sum", 2, 11);

        GraphData.header("===== Task 3: Representation Agreement =====");
        GraphData.checkValue("Matrix and list report the same out-weight", Task3.Task3a_MaxOutgoingWeightSum(matrix)[1], Task3.Task3b_MaxOutgoingWeightSum(list)[1]);
    }
}