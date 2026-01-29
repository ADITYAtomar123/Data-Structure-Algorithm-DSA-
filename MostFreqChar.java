package String;
// import java.util.Scanner;

// public class MostFreqChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int maxfreq = -1;
//         char ans = s.charAt(0);
//         for(int i =0;i<s.length()-1;i++){
//             int freq = 1;
//             char ch = s.charAt(i);
//             for(int j =i+1;j<s.length();j++){
//                 if(s.charAt(i)==s.charAt(j)) freq++;
//             }
//             if(freq>maxfreq){
//                 maxfreq = freq;
//                 ans = ch;
//             }
//             else if(freq==maxfreq && ch<ans){
//                 ans = ch;
//             }
//         }
//         System.out.println(ans);
//     }    
// }




// sliding window technique

// import java.util.Arrays;
// import java.util.Scanner;

// public class MostFreqChar {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         char[] arr = s.toCharArray();
//         Arrays.sort(arr);
//         int i =0;
//         int j =0;
//         int maxfreq=-1;
//         char ans = s.charAt(0);
//         while(j<s.length()){
//             if(arr[i]==arr[j]) j++;
//             else{
//                 int freq = j-i;
//                 if(freq>maxfreq){
//                     maxfreq = freq;
//                     ans = arr[i];
//                 }
//                 i=j;
//             }
//         }
//         int freq = j-i;
//         if(freq>maxfreq){
//             maxfreq = freq;
//             ans = arr[i];
//         }
//         System.out.println(ans);

//     }
// }





// frequency array

import java.util.Scanner;

public class MostFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n  = s.length();
        int[] freq = new int[26];
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            int idx = ch-'a';
            freq[idx]++;
        }
        int max=0;
        char ans = s.charAt(0);
        for(int i=0;i<26;i++){
            if(freq[i]>max){
                max = freq[i];
                ans = (char)(i+'a');
            }
        }
        System.out.println(ans);
    }
}