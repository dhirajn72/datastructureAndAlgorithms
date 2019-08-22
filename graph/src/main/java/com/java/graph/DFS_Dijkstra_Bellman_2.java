package com.java.graph;

import java.util.*;

/**
 * @author Dhiraj
 * @date 01/08/19
 */
public class DFS_Dijkstra_Bellman_2 {
    private final int maxVertex = 20;
    private Vertices[] vertices;
    private Stack<Integer> stack;
    private int[][] matrix;
    private int vertexCount;
    private Queue<Integer> queue;

    public DFS_Dijkstra_Bellman_2(int vertexCount) {
        vertices = new Vertices[vertexCount];
        stack = new Stack<>();
        matrix = new int[vertexCount][vertexCount];
        queue = new LinkedList<>();
    }

    public static void main(String[] args) throws Exception {
        DFS_Dijkstra_Bellman_2 graph = new DFS_Dijkstra_Bellman_2(4);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3

        graph.addEdges(0, 1, 4);
        graph.addEdges(0, 3, 5);
        //graph.addEdges(1, 3,-10); // 2 initially
        graph.addEdges(2, 1, -10); // 6 initially
        graph.addEdges(3, 2, 2);

        System.out.println("*********");
        System.out.println("*********");
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
        System.out.println("*********");
        System.out.println(Arrays.toString(graph.matrix[0]));
        System.out.println(Arrays.toString(graph.matrix[1]));
        System.out.println(Arrays.toString(graph.matrix[2]));
        System.out.println(Arrays.toString(graph.matrix[3]));
        //System.out.println(Arrays.toString(graph.matrix[4]));
        System.out.println(">>>>>>>>>>>>>>>>>>");
        System.out.println(Arrays.toString(matrixForBellman[0]));
        System.out.println(Arrays.toString(matrixForBellman[1]));
        System.out.println(Arrays.toString(matrixForBellman[2]));
        System.out.println(Arrays.toString(matrixForBellman[3]));
        //System.out.println(Arrays.toString(matrixForBellman[4]));
        System.out.println("*****Bellman results****");
        graph.bellmanFord(matrixForBellman, 0);
        System.out.println("####");
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

       // int[] pred=new int[vertexCount];
        int[] minDist= new int[vertexCount];
       //Arrays.fill(pred,-1);
        Arrays.fill(minDist,10000000);

        minDist[source]=0;

        for (int i = 0; i < vertexCount-1; i++) {
            for (int j = 0; j < vertexCount; j++) {
                for (int x:adjacency(matrix,j)){
                    if (minDist[x]>minDist[j]+matrix[j][x]){
                        minDist[x]=minDist[j]+matrix[j][x];
                       // pred[x]=j;
                    }

                }
            }
        }

        for (int j = 0; j < vertexCount; j++) {
            for (int x:adjacency(matrix,j)){
                if (minDist[x]>minDist[j]+matrix[j][x]){
                    throw new RuntimeException("Negative Cycle exists");
                }
            }
        }

        printSolution(minDist,source);
    }

    private void printSolution(int[] minDist, int source) {
        for (int i = 0; i <vertexCount ; i++) {
            System.out.println(vertices[source].lable+" to "+vertices[i].lable+ " is::"+minDist[i]);
        }
    }

    private List<Integer> adjacency(Integer[][] matrix, int j) {
        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < vertexCount; i++) {
            if (matrix[j][i]!=null)
                result.add(i);
        }
        return result;
    }
}