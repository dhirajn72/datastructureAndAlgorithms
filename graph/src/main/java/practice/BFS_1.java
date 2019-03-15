package practice;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Dhiraj
 * @date 17/02/19
 */
public class BFS_1 {
    private int v;
    private LinkedList<Integer> adj[];

    public BFS_1(int v){
        this.v=v;
        this.adj= new  LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]=new LinkedList<>();
    }

    public void addEdge(int v,int w){adj[v].add(w);}

    public void bfs(int s){
        boolean[] visited=new boolean[v];
        LinkedList<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (!queue.isEmpty()){
            s=queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> it= adj[s].listIterator();
            while (it.hasNext()){
                int n=it.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS_1 g= new BFS_1(6);
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
        g.bfs(0);
    }
}
