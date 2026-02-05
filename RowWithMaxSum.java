package MultiDimensionalArray;
// 36
import java.util.Scanner;

public class RowWithMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = sc.nextInt();
        int[][] arr = new int[n][n1];
        for(int i =0;i<n;i++){
            for(int j =0;j<n1;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int maxsum = Integer.MIN_VALUE;
        int row =-1;
        for(int i =0;i<n;i++){
            int sum =0;
            for(int j = 0;j<n1;j++){
                sum +=arr[i][j];
            }
            if(sum>maxsum){
                maxsum =sum;
                row=i;
            }
        }
        System.out.println(row+" "+maxsum);
    }
}
