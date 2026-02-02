package String;
import java.util.Scanner;
public class ReverseSb {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        int i =0;
        int j = sb.length()-1;
        while(i<=j){
            char temp = sb.charAt(i);
            char temp1 = sb.charAt(j);
            sb.setCharAt(i, temp1);
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
        System.out.println(sb);
    }
}
