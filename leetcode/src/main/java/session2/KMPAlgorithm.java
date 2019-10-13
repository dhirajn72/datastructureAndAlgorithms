package session2;

/**
 * @author Dhiraj
 * @date 19/09/19
 */
public class KMPAlgorithm {
    public static void main(String[] args) {
        char[] text={'h','e','l','l','o'};
        int[] pattern={'l','o'};
        System.out.println(kmp(text,text.length,pattern,pattern.length));


    }
    static int[] arr;
    public static int kmp(char[] text,int n,int[] pattern,int m){
        int i=0,j=0;
        prefixTable(pattern,m);
        while (i<n){
            if (text[i]==pattern[j]){
                if (j==m-1)
                    return i-j;
                else {
                    i++;
                    j++;
                }
            }
            else if (j>0)
                j=arr[j-1];
            else i++;
        }
        return -1;
    }


    public static void prefixTable(int[] pattern, int m){
        arr=new int[pattern.length];
        int i=1,j=0;
        arr[0]=0;
        while (i<m){
            if (pattern[i]==pattern[j]){
                arr[i]=j+1;
                i++;
                j++;
            }
            else if (j>0)
                j=arr[j-1];
            else {
                arr[i]=0;
                i++;
            }
        }
    }
}
