package practice;

import com.karumanchi.Vertex;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class GraphBFS {
    private final int maxVertices=20;
    private Vertex[] vertexList;
    private int vertexCount;
    private int[][] adjMatrix;
    private Queue<Integer> queue;

    public GraphBFS() {
        vertexList= new Vertex[maxVertices];
        adjMatrix= new int[maxVertices][maxVertices];
        queue=new LinkedList<>();
    }

    public void addVertex(char label){
        vertexList[vertexCount++]=new Vertex(label);
    }

    public  void addEdge(int source,int dest){
        adjMatrix[source][dest]=1;
        adjMatrix[dest][source]=1;
    }

    public void bfs(){
        vertexList[0].visited=true;
        displayVertex(0);
        queue.add(0);

        int v1;
        while (!queue.isEmpty()){
            int v2=queue.remove();
            while ((v1=getUnvisitedVertex(v2))!=-1){
                vertexList[v1].visited=true;
                displayVertex(v1);
                queue.add(v1);
            }
        }

        for (int i=0;i<vertexCount;i++)
            vertexList[i].visited=false;
    }

    private int getUnvisitedVertex(int v) {
        for (int i=0;i<vertexCount;i++){
            if (adjMatrix[v][i]==1 && vertexList[i].visited==false){
                return i;
            }
        }
        return -1;

    }

    private void displayVertex(int i) {
        System.out.println(vertexList[i].label);
    }

    public static void main(String[] args) {

        GraphBFS dfs = new GraphBFS();

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
        dfs.bfs();
    }


}
