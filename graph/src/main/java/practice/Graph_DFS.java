package practice;


import com.karumanchi.Vertex;


import java.util.Stack;

/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class Graph_DFS {
    private final int maxCount=20;
    private Vertex[] vertexList;
    private int nVerts;
    private int[][] adjMatrix;
    private Stack<Integer> theStack;

    public Graph_DFS(){
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

    public void dfs(int source){
        vertexList[source].visited=true;
        displayVertex(source);
        theStack.push(source);

        while (!theStack.isEmpty()){
            int v=getUnvisitedVertex(theStack.peek());
            if (v==-1)
                theStack.pop();
            else {
                vertexList[v].visited=true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        for (int i=0;i<nVerts;i++)
            vertexList[i].visited=false;


    }

    private int getUnvisitedVertex(Integer v) {
        for (int i=0;i<nVerts;i++){
            if (adjMatrix[v][i]==1 && vertexList[i].visited==false)
                return i;
        }
        return -1;
    }

    private void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public static void main(String[] args) {

        Graph_DFS dfs = new Graph_DFS();

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

        dfs.dfs(3);




    }


}
