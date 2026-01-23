// common element in two arrays
// import java.util.*;
// public class Common {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i =0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         int n1 = sc.nextInt();
//         int[] arr1 = new int[n1];
//         for(int i =0;i<n1;i++){
//             arr1[i]=sc.nextInt();
//         }

//         Arrays.sort(arr);
//         Arrays.sort(arr1);
//         ArrayList <Integer> ans = new ArrayList<>();
//         int i =0;
//         int j =0;
//         while(i<n && j<n1){
//             if(arr[i]==arr1[j]){
//                 ans.add(arr[i]);
//                 i++;
//                 j++;
//             }
//             else if(arr[i]<arr1[j]){
//                 i++;
//             }
//             else j++;
//         }
//         for(int ele :ans){
//             System.out.println(ele);
//         }

//     }
// }
