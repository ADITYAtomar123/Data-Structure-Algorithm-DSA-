// moultipy odd indexed elements by 2 and add 10 to even indexd elemnet
import java.util.*;
public class MultiplyOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.print(arr[i]*2 + " ");
            }
            else{
                System.out.print(arr[i]+10 + " ");
            }
        }
    }
}
