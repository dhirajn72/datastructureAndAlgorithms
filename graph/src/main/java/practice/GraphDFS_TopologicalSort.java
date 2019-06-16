package practice;

import com.karumanchi.Vertex;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class GraphDFS_TopologicalSort {
    private final int maxVertices = 20;
    private Vertex[] vertexList;
    private int vertexCount;
    private Stack<Integer> theStack;
    private int[][] adjMatrix;
    private LinkedList<Character> integers;

    public GraphDFS_TopologicalSort() {
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        theStack = new Stack<>();
        integers= new LinkedList<>();
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
                int popped=theStack.pop();
                integers.add(vertexList[popped].label)
                ;
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
        GraphDFS_TopologicalSort dfs= new GraphDFS_TopologicalSort();

        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(0,4);
        dfs.addEdge(1,2);
        dfs.addEdge(3,1);
        dfs.addEdge(3,2);
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
        //System.out.println(dfs.integers);
        Collections.reverse(dfs.integers);
        System.out.println(dfs.integers);
    }

}
