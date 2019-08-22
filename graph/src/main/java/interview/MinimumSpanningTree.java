package interview;

import com.karumanchi.Vertex;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class MinimumSpanningTree {
    private final int maxCount = 20;
    private int[][] adjMatrix;
    private Vertex[] vertices;
    private Stack<Integer> stack;
    private int vertexCount;

    public MinimumSpanningTree() {
        this.adjMatrix = new int[maxCount][maxCount];
        this.vertices = new Vertex[maxCount];
        stack = new Stack<>();
    }

    public static void main(String[] args) {

        MinimumSpanningTree dfs = new MinimumSpanningTree();
        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.dfs();
    }

    public void addVertex(char lable) {
        vertices[vertexCount++] = new Vertex(lable);
    }

    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        adjMatrix[dest][source] = 1;
    }

    public void displayVertex(int index) {
        System.out.print(vertices[index].label );
    }

    public void dfs() {
        vertices[0].visited = true;
       // displayVertex(0);
        stack.push(0);
        while (!stack.isEmpty()) {
            int currentVertex=stack.peek();
            int v2 = getUnvisitedNode(currentVertex);
            if (v2 == -1) {
                stack.pop();
            } else {
                vertices[v2].visited = true;
                displayVertex(currentVertex);
                displayVertex(v2);
                System.out.print(" ");
                stack.push(v2);
            }
        }
    }
    private int getUnvisitedNode(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertices[i].visited == false)
                return i;
        }
        return -1;
    }
}
