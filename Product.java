// product of array
import java.util.*;
public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int prod = 1;
        for(int i =0;i<n;i++){
            prod *=arr[i];
        }
        System.out.println(prod);
    }
}
