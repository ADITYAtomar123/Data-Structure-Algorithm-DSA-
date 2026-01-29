package String;
import java.util.*;
public class PassingStringToMethod {
    public static void change(String x){
        x = "aditya";
    }
    public static void main(String[] args) {
        String x = "raghav";
        System.out.println(x);
        change(x);
        System.out.println(x);
    }
}
