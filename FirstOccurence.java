package Binary;
import java.util.*;
public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n  = arr.length;
        int t = 4;
        int l =0;
        int h =n-1;
        int idx =-1;
        while(l<=h){
            int mid =(l+h)/2;
            if(arr[mid]>t) h = mid-1;
            else if(arr[mid]<t) l =mid+1;
            else{
                idx = mid;
                h = mid-1;
            }
        }
        System.out.println(idx);
    }
}
