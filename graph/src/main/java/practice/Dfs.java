package practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Dhiraj
 * @date 25/01/19
 */
public class Dfs {
    private int v;
    private LinkedList<Integer> adj[];

    public Dfs(int v){
        this.v=v;
        this.adj=new LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    public void dfs(int s){
        boolean[] visited=new boolean[v];
        dfsUtil(s,visited);
    }

    private void dfsUtil(int s, boolean[] visited) {
        visited[s]=true;
        System.out.print(s+" ");
        ListIterator<Integer> iterator=adj[s].listIterator();
        while (iterator.hasNext()){
            int n=iterator.next();
            if (!visited[n]){
                dfsUtil(n,visited);
            }
        }
    }
    public void addEdge(int v,int w){
        this.adj[v].add(w);
        this.adj[w].add(v);
    }

    public static void main(String args[])
    {
        Dfs g = new Dfs(4);
        /*g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);*/

        /*bfs.addEdge(0,1);
        bfs.addEdge(1,3);
        bfs.addEdge(3,2);
        bfs.addEdge(2,1);
        bfs.addEdge(2,0);*/

        /*g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(4,0);*/
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 1)");

        g.dfs(2);
    }

}
