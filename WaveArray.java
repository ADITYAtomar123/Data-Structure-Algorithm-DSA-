import java.util.*;
public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i =0;i<n;i+=2){
            if(i==n-1){
                break;
            }
            int t = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=t;
        }
         for(int ele:arr){
            System.out.println(ele);
         }
    }
}
