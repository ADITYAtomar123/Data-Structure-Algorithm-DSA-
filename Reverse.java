// reverse an array
// import java.util.*;
// public class Reverse {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         for(int i = n-1;i>=0;i--){
//             System.out.print(arr[i] +" ");
//         }
//     }
// }


import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i= 0;
        int j = n-1;
        while(i<j){
            int t = arr[i];
            arr[i] =arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele + " ");
        }

    }
}
