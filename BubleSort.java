// import java.util.*;
// public class BubleSort {
//     public static void main(String[] args) {
//         int[] arr = {5,-2,6,7,2,8,7,2};
//         int n = arr.length;
//         for(int j =0;j<=n;j++){
//             for(int i =0;i<n-1;i++){
//                 if(arr[i]>arr[i+1]){
//                     int t = arr[i];
//                     arr[i]= arr[i+1];
//                     arr[i+1] = t;
//                 }
//             }
//         }
//         for(int ele:arr){
//             System.out.println(ele);
//         }
//     }
// }




// bubble sort optimised
import java.util.*;
public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {5,-2,6,7,2,8,7,2};
        int n = arr.length;
        boolean issorted = true;
        for(int i =0;i<=n;i++){
            int swap = 0;
            for(int j =0;j<n-1;j++){
                if(arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = t;
                    swap++;
                }
            }
            if(swap==0) break;
        }
    }
}