package practice;

import com.karumanchi.Vertex;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class GraphDFS {
    private final int maxVertices = 20;
    private Vertex[] vertexList;
    private int vertexCount;
    private Stack<Integer> theStack;
    private int[][] adjMatrix;

    public GraphDFS() {
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        theStack = new Stack<>();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        //adjMatrix[dest][source] = 1;
    }

    public void dfs() {
        vertexList[0].visited = true;
        displayVertex(0);
        theStack.push(0);

        while (!theStack.isEmpty()) {
            int v = getUnvisitedVertex(theStack.peek());
            if (v == -1) {
                theStack.pop();
            } else {
                vertexList[v].visited = true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int i = 0; i < vertexCount; i++)
            vertexList[i].visited = false;
    }

    private int getUnvisitedVertex(Integer v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                return i;
        }
        return -1;
    }

    private void displayVertex(int i) {
        System.out.println(vertexList[i].label);
    }

    public static void main(String[] args) {
        GraphDFS dfs= new GraphDFS();

        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(0,4);
        dfs.addEdge(1,0);
        dfs.addEdge(1,2);
        dfs.addEdge(1,4);
        dfs.addEdge(1,3);
        dfs.addEdge(2,1);
        dfs.addEdge(2,3);
        dfs.addEdge(3,1);
        dfs.addEdge(3,2);
        dfs.addEdge(3,4);
        dfs.addEdge(4,0);
        dfs.addEdge(4,1);
        dfs.addEdge(4,3);


        // Performing topological sort, for that making DAG

        /*dfs.addEdge(0,1);
        dfs.addEdge(0,4);
        dfs.addEdge(1,2);
        dfs.addEdge(3,1);
        dfs.addEdge(3,2);
        dfs.addEdge(4,1);
        dfs.addEdge(4,3);*/

        dfs.dfs();
    }

}
