// reverse part of array
import java.util.*;
public class ReversePart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=2;
        int j =n-3;
        while(i<j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+ " ");
        }
    }
}
