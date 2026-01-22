// import java.util.*;
// public class MovingAllZeros {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i =0;i<n-1;i++){
//             for(int j =0;j<n-1-i;j++){
//                 if(arr[j]==0){
//                     int t = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1]=t;
//                 }
//             }
//         }
//         for(int i =0;i<n;i++){
//             System.out.println(arr[i]);
//         }
//     }
// }


import java.util.*;
public class MovingAllZeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j =0;
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                if(i!=j){
                    int t = arr[i];
                    arr[i]= arr[j];
                    arr[j] = t;
                }
                j++;
            }
        }
        for(int ele:arr){
            System.out.print(ele);
        }
        
    }
}