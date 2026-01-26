// package Binary;
// import java.util.*;
// public class SquareRoot {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int root=0;
//         for(int i =1;i<=n;i++){
//             if(i*i>n) break;
//             root =i;
//         }
//         System.out.println(root);
//     }
// }



// 2nd method
package Binary;
import java.util.*;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0;
        int l =1;
        int h =n;
        while(l<=h){
            int mid = (l+h)/2;
            if(mid*mid==n){ 
            ans=mid;
            break;
            }
            else if(mid*mid>n) h =mid-1;
            else l=mid+1;
        }
        System.out.println(ans);
    }
}
