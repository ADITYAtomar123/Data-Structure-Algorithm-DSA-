package Recursion;
import java.util.*;
public class StringsBasicMore {
    public static void main(String[] args) {
        String s = "aditya";
        change(s);
        System.out.println(s);
        ArrayList<String> al = new ArrayList<>();
        al.add("aditya");
        al.add("aryan");
        al.add("nikhil");
        al.add("priyanshu");System.out.println(al);
        change2(al);
        System.out.println(al);
    }
    public static void change2(ArrayList<String> al){
        al.add("biplob");
    }
    public static void change(String s){
        s = "mohan";
    }
}
