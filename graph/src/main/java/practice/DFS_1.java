package practice;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Dhiraj
 * @date 17/02/19
 */
public class DFS_1 {
    private int v;
    private LinkedList<Integer> adj[];

    public DFS_1(int v){
        this.v=v;
        this.adj=new LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    public void dfs(int s){
        boolean[] visited=new boolean[v];
        dfsUtils(s,visited);

    }

    private void dfsUtils(int s, boolean[] visited) {
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (!queue.isEmpty()){
            s= queue.poll();
            Iterator<Integer> it= adj[s].listIterator();
            while (it.hasNext()){
                int n=it.next();
                if (!visited[n]){
                    visited[n]=true;
                    dfsUtils(n,visited);
                }
            }
        }
    }


    public static void main(String[] args) {
        Dfs g= new Dfs(6);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,0);
        g.addEdge(1,3);
        g.addEdge(1,4);
        g.addEdge(2,0);
        g.addEdge(2,4);
        g.addEdge(3,1);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(4,1);
        g.addEdge(4,2);
        g.addEdge(4,3);
        g.addEdge(4,5);
        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        g.dfs(1);
    }

}
