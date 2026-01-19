import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(7);
        System.out.println(arr.get(2));
        arr.set(0,30); // arr[0]=30
        System.out.println(arr);
        System.out.println(arr.size());
        arr.add(10);
        arr.add(1,100);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }    
}
