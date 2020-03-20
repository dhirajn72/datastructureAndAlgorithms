package interview;

import com.karumanchi.Vertex;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 09/07/19
 */
public class FindPathFromSourceToDestination {
    private final int maxCount = 20;
    private int[][] adjMatrix;
    private Vertex[] vertices;
    private Stack<Integer> stack;
    private int vertexCount;

    public FindPathFromSourceToDestination() {
        this.adjMatrix = new int[maxCount][maxCount];
        this.vertices = new Vertex[maxCount];
        stack = new Stack<>();
    }
    public static void main(String[] args) {
        FindPathFromSourceToDestination dfs = new FindPathFromSourceToDestination();
        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        //dfs.dfs();
        System.out.println(dfs.findPathFromSourceToDestination(2,0));
    }

    public void addVertex(char lable) {
        vertices[vertexCount++] = new Vertex(lable);
    }
    public void addEdge(int source, int dest) {
        adjMatrix[source][dest] = 1;
        adjMatrix[dest][source] = 1;
    }

    public void displayVertex(int index) {
        System.out.print(vertices[index].label + ",");
    }

    public void dfs(int source) {
        vertices[source].visited = true;
        displayVertex(source);
        stack.push(source);
        while (!stack.isEmpty()) {
            int v2 = getUnvisitedNode(stack.peek());
            if (v2 == -1) {
                stack.pop();
            } else {
                vertices[v2].visited = true;
                displayVertex(v2);
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

    public boolean findPathFromSourceToDestination(int source,int dest){
        dfs(source);
        return vertices[dest].visited == true;

    }
}
