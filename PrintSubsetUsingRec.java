package Recursion;
import java.util.*;
public class PrintSubsetUsingRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        subset("",s,0);
    }
    public static void subset(String ans,String s,int i){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(i);
        subset(ans+ch,s,i+1);
        subset(ans,s,i+1);
    } 
}
