package com.java.graph;

import java.util.*;

/**
 * @author Dhiraj
 * @date 01/08/19
 */
public class DFS_Dijkstra_Bellman {
    private final int maxVertex = 20;
    private Vertices[] vertices;
    private Stack<Integer> stack;
    private int[][] matrix;
    private int vertexCount;
    private Queue<Integer> queue;

    public DFS_Dijkstra_Bellman(int vertexCount) {
        vertices = new Vertices[vertexCount];
        stack = new Stack<>();
        matrix = new int[vertexCount][vertexCount];
        queue = new LinkedList<>();
    }

    public static void main(String[] args) throws Exception {
        DFS_Dijkstra_Bellman graph = new DFS_Dijkstra_Bellman(4);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        // graph.addVertex('E'); //4
        /*graph.addEdges(0, 1);
        graph.addEdges(0, 3);
        graph.addEdges(0, 4);
        graph.addEdges(1, 2);
        graph.addEdges(2, 3);
        graph.addEdges(3, 4);*/

       /* graph.addEdges(0, 1,4);
        graph.addEdges(0, 3,4);
        //graph.addEdges(0, 4,-3); // 3 initially
        graph.addEdges(1, 2,10); // 2 initially
        graph.addEdges(2, 3,6); // 6 initially
        //graph.addEdges(3, 4,7);
        graph.addEdges(4, 3,7);*/

        graph.addEdges(0, 1, 4);
        graph.addEdges(0, 3, 5);
        //graph.addEdges(1, 3,-10); // 2 initially
        graph.addEdges(2, 1, -10); // 6 initially
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
        double[][] m = new double[graph.matrix.length][graph.matrix[0].length];
        for (int i = 0; i < graph.matrix.length; i++) {
            for (int j = 0; j < graph.matrix[0].length; j++) {
                m[i][j] = graph.matrix[i][j];
            }
        }

        System.out.println("******");
        System.out.println(Arrays.toString(m[0]));
        System.out.println(Arrays.toString(m[1]));
        System.out.println(Arrays.toString(m[2]));
        System.out.println(Arrays.toString(m[3]));
        //System.out.println(Arrays.toString(m[4]));
    }

    public void addVertex(char vertex) {
        this.vertices[vertexCount++] = new Vertices(vertex);
    }

    public void addEdges(int source, int destination, int weight) {
        matrix[source][destination] = weight;
        // matrix[destination][source] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertices[v].lable + ", ");
    }

    public void bellmanFord(Integer[][] matrix, int source) throws Exception {

        //auxiliary constants

        Integer[] pred = new Integer[vertexCount]; // predecessors
        Integer[] minDist = new Integer[vertexCount]; // minDistances
        Arrays.fill(pred, -1);
        Arrays.fill(minDist, 10000);
        minDist[source] = 0;

        for (int i = 0; i < vertexCount - 1; i++) {
            for (int j = 0; j < vertexCount; j++) {
                for (int x : adjacency(matrix, j)) {
                    if (minDist[x] > minDist[j] + matrix[j][x]) {
                        minDist[x] = minDist[j] + matrix[j][x];
                        pred[x] = j;
                    }
                }
            }
        }
        for (int j = 0; j < vertexCount; j++) {
            for (int x : adjacency(matrix, j)) {
                if (minDist[x] > minDist[j] + matrix[j][x]) {
                    throw new Exception("Negative cycle found");
                }
            }
        }
        Integer[][] result = {pred, minDist}; // distances and predecessors
        printSolution(result, source);
    }

    private List<Integer> adjacency(Integer[][] matrix, int v) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[v][i] != null) {
                result.add(i);
            }
        }
        return result;
    }

    void printSolution(Integer dist[][], int n) {
        System.out.println("Shortest path from source::" + vertices[n].lable + " to other vertices are");
        Integer[] distances = dist[1];
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[n].lable + " to " + vertices[i].lable + " is ::" + distances[i]);
            System.out.println();
        }
    }
}
