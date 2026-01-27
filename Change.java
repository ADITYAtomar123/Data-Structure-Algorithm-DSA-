package String;
// if string first character is lower then it convert to lower else upper
import java.util.*;
public class Change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(Character.isLowerCase(s.charAt(0))){
            System.out.println(s.toLowerCase());
        }
        else{
            System.out.println(s.toUpperCase());
        }
    }
}
