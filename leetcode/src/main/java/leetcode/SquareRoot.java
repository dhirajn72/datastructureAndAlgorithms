package leetcode;


/**
 * @author Dhiraj
 * @date 08/08/19
 */
public class SquareRoot {
    public static int squareRoot(int number){
        int sum=0,count=0;
        boolean flag=false;
        for (int i=1;i<number;i+=2){
            count++;
            sum+=i;
            if (sum==number){
                flag=true;
                break;
            }
        }
        if (flag)return count;
        return -1;
    }
}
