package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] sArr = s.toCharArray();
        int i,j;
        for(i = 0, j = sArr.length-1;i<sArr.length/2;i++,j--){
           if(sArr[i] != sArr[j]){
               System.out.println("NO");
               return;
           }
        }
        System.out.println("YES");
    }
}