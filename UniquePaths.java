package Recursion;
import java.util.*;
public class UniquePaths {
    public static int Paths(int m, int n){
        if(n==1 || m==1) return 1;
            return Paths(m-1,n)+Paths(m,n-1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    System.out.println(Paths(m,n));
}
}
