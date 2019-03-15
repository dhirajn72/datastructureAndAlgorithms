package practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Dhiraj
 * @date 25/01/19
 */
public class Bfs {
    private int v;
    private LinkedList<Integer> adj[];

    public Bfs(int v){
        this.v=v;
        adj= new LinkedList[v];
        for (int i=0;i<v;i++)
            adj[i]= new LinkedList<>();
    }

    public void addEdge(int v,int w){
        this.adj[v].add(w);
    }

    public void bfs(int s){
        boolean visited[]= new boolean[v];
        LinkedList<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);

        while (!queue.isEmpty()){
            s=queue.poll();
            System.out.print(s+" ");
            ListIterator<Integer> iterator= adj[s].listIterator();
            while (iterator.hasNext()){
                int n=iterator.next();
                while (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Bfs g= new Bfs(6);
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
        g.bfs(1);

    }
}
