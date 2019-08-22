package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Dhiraj
 * @date 19/08/19
 */
public class DijkstraAlgo {

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addVertex('A'); //0
        graph.addVertex('B'); //1
        graph.addVertex('C'); //2
        graph.addVertex('D'); //3
        graph.addVertex('E'); //4
        graph.addEdges(0, 1);
        graph.addEdges(0, 3);
        graph.addEdges(0, 4);
        graph.addEdges(1, 2);
        graph.addEdges(2, 3);
        graph.addEdges(3, 4);

        /*graph.addEdges(0, 1,4);
        graph.addEdges(0, 3,4);
        graph.addEdges(0, 4,3);
        graph.addEdges(1, 2,2);
        graph.addEdges(2, 3,6);
        graph.addEdges(3, 4,7);*/
        System.out.println("******");
        graph.dfs(3);
        graph.bfs(3);
        graph.dijkstra(graph.matrix, 0);

        /*
Sortest path from sourceA are::
A to A is::0
A to B is::1
A to C is::2
A to D is::1
A to E is::1


         */
    }


    static class Graph {
        private Vertex[] vertices;
        private int vertxCount;
        private int[][] matrix;
        private Stack<Integer> s;
        private Queue<Integer> q;

        public Graph(int maxCount) {
            matrix = new int[maxCount][maxCount];
            vertices = new Vertex[maxCount];
            s = new Stack<>();
            q = new LinkedList<>();
        }

        public void addVertex(char v) {
            this.vertices[vertxCount++] = new Vertex(v);
        }

        public void addEdges(int src, int dest) {
            matrix[src][dest] = 1;
            matrix[dest][src] = 1;
        }

        public void display(int v) {
            System.out.print(vertices[v].lable+", ");
        }

        public void dijkstra(int[][] matrix, int src) {
            int[] dist = new int[vertxCount];
            boolean[] sptSet = new boolean[vertxCount];
            for (int i = 0; i < dist.length; i++)
                dist[i] = Integer.MAX_VALUE;

            dist[src] = 0;
            for (int i = 0; i < vertxCount - 1; i++) {
                int u = getMinimumDistance(dist, sptSet);
                sptSet[u] = true;
                for (int j = 0; j < vertxCount; j++) {
                    if (sptSet[j] == false && dist[u] != Integer.MAX_VALUE && matrix[u][j] != 0 && dist[u] + matrix[u][j] < dist[j])
                        dist[j] = dist[u] + matrix[u][j];
                }
            }
            printSolution(dist, src);
        }

        private void printSolution(int[] dist, int src) {
            System.out.println("Shortest paths from source::" + vertices[src].lable + " are:::");
            for (int i = 0; i < vertxCount; i++) {
                System.out.println(vertices[src].lable + " to " + vertices[i].lable + " is ::" + dist[i]);
            }
        }

        private int getMinimumDistance(int[] dist, boolean[] sptSet) {
            int min = Integer.MAX_VALUE, minIndex = -1;
            for (int i = 0; i < vertxCount; i++) {
                if (sptSet[i] == false && dist[i] <= min) {
                    min = dist[i];
                    minIndex = i;
                }
            }
            return minIndex;
        }

        public void dfs(int src) {
            vertices[src].visited = true;
            display(src);
            s.push(src);
            while (!s.isEmpty()) {
                int v = getUnVisitedNode(s.peek());
                if (v == -1) {
                    s.pop();
                } else {
                    vertices[v].visited = true;
                    display(v);
                    s.push(v);
                }
            }
            resetFlag();
            System.out.println();
        }

        private int getUnVisitedNode(Integer v) {
            for (int i = 0; i < vertxCount; i++) {
                if (matrix[v][i] == 1 && vertices[i].visited == false)
                    return i;
            }
            return -1;
        }

        public void bfs(int s) {
            vertices[s].visited=true;
            display(s);
            q.offer(s);
            int v1;
            while (!q.isEmpty()){
                int v=q.remove();
                while ((v1=getUnVisitedNode(v))!=-1){
                    vertices[v1].visited=true;
                    display(v1);
                    q.offer(v1);
                }
            }
            resetFlag();
            System.out.println();
        }

        private void resetFlag() {
            for (int i = 0; i < vertxCount; i++) {
                vertices[i].visited = false;
            }
        }
    }

    static class Vertex {
        char lable;
        boolean visited;

        public Vertex(char lable) {
            this.lable = lable;
        }
    }
}
