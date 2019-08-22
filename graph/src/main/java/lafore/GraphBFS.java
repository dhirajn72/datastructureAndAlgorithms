package lafore;

import com.karumanchi.Vertex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 07/06/19
 */
public class GraphBFS {
    private final int maxNumber = 20;
    private Vertex[] vertexList;
    private int vertexCount;
    private int[][] adjMatrix;
    private Queue<Integer> queue;

    public GraphBFS() {
        vertexList = new Vertex[maxNumber];
        adjMatrix = new int[maxNumber][maxNumber];
        queue = new LinkedList<>();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    private void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        adjMatrix[dest][source] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label+",");
    }

    public void bfs(int source) {
        vertexList[source].visited = true;
        displayVertex(source);
        queue.offer(source);
        int v1;
        while (!queue.isEmpty()) {
            int v2 = queue.remove();
            while ((v1 = getUnvisitedVertex(v2)) != -1) {
                vertexList[v1].visited = true;
                displayVertex(v1);
                queue.offer(v1);
            }
        }

        for (int i = 0; i < vertexCount; i++)
            vertexList[i].visited = false;

    }

    private int getUnvisitedVertex(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        GraphBFS bfs= new GraphBFS();
        bfs.addVertex('A');
        bfs.addVertex('B');
        bfs.addVertex('C');
        bfs.addVertex('D');
        bfs.addVertex('E');
        bfs.addEdge(0,1);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,4);
        bfs.addEdge(0,4);
        bfs.addEdge(0,3);
        bfs.bfs(0);
    }
}
