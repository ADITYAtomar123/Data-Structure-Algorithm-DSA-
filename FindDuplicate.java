import java.util.*;
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=arr[i];
        }
        int t = (n-1)*(n)/2;
        int ans = sum-t;
        System.out.println(ans);
    }
}
