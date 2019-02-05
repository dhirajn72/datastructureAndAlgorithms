package practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Dhiraj
 * @date 25/01/19
 */
public class Dfs_1 {
    private int v;
    private LinkedList<Integer> adj[];

    public Dfs_1(int v){
        this.v=v;
        this.adj=new LinkedList[v];
        for (int i=0;i<v;i++)
            this.adj[i]=new LinkedList<>();
    }
    public void addEdge(int v,int w){this.adj[v].add(w);}

    public void dfs(int s){
        boolean[] visited=new boolean[v];
        dfsUtil(s,visited);
    }

    private void dfsUtil(int v, boolean[] visited) {
        visited[v]=true;
        System.out.print(v+" ");
        ListIterator<Integer> iterator= this.adj[v].listIterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            if (!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }
    public static void main(String args[])
    {
        Dfs_1 bfs = new Dfs_1(4);
        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/
        bfs.addEdge(0,1);
        bfs.addEdge(1,3);
        bfs.addEdge(3,2);
        bfs.addEdge(2,1);
        bfs.addEdge(2,0);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        bfs.dfs(2);
    }


}
