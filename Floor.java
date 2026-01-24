package Binary;
import java.util.*;
public class Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l =0;
        int h = n-1;
        int idx =-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>x){
                h = mid-1;
            }
            else{
                idx = mid;
                l=mid+1;
            }
        }
        System.out.println(idx);
    }
}
