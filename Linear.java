import java.util.*;
public class Linear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {7,18,12,62,6};
        int x = 7;
        boolean flag = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==x){
                flag = true;
                break;

            }
        }
        if(flag==true){
            System.out.println("target exists");
        }
        else{
            System.out.println("not exists");
        }
    }
}
