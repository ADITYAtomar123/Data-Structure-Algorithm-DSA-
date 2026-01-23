// khth smallest no
import java.util.*;
public class Kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i =0;i<k;i++){
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for(int j =i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            int t= arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=t;
        }
        System.out.println(arr[k-1]);

    }
}
