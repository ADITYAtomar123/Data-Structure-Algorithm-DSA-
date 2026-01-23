// two sum pair 
import java.util.*;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t= sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int i =0;
        int j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==t) System.out.println("true");
            else if(arr[i]+arr[j]>t){
                j--;
            }
            else i++;
        }
        System.out.println("false");
    }
}
