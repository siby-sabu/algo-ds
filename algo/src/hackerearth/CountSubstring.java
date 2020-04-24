package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstring {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        int n = Integer.parseInt(br.readLine());
        String[] in = new String[n];
        int[] res = new int[n];


        for(int i=0;i<n;i++){
           String s = br.readLine();

           for(int j=0;j<s.length();j++){
            for(int k=j+1;k<=s.length();k++){
              res[i] += countVovels(s.substring(j,k));
            }
        }
        }

      
        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
    }
    

    private static int countVovels(String s) {
       int count = 0;
       for(int i=0;i<s.length();i++){
         char c = s.charAt(i);
           if(c == 'a' | c == 'e' | c == 'i' | c == 'o' | c == 'u' | c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U' ){
               count++;
           }
       }
       return count;
    }
}