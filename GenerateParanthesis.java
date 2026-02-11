package Recursion; //2:15

import java.util.ArrayList;
import java.util.*;
public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ans = new ArrayList<>();
        int n = sc.nextInt();
        generate(n,0,0,"",ans);
        System.out.println(ans);
    }
    public static void generate(int n ,int l,int r,String s , ArrayList<String> ans){
        if(r==n){
            ans.add(s);
            return;
        }
        if(l<n) generate(n,l+1,r,s+"(",ans);
        if(r<l) generate(n,l,r+1,s+")",ans);
    }
}

