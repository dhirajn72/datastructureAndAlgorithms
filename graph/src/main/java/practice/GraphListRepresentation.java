package practice;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Dhiraj
 * @date 05/06/19
 */
public class GraphListRepresentation {
    private int V;
    private LinkedList<Integer> adjListArray[];

    GraphListRepresentation(int V) {
        this.V = V;
        adjListArray = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }
    void addEdge(int src, int dest) {
        if (src > V || dest > V )throw new IllegalArgumentException("Invalid vertex size");
        adjListArray[src].add(dest);
        adjListArray[dest].add(src);
    }

    void removeEdge(int src,int dest){
        if (src > V || dest > V )throw new IllegalArgumentException("Invalid vertex size");
        adjListArray[src].remove(new Integer(dest));
        adjListArray[dest].remove(new Integer(src));
    }

    static void printGraph(GraphListRepresentation graph) {
        for (int v = 0; v < graph.V; v++) {
            System.out.println("Adjacency list of vertex " + v);
            List<Integer> integers=graph.adjListArray[v];
            for (Integer pCrawl : integers) {
                System.out.print( " "+ pCrawl);
            }
            System.out.println("\n");
        }
    }

    public static void main(String args[]) {
        int V = 5;
        GraphListRepresentation graph = new GraphListRepresentation(V);
        graph.addEdge( 0, 1);
        graph.addEdge( 0, 4);
        graph.addEdge( 1, 2);
        graph.addEdge( 1, 3);
        graph.addEdge( 1, 4);
        graph.addEdge( 2, 3);
        graph.addEdge( 3, 4);
        printGraph(graph);
        graph.removeEdge(1,4);
        System.out.println("Removed 1,4");
        printGraph(graph);
    }


}
