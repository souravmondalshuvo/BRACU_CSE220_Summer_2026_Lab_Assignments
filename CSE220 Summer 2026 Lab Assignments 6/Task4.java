public class Task4 {
    
    // ========================== Task 4a ==========================

    public static int[][] Task4a(int[][] directedMatrix) {


        int n = directedMatrix.length;
        int[][] undirectedMatrix = new int[n][n];

        for(int x = 0; x < n; x++) {
            for(int y = x + 1; y < n; y++) {
                int tWeight = directedMatrix[x][y] + directedMatrix[y][x];

                if(tWeight != 0) {
                    undirectedMatrix[x][y] = tWeight;
                    undirectedMatrix[y][x] = tWeight;
                }
            }
        }


        return undirectedMatrix;
    }

    // ========================== Task 4b ==========================

    public static void addDirectedListEdge(Edge[] list, int f, int t, int w) {

        list[f] = new Edge(t, w, list[f]);
    }

    public static void addUndirectedListEdge(Edge[] list, int u, int v, int w) {

        addDirectedListEdge(list, u, v, w);
        addDirectedListEdge(list, v, u, w);
    }

    public static Edge[] Task4b(Edge[] directedList) {

        int n = directedList.length;
        int[][] weightMatrix = new int[n][n];

        for(int i = 0; i < n; i++) {
            Edge current = directedList[i];

            while(current != null) {
                weightMatrix[i][current.to] += current.weight;
                current = current.next;
            }
        }

        Edge[] undirectedList = new Edge[n];

        for(int p = 0; p < n; p++) {
            for(int q = p + 1; q < n; q++) {
                int tWeight = weightMatrix[p][q] + weightMatrix[q][p];

                if(tWeight != 0) {
                    addUndirectedListEdge(undirectedList, p, q, tWeight);
                }
            }
        }

        return undirectedList;
    }
}