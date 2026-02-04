package MultiDimensionalArray;
import java.util.*;
public class PrintElementColmWise {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int i =0;i<3;i++){
            for(int j =0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // square matrix ke liye
        // for(int i =0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         System.out.print(arr[j][i]);
        //     }
        //     System.out.println();
        // }
        for(int j =0;j<3;j++){
            for(int i=0;i<3;i++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
