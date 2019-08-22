package com.java.graph;

import com.karumanchi.Vertex;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 22/06/19
 */
public class GraphMatrix {
    private final int maxCount = 6;
    private int vertsCount;
    private int[][] adjMatrix;
    private Stack<Integer> stack;
    private Vertex[] vertexList;
    private Queue<Integer> queue;

    public GraphMatrix() {
        vertexList = new Vertex[maxCount];
        adjMatrix = new int[maxCount][maxCount];
        stack = new Stack<>();
        queue=new LinkedList<>();
    }

    public static void main(String[] args) {
        GraphMatrix graph = new GraphMatrix();
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addEdges(0, 1);
        graph.addEdges(0, 3);
        graph.addEdges(0, 4);
        graph.addEdges(1, 2);
        graph.addEdges(2, 3);
        graph.addEdges(3, 4);
        //System.out.println(graph);
        System.out.println("******");
        graph.dfs(3);
        System.out.println();
        graph.bfs(3);
    }

    public void addVertex(char c) {
        vertexList[vertsCount++] = new Vertex(c);
    }

    public void addEdges(int src, int dest) {
        adjMatrix[src][dest] = 1;
        adjMatrix[dest][src] = 1;
    }

    public void displayVertex(int index) {
        System.out.print(vertexList[index].label + ",");
    }

    public void dfs(int src) {
        vertexList[src].visited = true;
        stack.push(src);
        displayVertex(src);
        while (!stack.isEmpty()) {
            int v = getUnvisitedNode(stack.peek());
            if (v == -1) {
                stack.pop();
            } else {
                vertexList[v].visited = true;
                displayVertex(v);
                stack.push(v);
            }
        }

        /**
         * Reseting flag
         */
        resetFlags();
    }

    public void bfs(int src){
        vertexList[src].visited=true;
        displayVertex(src);
        queue.offer(src);
        int v1;
        while (!queue.isEmpty()){
            int v2=queue.remove(); // Hold the first vertex, and visit all its adjacent nodes
            while ((v1=getUnvisitedNode(v2))!=-1){
                vertexList[v1].visited=true;
                queue.add(v1);
                displayVertex(v1);
            }
        }
        resetFlags();
    }

    public void resetFlags() {
        /**
         * Reseting flag
         */
        for (int i = 0; i < vertsCount; i++)
            vertexList[i].visited = false;
    }

    private int getUnvisitedNode(Integer v) {
        for (int i = 0; i < vertsCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                return i;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "GraphMatrix{" +
                "maxCount=" + maxCount +
                ", vertsCount=" + vertsCount +
                ", adjMatrix=" + Arrays.deepToString(adjMatrix) +
                ", stack=" + stack +
                ", vertexList=" + Arrays.toString(vertexList) +
                '}';
    }
}
