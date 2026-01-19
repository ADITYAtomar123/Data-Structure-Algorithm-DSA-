// adding one
import java.util.*;
public class AddingOne {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i =0;i<n;i++){
                arr.add(sc.nextInt());
            }
            ArrayList<Integer> ans = new ArrayList<>();
            int c = 1;
            for(int i =n-1;i>=0;i--){
                if(arr.get(i)+c<=9){
                    ans.add(arr.get(i)+c);
                    c =0;
                }
                else{
                    ans.add(0);
                    c = 1;
                }
            }
            if(c==1){
                ans.add(1);
            }
            Collections.reverse(ans);
            System.out.println(ans);
        
    }
}
