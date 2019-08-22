package com.java.graph;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class Graph {
    private int maxVertices=20;
    private Vertices[] vertices;
    private int[][] matrix;
    private int vertexCount;

    public Graph(int maxVertces) {
        this.vertices = new Vertices[maxVertices];
        this.matrix = new int[maxVertces][maxVertces];
    }

    public void addVertex(char ch){
        vertices[vertexCount++]=new Vertices(ch);
    }

    public void addEdges(int source,int dest, int weight){
        matrix[source][dest]=weight;
    }
}
