package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zoos {
    public static void main(String[] args) throws IOException {
       
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String inp = br.readLine();
            int zCount =0;
            int oCount = 0;

            char[] inpArr = inp.toCharArray();
            for(char c : inpArr) {
                if(c == 'z') {
                    zCount++;
                }
                else {
                    oCount++;
                }
            }
            if(2*zCount == oCount){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
            
        }
}