// merge two sorted array in a single big array
import java.util.*;
public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n2];
        int[] ans = new int[n+n2];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n2;i++){
            arr1[i]=sc.nextInt();
        }
        int i =0;
        int j=0;
        int k=0;
        while(i<n && j<n2){
            if(arr[i]<arr1[j]){
                ans[k]=arr[i];
                i++;
                k++;
            }
            else{
                ans[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<n){
            ans[k++]=arr[i++];
        }
        while(j<n2){
            ans[k++]=arr1[j++];
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
}
