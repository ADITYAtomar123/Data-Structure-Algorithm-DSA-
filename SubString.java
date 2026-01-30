package String;
// public class SubString {
//     public static void main(String[] args) {
//         String s = "Jaishankar";
//         System.out.println(s.substring(0,3));
//     }
// }



// print alll substring 
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i =0;i<s.length();i++){
            for(int j =i+1;j<s.length();j++){
                System.out.print(s.substring(i, j+1)+" ");
            }
            System.out.println();
        }
    }
}