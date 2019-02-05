package practice;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author Dhiraj
 * @date 24/01/19
 */
public class BFS_1 {
    private int v;
    private LinkedList<Integer> adj[];
    public BFS_1(int v){
        this.v=v;
        this.adj=new LinkedList[v];
        for (int i=0;i<v;i++){
            adj[i]=new LinkedList<>();
        }
    }
    public void addEdge(int v,int w){
        adj[v].add(w);
    }

    public void bfs(int s){

        boolean visited[]= new boolean[v];

        LinkedList<Integer> queue= new LinkedList<>();
        visited[s]=true;
        queue.add(s);

        while (!queue.isEmpty()){
            s=queue.poll();
            System.out.print (s+" ");
            ListIterator<Integer> iterator= adj[s].listIterator();
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

        BFS_1 g = new BFS_1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.bfs(2);
    }

}
