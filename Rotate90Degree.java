package MultiDimensionalArray;
import java.util.*;
public class Rotate90Degree {
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
        for(int i=1;i<n;i++){
            for(int j =0;j<i;j++){
                int temp =arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // reverse
        // for(int i =0;i<n;i++){
        //     for(int j=n1-1;j>=0;j--){
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        for(int i=0;i<n;i++){
            int st =0;
            int end =n1-1;
            while(st<end){
                int t = arr[i][st];
                arr[i][st]=arr[i][end];
                arr[i][end]=t;
                st++;
                end--;
            }
        }
    }
}
