package com.java.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 01/08/19
 */
public class Dijkstra_1 {
    private final int maxVertex = 20;
    private Vertices[] vertices;
    private Stack<Integer> stack;
    private int[][] matrix;
    private int vertexCount;
    private Queue<Integer> queue;

    public Dijkstra_1(int vertexCount) {
        vertices = new Vertices[vertexCount];
        stack = new Stack<>();
        matrix = new int[vertexCount][vertexCount];
        queue=new LinkedList<>();
    }

    public void addVertex(char vertex) {
        this.vertices[vertexCount++] = new Vertices(vertex);
    }

    /*public void addEdges(int source, int destination,int weight) {
        matrix[source][destination] = weight;
        matrix[destination][source] = weight;
    }*/

    public void addEdges(int source, int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    public void displayVertex(int v) {
        System.out.print(vertices[v].lable+", ");
    }

    public void dfs(int src) {
        vertices[src].isVisited = true;
        displayVertex(src);
        stack.push(src);
        //Stack<Character> topological=new Stack<>();
        while (!stack.isEmpty()) {
            int v = getUnvisitedNode(stack.peek());
            if (v == -1) {
                int vertex=stack.pop();
                //topological.push(vertices[vertex].lable);
            } else {
                vertices[v].isVisited = true;
                displayVertex(v);
                stack.push(v);
            }
        }
        System.out.println();
        System.out.println("***Topological sort***");
        /*while (!topological.isEmpty())
            System.out.print(topological.pop()+", ");*/
        System.out.println();
        System.out.println("******");
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].isVisited=false;
        }
    }

    private int getUnvisitedNode(Integer v) {
        for (int i = 0; i < vertices.length; i++) {
            if (matrix[v][i] == 1 && vertices[i].isVisited == false)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Dijkstra_1 graph=new Dijkstra_1(5);
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

        /*graph.addEdges(0, 1,4);
        graph.addEdges(0, 3,4);
        graph.addEdges(0, 4,3);
        graph.addEdges(1, 2,2);
        graph.addEdges(2, 3,6);
        graph.addEdges(3, 4,7);*/
        System.out.println("******");
        graph.dfs(0);
        System.out.println();
        graph.bfs(0);
        //graph.dijkstra(graph.matrix,0);
    }

    private void bfs(int src) {
        vertices[src].isVisited=true;
        displayVertex(src);
        queue.offer(src);
        int v1;
        while (!queue.isEmpty()){
            int v=queue.remove();
            while ((v1=getUnvisitedNode(v))!=-1){
                vertices[v1].isVisited=true;
                displayVertex(v1);
                queue.offer(v1);
            }
        }
    }

    void dijkstra(int matrix[][], int src) {
        int[] dist= new int[vertexCount];
        boolean[] sptSet=new boolean[vertexCount];
        for (int i = 0; i <dist.length ; i++) {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[src]=0;
        for (int i = 0; i <vertexCount-1 ; i++) {
            int u=minDistance(dist,sptSet);
            sptSet[u]=true;
            for (int j = 0; j <vertexCount ; j++) {
                if (sptSet[j]==false && matrix[u][j]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+matrix[u][j]<dist[j])
                    dist[j]=dist[u]+matrix[u][j];
            }

        }
        printSolution(dist,src);
    }

    private void printSolution(int[] dist, int src) {
        System.out.println("Distances are::");
        for (int i = 0; i < vertexCount; i++) {
            System.out.println(vertices[src].lable+" to "+vertices[i].lable+" is :: "+dist[i]);
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
}
