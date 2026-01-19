import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40}; //16 byte
        int[] x = arr;  //x is a shallow copy of arr
        x[0] = 100;
        System.out.println(arr[0]);
        int[] deep = Arrays.copyOf(arr, arr.length); //deep copy
        deep[0] = 100;
        System.out.println(arr[0]);
    }
}
