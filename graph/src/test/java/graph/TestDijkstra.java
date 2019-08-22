package graph;

import com.java.graph.DFS_Dijkstra_Bellman_2;
import com.java.graph.Graph;
import com.java.graph.GraphMatrix;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Dhiraj
 * @date 04/08/19
 */
public class TestDijkstra {

    @Test
    public void testDijkstraCase1(){
        Graph graph= _getGraph();
        Assert.assertEquals(graph,graph);
    }

    private Graph _getGraph() {
        Graph graph=new Graph(4);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addEdges(0,1,4);
        graph.addEdges(0,3,5);
        graph.addEdges(2,1,-10);
        graph.addEdges(3,2,2);
        System.out.println("******");
        return graph;
    }
}
