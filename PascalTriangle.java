package MultiDimensionalArray;
import java.util.*;
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<n;i++){
            ans.add(new ArrayList<Integer>());
            for(int j =0;j<=i;j++){
                if(j==0 ||i==j) ans.get(i).add(1);
                else{
                    int val =ans.get(i-1).get(j)+ans.get(i-1).get(j-1);
                    ans.get(i).add(val);
                }
            }
            
        }
        System.out.println(ans);
    }
}
