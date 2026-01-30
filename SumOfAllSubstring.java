package String;
import java.util.*;
public class SumOfAllSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans=0;
        for(int i =0;i<s.length();i++){
            for(int j = i+1;j<=s.length();j++){
                String sub = s.substring(i, j);
                ans +=Integer.parseInt(sub);
            }
        }
        System.out.println(ans);
    }
}
