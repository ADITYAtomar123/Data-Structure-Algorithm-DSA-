// // seperate 0's and 1's
// import java.util.*;
// public class SeperateZerosAndOne {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int z =0;
//         int o =0;
//         for(int i =0;i<n;i++){
//             if(arr[i]==0){
//                 z++;
//             }
//             else{
//                 o++;
//             }
//         }
//         for(int i =0;i<z;i++){
//             arr[i]=0;
//         }
//         for(int i =z;i<n;i++){
//             arr[i]=1;
//         }
//         for(int i =0;i<n;i++){
//             System.out.print(arr[i] + " ");
//         }

//     }
// }



import java.util.*;
public class SeperateZerosAndOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i =0;
        int j =n-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                int t = arr[i];
                arr[i]=arr[j];
                arr[j]=t;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.println(ele);
        }
    }
}