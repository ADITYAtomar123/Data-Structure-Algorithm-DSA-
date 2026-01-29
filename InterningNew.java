package String;
// public class InterningNew {
//     public static void main(String[] args) {
//         String s = "raghav";
//         s +="sir"; // ye ak nye string bn jayegi dono jod kr
//         System.out.println(s);               
//     }
// }




public class InterningNew {
    public static void main(String[] args) {
        String s = "raghav";
        String s1 = new String("raghav");
        System.out.println(s==s1);     
        String a = "raghav";
        String b ="raghav";
        System.out.println(a==b);
                  
    }
}
