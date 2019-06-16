package lafore;


/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class Graph {
    private final int maxVertexCount=20;
    private int nVerts;
    private int nTree;
    private int currentVert;
    private int startToCurrent;
    private final int INFINITY=10000;
    private DistPar sPath[];
    private Vertex[] vertexList;
    private int[][] adjMatrix;

    public Graph() {
        vertexList= new Vertex[maxVertexCount];
        adjMatrix= new int[maxVertexCount][maxVertexCount];

        for (int row=0;row<maxVertexCount;row++){
            for (int column=0;column<maxVertexCount;column++)
                adjMatrix[row][column]=INFINITY;
        }

        sPath= new DistPar[maxVertexCount];
    }

    public void addVertex(char label){
        vertexList[nVerts++]= new Vertex(label);
    }

    public void addEdge(int source,int dest,int weight){
        adjMatrix[source][dest]=weight;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].label);
    }

    public void path() {
        int startTree=0;
        vertexList[startTree].isInTree=true;
        nTree=1;

        for (int j=0;j<nVerts;j++){
            int tempDist=adjMatrix[startTree][j];
            sPath[j]=new DistPar(startTree,tempDist);
        }

        while (nTree<nVerts){
            int indexMin=getMin();
            int minDist=sPath[indexMin].distance;

            if (minDist==INFINITY){
                System.out.println("There are unreachable vertices");
                break;
            }
            else {
                currentVert=indexMin;
                startToCurrent=sPath[indexMin].distance;
            }
            vertexList[currentVert].isInTree=true;
            nTree++;
            adjust_sPath();
        }

        displayPaths();
        nTree=0;
        for (int i=0;i<nVerts;i++)
            vertexList[i].isInTree=false;
    }

    private void displayPaths() {
        for (int j=0;j<nVerts;j++){
            System.out.print(vertexList[j].label+" = ");
            if (sPath[j].distance==INFINITY)
                System.out.print("inf");
            else System.out.print(sPath[j].distance);

            char parent=vertexList[sPath[j].parentVert].label;
            System.out.print("("+parent+")");
        }
        System.out.println();
    }

    private void adjust_sPath() {
        int column=1;
        while (column<nVerts){
            if (vertexList[column].isInTree){
                column++;
                continue;
            }
            int currentToFringe=adjMatrix[currentVert][column];
            int startToFringe=startToCurrent+currentToFringe;
            int sPathDist=sPath[column].distance;

            if (startToFringe<sPathDist){
                sPath[column].parentVert=currentVert;
                sPath[column].distance=startToFringe;
            }
            column++;
        }
    }

    private int getMin() {
        int minDist=INFINITY;
        int indexMin=0;
        for (int j=1;j<nVerts;j++){
            if (vertexList[j].isInTree==false && sPath[j].distance<minDist){
                minDist=sPath[j].distance;
                indexMin=j;
            }
        }
        return indexMin;
    }
}
