package practice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Dhiraj
 * @date 27/01/19
 */
public class Bfs_3 {
    private int v;
    private LinkedList<Integer> adj[];

    public Bfs_3(int v){
        this.v=v;
        this.adj=new LinkedList[v];
        for (int i=0;i<v;i++)
            this.adj[i]=new LinkedList<>();
    }
    public void addEdge(int v,int w){this.adj[v].add(w);}
    public  void bfs(int s) {
        boolean[] visited= new boolean[v];
        LinkedList<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);
        while (!queue.isEmpty()){
            s= queue.poll();
            System.out.print(s+" ");
            Iterator<Integer> iterator= this.adj[s].listIterator();
            while (iterator.hasNext()){
                int n=iterator.next();
                if (!visited[n]){
                    visited[n]=true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        Bfs_3 bfs= new Bfs_3(4);
        bfs.addEdge(0,1);
        bfs.addEdge(1,3);
        bfs.addEdge(3,2);
        bfs.addEdge(2,1);
        bfs.addEdge(2,0);

        System.out.println("Bfs traversals are from vertex: 2");
        bfs.bfs(2);

    }
}
