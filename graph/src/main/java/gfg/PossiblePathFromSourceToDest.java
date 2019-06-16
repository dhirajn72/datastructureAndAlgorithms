package gfg;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 09/06/19
 */
public class PossiblePathFromSourceToDest {
    private int v;
    private ArrayList<Integer>[] adjList;

    public PossiblePathFromSourceToDest(int vertices) {
        this.v = vertices;
        initAdjList();
    }

    // Driver program
    public static void main(String[] args) {
        // Create a sample graph
        PossiblePathFromSourceToDest g = new PossiblePathFromSourceToDest(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 0);
        g.addEdge(2, 1);
        g.addEdge(1, 3);
        int s = 2;
        int d = 3;

        System.out.println("Following are all different paths from " + s + " to " + d);
        g.printAllPaths(s, d);

    }

    @SuppressWarnings("unchecked")
    private void initAdjList() {
        adjList = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new ArrayList<>();
        }
    }
    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    // Prints all paths from
    // 's' to 'd'
    public void printAllPaths(int s, int d) {
        boolean[] isVisited = new boolean[v];
        ArrayList<Integer> pathList = new ArrayList<>();
        pathList.add(s);
        printAllPathsUtil(s, d, isVisited, pathList);
    }
    private void printAllPathsUtil(Integer source, Integer dest, boolean[] isVisited, List<Integer> localPathList) {
        isVisited[source] = true;
        if (source.equals(dest)) {
            System.out.println(localPathList);
            isVisited[source] = false;
            return;
        }
        List<Integer> list=adjList[source];

        for (Integer i :list ) {
            if (!isVisited[i]) {
                localPathList.add(i);
                printAllPathsUtil(i, dest, isVisited, localPathList);
                localPathList.remove(i);
            }
        }
        isVisited[source] = false;
    }

}
