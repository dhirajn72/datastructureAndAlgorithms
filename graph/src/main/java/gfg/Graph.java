package gfg;

import lafore.Vertex;

/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class Graph {
    private final int maxVertexCount = 20;
    private int[][] adjMatrix;
    private Vertex[] vertexList;
    private int nVerts;

    public Graph() {
        adjMatrix = new int[maxVertexCount][maxVertexCount];
        vertexList = new Vertex[maxVertexCount];
    }

    public int[][] getAdjMatrix() {
        return adjMatrix;
    }

    public void addVertex(char label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdges(int source, int dest, int weight) {
        adjMatrix[source][dest] = weight;
    }


    int minDistance(int dist[], Boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for (int i = 0; i < nVerts; i++) {
            if (sptSet[i] == false && dist[i] <= min) {
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    void printSolution(int dist[], int n) {
        System.out.println("Vertex   Distance from Source:" + n);
        for (int i = 0; i < nVerts; i++)
            System.out.println(vertexList[n].label + " to " + vertexList[i].label + " tt " + dist[i]);
    }

    public void callDijkstra(int source) {
        dijkstra(adjMatrix, source);
        //dijkastra(adjMatrix,source);
    }


    /* private void dijkstra(int matrix[][], int src) {
         int dist[] = new int[nVerts];
         Boolean sptSet[] = new Boolean[nVerts];
         for (int i = 0; i < nVerts; i++) {
             dist[i] = Integer.MAX_VALUE;
             sptSet[i] = false;
         }
         dist[src] = 0;
         for (int i = 0; i < nVerts; i++) {
             int minIndex = minDistance(dist, sptSet);
             sptSet[minIndex] = true;
             for (int j = 0; j < nVerts; j++) {
                 if (sptSet[j] == false) {
                     if (dist[minIndex] != Integer.MAX_VALUE) {
                         if (matrix[minIndex][j] != 0) {
                             if (dist[minIndex] + matrix[minIndex][j] < dist[j]) {
                                 dist[j] = dist[minIndex] + matrix[minIndex][j];
                             }
                         }
                     }
                 }
             }
         }
         printSolution(dist, src);
     }*/
    private void dijkstra(int matrix[][], int src) {
        int dist[] = new int[nVerts];
        Boolean sptSet[] = new Boolean[nVerts];
        for (int i = 0; i < nVerts; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for (int i = 0; i < nVerts; i++) {
            int minIndex = minDistance(dist, sptSet);
            sptSet[minIndex] = true;
            for (int j = 0; j < nVerts; j++) {
                if (sptSet[j] == false && dist[minIndex] != Integer.MAX_VALUE && matrix[minIndex][j] != 0 && dist[minIndex] + matrix[minIndex][j] < dist[j]) {
                    dist[j] = dist[minIndex] + matrix[minIndex][j];
                }
            }
        }
        printSolution(dist, src);
    }

    private void dijkastra(int[][] adjMatrix,int src){
        int[] dist=new int[nVerts];
        boolean[] sptSet= new boolean[nVerts];
        for (int i=0;i<nVerts;i++){
            dist[i]=Integer.MAX_VALUE;
            sptSet[i]=false;
        }
        dist[src]=0;
        for (int i=0;i<nVerts;i++){
            int minIndex=findMinDistance(dist,sptSet);
            sptSet[minIndex]=true;
            for (int j=0;j<nVerts;j++){
                if (sptSet[j]==false && dist[minIndex]!=Integer.MAX_VALUE && adjMatrix[minIndex][j]!=0 && dist[minIndex]+adjMatrix[minIndex][j]<dist[j]){
                    dist[j]=adjMatrix[minIndex][j]+dist[minIndex];
                }
            }
        }

        printDijKstraSolution(dist,src);
    }

    private void printDijKstraSolution(int[] dist, int src) {
        System.out.println("*********");
        for (int i=0;i<nVerts;i++)
            System.out.print(vertexList[src].label+" to "+ vertexList[i].label+" >> "+dist[i]+"\n");

    }


    private int findMinDistance(int[] dist, boolean[] sptSet) {
        int min=Integer.MAX_VALUE, minIndex=-1;
        for (int i=0;i<nVerts;i++){
            if (sptSet[i]==false && dist[i]<=min){
                min=dist[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

}
