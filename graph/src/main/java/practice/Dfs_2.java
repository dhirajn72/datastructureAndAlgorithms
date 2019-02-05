package practice;

import com.java.graph.GraphDFS;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * @author Dhiraj
 * @date 27/01/19
 */
public class Dfs_2 {
    private int v;
    private LinkedList<Integer> adj[];
    public Dfs_2(int v){
        this.v=v;
        this.adj= new LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }
    public void addEdge(int v,int w){
        this.adj[v].add(w);
    }
    public void dfs(int s){
        boolean[] visited= new boolean[v];
        dfsUtil(s,visited);
    }
    public  void dfsUtil(int s,boolean[] visited){
        visited[s]=true;
        System.out.print(s+" ");
        Iterator<Integer> iterator= adj[s].listIterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            if (!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }

    public static void main(String[] args) {
        //Dfs_2 bfs= new Dfs_2(4);
        GraphDFS bfs= new GraphDFS(4);

        bfs.addEdge(0,1);
        bfs.addEdge(1,3);
        bfs.addEdge(3,2);
        bfs.addEdge(2,1);
        bfs.addEdge(2,0);

        System.out.println("Bfs traversals are from vertex: 2");
        bfs.DFS(2);

    }
}
