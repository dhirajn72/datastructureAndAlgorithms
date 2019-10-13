package session2;

import java.util.Arrays;

/**
 * @author Dhiraj
 * @date 07/09/19
 */
public class NetworkDelay {
    public int networkDelayTime(int[][] times, int N, int K) {

        int[] dist=new int[N];
        boolean[] sptSet=new boolean[N];
        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[K]=0;
        for (int i = 0; i < N-1; i++) {
            int u=getMinimumDistanceNode(dist,sptSet);
            sptSet[u]=true;
            for (int j = 0; j < N; j++) {
                if (!sptSet[j] && times[u][j]>0 && dist[j]!=Integer.MAX_VALUE && dist[u]+times[u][j]<dist[j]){
                    dist[j]=dist[u]+times[u][j];
                }
            }

        }

        //printSolution(dist,K);


        return 0;
    }

    private int getMinimumDistanceNode(int[] dist, boolean[] sptSet) {
        int min=Integer.MAX_VALUE,minIndex=-1;
        for (int i = 0; i < dist.length; i++) {
            if (!sptSet[i] && dist[i]<=min){
                min=dist[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}
