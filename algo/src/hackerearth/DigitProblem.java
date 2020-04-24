package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitProblem {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] temp = input.split(" ");
        String str = temp[0];
        int count = Integer.valueOf(temp[1]);

        if(count ==0){
            System.out.println(str); 
            return; 
        }
        char[] strArr = str.toCharArray();
        for(int i=0,j=0;i<strArr.length && j<count;i++){
            if(strArr[i] != '9'){
                strArr[i] = '9';
                j++;
            }
        }
        for(int i=0;i<strArr.length;i++) {
            System.out.print(strArr[i]);
        }

    }
}