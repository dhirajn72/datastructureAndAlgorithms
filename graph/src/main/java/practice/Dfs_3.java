package practice;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Dhiraj
 * @date 27/01/19
 */
public class Dfs_3 {
    private int v;
    private LinkedList<Integer> adj[];

    public Dfs_3(int v) {
        this.v = v;
        this.adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Bfs_3 g = new Bfs_3(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.bfs(2);
    }

    public void addEdge(int v, int w) {
        this.adj[v].add(w);
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[v];
        dfsUtil(s, visited);
    }

    private void dfsUtil(int s, boolean[] visited) {
        visited[s] = true;
        Iterator<Integer> iterator = adj[s].listIterator();
        System.out.print(s + " ");
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }
}
