package lafore;

import com.karumanchi.Vertex;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 07/06/19
 */
public class GraphDFS {
    private final int maxVertex = 20;
    private int[][] adjMatrix;
    private Vertex[] vertexList;
    private int vertexCount;
    private Stack<Integer> stack;

    public GraphDFS() {
        adjMatrix = new int[maxVertex][maxVertex];
        vertexList = new Vertex[maxVertex];
        stack = new Stack<>();
    }

    public static void main(String[] args) {
        GraphDFS dfs = new GraphDFS();

        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.dfs(3);
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        adjMatrix[dest][source] = 1;
    }

    public void dfs(int source) {
        vertexList[source].visited = true;
        displayVertex(source);
        stack.push(source);
        while (!stack.isEmpty()) {
            int v = getUnvisistedVertex(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].visited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        for (int i = 0; i < vertexCount; i++)
            vertexList[i].visited = false;
    }

    private int getUnvisistedVertex(Integer v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                return i;
        }
        return -1;
    }

    private void displayVertex(int i) {
        System.out.print(vertexList[i].label+",");
    }


}
