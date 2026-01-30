package String;
import java.util.*;
public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aditya");
        System.out.println(sb.length() +" "+sb.capacity());
        System.out.println(sb);
        sb.append("tomar");
        System.out.println(sb);
        sb.setCharAt(4,'i');
        System.out.println(sb);
    }
}
