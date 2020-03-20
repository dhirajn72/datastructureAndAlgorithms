package gfg;

/**
 * @author Dhiraj
 * @date 08/06/19
 */

// A Java program for Dijkstra's single source shortest path algorithm.
// The program is for adjacency matrix representation of the graph
public class DijkstraAlgorithm {


    public static void main(String[] args) {
        Graph graph= new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addEdges(0,1,50);
        graph.addEdges(0,3,80);
        graph.addEdges(1,2,60);
        graph.addEdges(1,3,90);
        graph.addEdges(2,4,40);
        graph.addEdges(3,2,20);
        graph.addEdges(3,4,70);
        graph.addEdges(4,1,50);

        //System.out.println(Arrays.deepEquals(adjMatrix,graph.getAdjMatrix()));

        graph.callDijkstra(0);


    }


}