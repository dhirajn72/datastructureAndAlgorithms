package session2;

/**
 * @author Dhiraj
 * @date 24/09/19
 */
public class TribonacciSeries {

    public static void main(String[] args) {
        System.out.println(tribonacci(50));

    }
    public static int tribonacci(int n) {

        if (n<1)return 0;
        if (n==1)return 0;
        if (n==2||n==3)return 1;
        int first=0,second=1,third=1;
        int result=0,i=3;
        System.out.print(first+","+second+","+third+",");
        while (i++<n){
            result=first+second+third;
            System.out.print(result+",");
            first=second;
            second=third;
            third=result;
        }
        return result;
    }
}
