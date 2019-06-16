package com.karumanchi;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class GraphBFS {
    private final int maxVertices = 20;
    private Vertex vertexList[];
    private int adjMatrix[][];
    private int vertexCount;
    private Queue<Integer> theQueue;

    public GraphBFS() {
        vertexList = new Vertex[maxVertices];
        adjMatrix = new int[maxVertices][maxVertices];
        theQueue = new LinkedList<>();
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

        /*dfs.addEdge(0, 4);
        dfs.addEdge(1, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(2, 1);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 1);
        dfs.addEdge(3, 2);
        dfs.addEdge(3, 4);
        dfs.addEdge(4, 0);
        dfs.addEdge(4, 1);
        dfs.addEdge(4, 3);*/


        dfs.bfs();
    }

    public void addVertex(char label) {
        vertexList[vertexCount++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void displayVertex(int v) {
        System.out.println(vertexList[v].label);
    }

    public void bfs() {
        vertexList[0].visited = true;
        displayVertex(0);
        theQueue.add(0);
        int v1;
        while (!theQueue.isEmpty()) {
            int v2 = theQueue.remove();
            while ((v1 = getAdjUnvisitedVertex(v2)) != -1) {
                vertexList[v1].visited = true;
                displayVertex(v1);
                theQueue.add(v1);
            }

        }
        for (int j = 0; j < vertexCount; j++) {
            vertexList[j].visited = false;
        }
    }

    private int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < vertexCount; i++) {
            if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                return i;
        }
        return -1;
    }
}
