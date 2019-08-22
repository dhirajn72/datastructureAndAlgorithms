package com.java.graph;

import java.util.*;

/**
 * @author Dhiraj
 * @date 01/08/19
 */
public class DFS_Dijkstra_Bellman_3 {
    private final int maxVertex = 20;
    private Vertices[] vertices;
    private Stack<Integer> stack;
    private int[][] matrix;
    private int vertexCount;
    private Queue<Integer> queue;

    public DFS_Dijkstra_Bellman_3(int vertexCount) {
        vertices = new Vertices[vertexCount];
        stack = new Stack<>();
        matrix = new int[vertexCount][vertexCount];
        queue = new LinkedList<>();
    }

    public static void main(String[] args) throws Exception {
        DFS_Dijkstra_Bellman_3 graph = new DFS_Dijkstra_Bellman_3(4);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3

        graph.addEdges(0, 1, 4);
        graph.addEdges(0, 3, 5);
        //graph.addEdges(1, 3,-10); // 2 initially
        graph.addEdges(2, 1, 10); // 6 initially
        graph.addEdges(3, 2, 2);

        System.out.println("******");
        System.out.println();
        System.out.println();
        System.out.println("************");
        Integer[][] matrixForBellman = new Integer[graph.matrix.length][graph.matrix[0].length];
        for (int i = 0; i < graph.matrix.length; i++) {
            Integer[] cols = new Integer[graph.matrix[i].length];
            for (int j = 0; j < graph.matrix[0].length; j++) {
                if (graph.matrix[i][j] == 0)
                    cols[j] = null;
                else cols[j] = graph.matrix[i][j];
            }
            matrixForBellman[i] = cols;
        }
        System.out.println("*****Bellman results****");
        graph.dijkstra(graph.matrix,0);
        graph.bellmanFord(matrixForBellman, 0);

        System.out.println("####");
    }

    private void dijkstra(int[][] matrix, int source) {

        int[] dist= new int[vertexCount];
        boolean[] sptSet= new boolean[vertexCount];
        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[source]=0;

        for (int i = 0; i < vertexCount-1; i++) {
            int u=minDistance(dist,sptSet);
            sptSet[u]=true;
            for (int j = 0; j <vertexCount ; j++) {
                if (sptSet[j]==false && matrix[u][j]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+matrix[u][j]<dist[j])
                    dist[j]=dist[u]+matrix[u][j];
            }
        }
        printResult(dist,source);
    }

    private void printResult(int[] dist, int source) {
        System.out.println("****");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[source].lable+" to "+vertices[i].lable+" is :: "+dist[i]);
            System.out.println();
        }
    }

    private int minDistance(int[] dist, boolean[] sptSet) {
        int min=Integer.MAX_VALUE,minIndex=-1;
        for (int i = 0; i <vertexCount ; i++) {
            if (sptSet[i]==false && dist[i]<=min){
                min=dist[i];
                minIndex=i;
            }
        }
        return minIndex;
    }

    public void addVertex(char vertex) {
        this.vertices[vertexCount++] = new Vertices(vertex);
    }

    public void addEdges(int source, int destination, int weight) {
        matrix[source][destination] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertices[v].lable + ", ");
    }

    public void bellmanFord(Integer[][] matrix, int source) throws Exception {
        int[] minDist=new int[vertexCount];
        Arrays.fill(minDist,100000);
        minDist[source]=0;
        for (int i = 0; i < vertexCount-1; i++) {
            for (int j = 0; j < vertexCount; j++) {


            }
        }
    }
}
