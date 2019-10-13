package interview;

import com.java.graph.Vertices;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 07/10/19
 */
public class GraphImpl {
    private Vertices[] vertices;
    private int vertexCount;
    private int max;
    private Stack<Integer> s;
    private Queue<Integer> q;
    private int[][] adjArr;

    public GraphImpl(int max) {
        this.max = max;
        adjArr=new int[max][max];
        s=new Stack<>();
        vertices=new Vertices[max];
        q=new LinkedList<>();
    }

    public void addVertex(char ch){
        vertices[vertexCount++]=new Vertices(ch);
    }
    public void addEdge(int src,int dest){
        adjArr[src][dest]=1;
        adjArr[dest][src]=1;
    }

    public void display(int index){
        System.out.print(vertices[index].lable+", ");
    }

    public static void main(String[] args) {
        GraphImpl bfs=new GraphImpl(5);
        /*dfs.addVertex('A');
        dfs.addVertex('B');
        dfs.addVertex('C');
        dfs.addVertex('D');
        dfs.addVertex('E');

        dfs.addEdge(0,1);
        dfs.addEdge(1,2);
        dfs.addEdge(2,3);
        dfs.addEdge(3,4);
        dfs.dfs();*/
        System.out.println();

        bfs.addVertex('A');
        bfs.addVertex('B');
        bfs.addVertex('C');
        bfs.addVertex('D');
        bfs.addVertex('E');

        bfs.addEdge(0,1);
        bfs.addEdge(1,2);
        bfs.addEdge(2,3);
        bfs.addEdge(3,4);
        bfs.addEdge(0,4);
        bfs.addEdge(0,3);
        bfs.bfs(3);
    }

    private void bfs(int src) {
        vertices[src].isVisited=true;
        display(src);
        q.offer(src);
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

    private void dfs() {
        vertices[0].isVisited=true;
        display(0);
        s.push(0);
        while (!s.isEmpty()){
            int v=getUnvisitedNode(s.peek());
            if (v==-1)
                s.pop();
            else {
                vertices[v].isVisited=true;
                display(v);
                s.push(v);
            }
        }
        for (int i = 0; i < vertices.length; i++) {
            vertices[i].isVisited=false;
        }
    }

    private int getUnvisitedNode(Integer v) {
        for (int i = 0; i < vertices.length; i++) {
            if (adjArr[v][i]==1 && !vertices[i].isVisited)
                return i;
        }
        return -1;
    }
}
