// rotate an array
// import java.util.*;
// public class RotateArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int d = sc.nextInt();
//          d = d %n;
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int i = 0;
//         int j =d-1;
//         while(i<j){
//             int t = arr[i];
//             arr[i]= arr[j];
//             arr[j]=t;
//             i++;
//             j--;
//         }
//         int si = d;
//         int sj = n-1;
//         while(si<sj){
//             int t = arr[si];
//             arr[si]=arr[sj];
//             arr[sj]=t;
//             si++;
//             sj--;
//         }
//         int ti =0;
//         int tj= n-1;
//         while(ti<tj){
//             int t = arr[ti];
//             arr[ti]=arr[tj];
//             arr[tj]=t;
//             ti++;
//             tj--;
//         }
//         for(int ele:arr){
//             System.out.print(ele +" ");
//         }

//     }
// }



import java.util.*;
public class RotateArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int e:arr){
            System.out.print(e + " ");
        }

    }
    public static void reverse(int[] arr,int i, int j){
        while(i<j){
            int t= arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }

    }
}