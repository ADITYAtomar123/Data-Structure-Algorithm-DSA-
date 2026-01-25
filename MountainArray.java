package Binary;
import java.util.*;
public class MountainArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int l = 1, h=n-2;
        int ans =0;
        while(l<=h){
        int mid = (l+h)/2;
        if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) {
            ans=mid;
            break;
        }
        else if (arr[mid]>arr[mid-1]&&arr[mid]<arr[mid+1]) l =mid+1;
        else h = mid-1;
        }
        System.out.println(ans);
    }
}
