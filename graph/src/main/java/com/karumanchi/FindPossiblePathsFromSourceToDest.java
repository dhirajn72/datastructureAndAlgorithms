package com.karumanchi;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 09/06/19
 */
public class FindPossiblePathsFromSourceToDest {

    static class Graph {
        private final int maxCount = 20;
        private Vertex[] vertexList;
        private int nVerts;
        private Stack<Integer> stack;
        private int[][] adjMatrix;

        public Graph() {
            vertexList = new Vertex[maxCount];
            adjMatrix = new int[maxCount][maxCount];
            stack = new Stack<>();
        }

        public void addVertex(char label) {
            vertexList[nVerts++] = new Vertex(label);
        }

        public void addEdge(int source, int dest) {
            adjMatrix[source][dest] = 1;
        }

        public void dfs(int src, int dest) {
            if (src==dest)return;
            vertexList[src].visited = true;
            displayVertex(src);
            stack.push(src);

            while (!stack.isEmpty()) {
                int v = getUnvisitedVertex(stack.peek());
                if (v == -1) {
                    stack.pop();
                } else {
                    vertexList[v].visited = true;
                    displayVertex(v);
                    stack.push(v);
                }
            }
            for (int i = 0; i < nVerts; i++)
                vertexList[i].visited = false;

        }

        private int getUnvisitedVertex(Integer v) {
            for (int i = 0; i < nVerts; i++) {
                if (adjMatrix[v][i] == 1 && vertexList[i].visited == false)
                    return i;
            }
            return -1;
        }

        private void displayVertex(int src) {
            System.out.println(vertexList[src].label);
        }
    }

    public static void main(String[] args) {
        FindPossiblePathsFromSourceToDest.Graph graph= new FindPossiblePathsFromSourceToDest.Graph();
        graph.addVertex('A'); // 0
        graph.addVertex('B'); // 1
        graph.addVertex('C'); // 2
        graph.addVertex('D'); // 3

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(2,1);

        List paths= new ArrayList();
        graph.dfs(2,3);
    }


}



