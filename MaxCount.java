package Binary;
import java.util.*;
public class MaxCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count = 0;
        int count1 =0;
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                count++;
            }
            else{
                count1++;
            }
        }
        int ans =Math.max(count,count1);
        System.out.println(ans);
    }
}
