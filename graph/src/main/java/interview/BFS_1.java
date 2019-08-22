package interview;

import com.karumanchi.Vertex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class BFS_1 {
    private final int maxCount = 20;
    private Vertex[] vertices;
    private int vertexCount;
    private Queue<Integer> queue;
    private int[][] adjMatrix;


    public BFS_1() {
        this.vertices = new Vertex[maxCount];
        this.queue = new LinkedList<>();
        this.adjMatrix = new int[maxCount][maxCount];
    }

    public static void main(String[] args) {
        BFS_1 bfs = new BFS_1();
        bfs.addVertex('A');
        bfs.addVertex('B');
        bfs.addVertex('C');
        bfs.addVertex('D');
        bfs.addVertex('E');

        bfs.addEdge(0, 1);
        bfs.addEdge(1, 2);
        bfs.addEdge(2, 3);
        bfs.addEdge(3, 4);
        bfs.addEdge(0, 4);
        bfs.addEdge(0, 3);

        bfs.bfs(3);
    }

    public void addVertex(char c) {
        vertices[vertexCount++] = new Vertex(c);
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source][destination] = 1;
        adjMatrix[destination][source] = 1;
    }

    public void bfs(int source) {
        vertices[source].visited = true;
        displayVertex(source);
        queue.offer(source);
        int v1;
        while (!queue.isEmpty()) {
            int v = queue.remove();
            while ((v1 = getUnvisitedNode(v)) != -1) {
                vertices[v1].visited = true;
                displayVertex(v1);
                queue.offer(v1);
            }
        }
        for (int i = 0; i < vertexCount; i++) {
            vertices[i].visited = false;
        }
    }

    private int getUnvisitedNode(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertices[i].visited == false)
                return i;
        }
        return -1;
    }

    private void displayVertex(int v) {
        System.out.print(vertices[v].label + ",");
    }


}
