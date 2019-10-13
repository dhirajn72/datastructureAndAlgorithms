package interview;

import com.java.graph.Vertices;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 28/08/19
 */
public class Graph {
    private Vertices[] vertices;
    private int max;
    private int count;
    private int[][] matrix;
    private Queue<Integer> q;
    private Stack<Integer> s;

    public Graph(int max) {
        this.max = max;
        vertices=new Vertices[max];
        matrix=new int[max][max];
        s=new Stack<>();
        q=new LinkedList<>();
    }

    public void addVertex(char c){
        vertices[count++]=new Vertices(c);
    }
    public void addEdges(int src,int dest){
        matrix[src][dest]=1;
        matrix[dest][src]=1;
    }
    public void display(int v){
        System.out.print(vertices[v].lable+",");
    }

    public void dfs(){
        vertices[0].isVisited=true;
        display(0);
        s.push(0);
        while (!s.isEmpty()){
            int v=getUnvisitedNode(s.peek());
            if (v==-1)
                s.pop();
            else{
                vertices[v].isVisited=true;
                display(v);
                s.push(v);
            }
        }
    }

    public void bfs(){
        vertices[0].isVisited=true;
        display(0);
        q.offer(0);
        int v;
        while (!q.isEmpty()){
            int v1=q.remove();
            while ((v=getUnvisitedNode(v1))!=-1){
                vertices[v].isVisited=true;
                display(v);
                q.offer(v);
            }
        }
    }



    private int getUnvisitedNode(int v) {
        for (int i = 0; i < vertices.length; i++) {
            if (matrix[v][i]==1 && vertices[i].isVisited==false)
                return i;
        }
        return -1;
    }
}
