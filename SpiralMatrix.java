package MultiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> ans= new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int fr = 0,lr=m-1,fc=0,lc=n-1;
        while(fr<=lr && fc<=lc){
            for(int j =fc;j<=lc;j++)
                ans.add(arr[fr][j]);
            fr++;
            if(fc>lc || fr>lr) break;
            for(int i =fr;i<lr;i++)
                ans.add(arr[i][lc]);
            lc--;
            if(fc>lc || fr>lr) break;
            for(int j =lc;j>=fc;j--)
                ans.add(arr[lr][j]);
            lr--;
            if(fc>lc || fr>lr) break;
            for(int i=lr;i>=fr;i--)
                ans.add(arr[i][fc]);
            fc++;


        }
        return ans;
    }
}
    }
}
