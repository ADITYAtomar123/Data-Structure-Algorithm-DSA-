package Recursion;

public class Towerofhanoi {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        hanoi(6,'A','B','C');
    }
    public static void hanoi(int n,char a,char b,char c){
       if(n==0) return;
        // n-1 disks from A to B via C
        hanoi(n-1,a,c,b);
        // largest from a to c
        System.out.println(a+"->"+c);
        // n-1 disks from b to cvia a
        hanoi(n-1,b,a,c);

    }
}
