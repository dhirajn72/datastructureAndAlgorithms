package com.java.graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 14/08/19
 */
public class Graph_1 {
    private Vertices[] vertices;
    private int maxCount;
    private int vertexCount;
    private Stack<Integer> s;
    private Queue<Integer> q;
    private int[][] arr;

    public Graph_1(int maxCount) {
        this.maxCount = maxCount;
        vertices=new Vertices[maxCount];
        s=new Stack<>();
        q= new LinkedList<>();
        arr=new int[maxCount][maxCount];
    }

    public void addVertex(char c){
        this.vertices[vertexCount++]=new Vertices(c);
    }
    public void addEdges(int src,int dest){
        arr[src][dest]=1;
        arr[dest][src]=1;
    }

    public void display(int v){
        System.out.print(vertices[v].lable+", ");
    }

    public void dfs(){
        vertices[0].isVisited=true;
        display(0);
        s.push(0);

        while (!s.isEmpty()){
            int v=getUnvisitedNode(s.peek());
            if (v==-1){
                s.pop();
            }
            else {
                vertices[v].isVisited=true;
                display(v);
                s.push(v);
            }
        }

        for (int i = 0; i <vertices.length ; i++)
            vertices[i].isVisited=false;

    }

    private int getUnvisitedNode(int v) {
        for (int i = 0; i < vertices.length; i++) {
            if (arr[v][i]==1 && vertices[i].isVisited==false)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Graph_1 graph= new Graph_1(5);
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
        graph.dfs();
        System.out.println();
        graph.bfs();


    }

    private void bfs() {
        vertices[0].isVisited=true;
        display(0);
        q.offer(0);
        int v1;
        while (!q.isEmpty()){
            int v=q.poll();
            while ((v1=getUnvisitedNode(v))!=-1){
                vertices[v1].isVisited=true;
                display(v1);
                q.offer(v1);
            }
        }
    }
}
