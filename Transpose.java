package MultiDimensionalArray;
import java.util.*;
public class Transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] arr = new int[n][n1];
        for(int i =0;i<n;i++){
            for(int j =0;j<n1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n1;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
                break;
            }
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<n1;j++){
               System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
