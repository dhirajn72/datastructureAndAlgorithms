package practice;


import com.karumanchi.Vertex;

import java.util.Stack;

/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class Graph_DFS_Cycle_Detecting {
    private final int maxCount=20;
    private Vertex[] vertexList;
    private int nVerts;
    private int[][] adjMatrix;
    private Stack<Integer> theStack;

    public Graph_DFS_Cycle_Detecting(){
        vertexList=new Vertex[maxCount];
        adjMatrix=new int[maxCount][maxCount];
        theStack=new Stack<>();
    }

    public void addVertex(char label){
        vertexList[nVerts++]= new Vertex(label);
    }

    public void addEdge(int source,int dest){
        adjMatrix[source][dest]=1;
        //adjMatrix[dest][source]=1;
    }

    private int noSuccessors(int originalVerts) {
        boolean isEdge;
        for (int i = 0; i < originalVerts; i++) {
            isEdge = false;
            for (int j = 0; j < originalVerts; j++) {
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

    private boolean checkCycle() {
            int originalVerts = nVerts;
            while (originalVerts > 0) {
                int currentVertex = noSuccessors(originalVerts);
                if (currentVertex == -1) {
                    System.out.println("Graph has cycle");
                    return true;
                }
                originalVerts--;
            }
            return false;
    }

    public static void main(String[] args) {

        Graph_DFS_Cycle_Detecting dfs = new Graph_DFS_Cycle_Detecting();

        dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.addEdge(3,1);

        System.out.println(dfs.checkCycle());
    }


}
