// find the min element out of all the max element of each row
package MultiDimensionalArray;
import java.util.*;
public class MinElementOutOfAlltheMaxEle {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int n1 = sc.nextInt();
            int[][] arr = new int[n][n1];
            for(int i =0;i<n;i++){
                for(int j=0;j<n1;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            int min = Integer.MAX_VALUE;
            for(int i =0;i<n;i++){
                int max = Integer.MIN_VALUE;
                for(int j =0;j<n1;j++){
                    if(arr[i][j]>max){
                        max = arr[i][j];
                    }
                }
                if(max<min){
                    min = max;
                }
            }
            System.out.println(min);
        
    }
}