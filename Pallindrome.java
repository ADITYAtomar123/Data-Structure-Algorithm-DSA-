package String;
// import java.util.*;
// public class Pallindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String rev = "";
//         for(int i =s.length()-1;i>=0;i--){
//             rev +=s.charAt(i);
//         }
//         if(s.equals(rev)){
//             System.out.println("yes");
//         }
//         else System.out.println("no");
//     }
// }




import java.util.*;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i =0;
        int j = s.length()-1;
        boolean flag = true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                flag = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }
        System.out.println(flag);
    }
}