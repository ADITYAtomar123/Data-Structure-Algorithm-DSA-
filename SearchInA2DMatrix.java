// package MultiDimensionalArray;
// import java.util.*;
// public class SearchInA2DMatrix {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int n1 = sc.nextInt();
//         int t =sc.nextInt();
//         int[][] arr = new int[n][n1];
//         for(int i=0;i<n;i++){
//             for(int j =0;j<n1;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int a =0;
//         for(int i =0;i<n;i++){
//             for(int j =0;j<n1;j++){
//                 if(arr[i][j]==t){
//                     a=1;
//                 }
//             }
//         }
//         if(a==1){
//             System.out.println("true");
//         }
//         else System.out.println("false");
//     }
// }






package MultiDimensionalArray;
import java.util.*;
public class SearchInA2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int t =sc.nextInt();
        int[][] arr = new int[n][n1];
        for(int i=0;i<n;i++){
            for(int j =0;j<n1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int a =0;
        int i =0;
        int j = n1-1;
        while(i<n && j>=0){
            if(arr[i][j] > t) {
                j--;
            }
            else if(arr[i][j]<t) i++;
            else a =1;
        }
        if(a==1) System.out.println("true");
        else System.out.println("false");
        
    }
}