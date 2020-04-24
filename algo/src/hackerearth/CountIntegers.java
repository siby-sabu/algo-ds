package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountIntegers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int[] count = new int[10];

        for(int i = 0;i< input.length();i++){
            int key = Integer.valueOf(String.valueOf(input.charAt(i)));
            count[key] = count[key]+1;
        }

        for(int i = 0;i< count.length;i++){
            System.out.println(i +" " + count[i]);
        }



    }
  

}