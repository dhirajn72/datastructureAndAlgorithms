package lafore;

/**
 * @author Dhiraj
 * @date 08/06/19
 */
public class DistPar {
    public int distance;
    public int parentVert;

    public DistPar(int parentVert,int distance) {
        this.distance = distance;
        this.parentVert = parentVert;
    }
}
