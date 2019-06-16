package lafore;

import com.karumanchi.Vertex;

/**
 * @author Dhiraj
 * @date 07/06/19
 */
public class TopologicalSort {
    private final int maxVertex = 20;
    private Vertex[] vertexList;
    private int vertexCount;
    private int[][] adjMatrix;
    private char[] sortedArray;

    public TopologicalSort() {
        vertexList = new Vertex[maxVertex];
        adjMatrix = new int[maxVertex][maxVertex];
        sortedArray = new char[maxVertex];
    }

    public static void main(String[] args) {
        TopologicalSort sort = new TopologicalSort();
        sort.addVertex('A');
        sort.addVertex('B');
        sort.addVertex('C');
        sort.addVertex('D');
        sort.addVertex('E');
        sort.addVertex('F');
        sort.addVertex('G');
        sort.addVertex('H');

        sort.addEdge(0, 3);
        sort.addEdge(0, 4);
        //sort.addEdge(7, 0);

        sort.addEdge(1, 4);
        sort.addEdge(2, 5);
        sort.addEdge(3, 6);
        sort.addEdge(4, 6);
        sort.addEdge(5, 7);
        sort.addEdge(6, 7);

        sort.topo();

    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
    }

    public void displayVertex(int i) {
        System.out.println(vertexList[i].label);
    }

    public void topo() {
        int originalVerts = vertexCount;
        while (vertexCount > 0) {
            int currentVertex = noSuccessors();
            if (currentVertex == -1) {
                System.out.println("Graph has cycle");
                return;
            }
            sortedArray[vertexCount - 1] = vertexList[currentVertex].label;
            deleteVertex(currentVertex);
        }

        System.out.println("Topological sorted order:");
        for (int j=0;j<originalVerts;j++)
            System.out.print(sortedArray[j]+" ");
        System.out.println();

    }

    private void deleteVertex(int delVertex) {
        if (delVertex != vertexCount - 1) {
            for (int j = delVertex; j < vertexCount - 1; j++)
                vertexList[j] = vertexList[j + 1];

            for (int row = delVertex; row < vertexCount - 1; row++)
                moveRowUp(row, vertexCount);

            for (int column = delVertex; column < vertexCount - 1; column++)
                moveColLeft(column, vertexCount - 1);
        }
        vertexCount--;
    }

    private void moveRowUp(int row, int length) {
        for (int col = 0; col < length; col++)
            adjMatrix[row][col] = adjMatrix[row + 1][col];
    }
    private void moveColLeft(int col, int length) {
        for (int row = 0; row < length; row++)
            adjMatrix[row][col] = adjMatrix[row][col + 1];

    }
    private int noSuccessors() {
        boolean isEdge;
        for (int i = 0; i < vertexCount; i++) {
            isEdge = false;
            for (int j = 0; j < vertexCount; j++) {
                if (adjMatrix[i][j] > 0) {
                    isEdge = true;
                    break;
                }
            }
            if (!isEdge)
                return i;
        }
        return -1;
    }


}
