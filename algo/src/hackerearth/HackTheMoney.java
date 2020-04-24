package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HackTheMoney {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n];
        boolean[] res = new boolean[n];

        for(int i=0;i<n;i++) {
            input[i] =  Integer.parseInt(br.readLine());
            res[i] = isDesAmtPoss(input[i]);
        }
        for(int i=0;i<n;i++){
            if(res[i]) {
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }

    private static boolean isDesAmtPoss(int i) {
        if(i ==1){
            return true;
        }
        else if(i%20 ==0){
            return isDesAmtPoss(i/20);
        }
        else if(i%10 ==0){
            return isDesAmtPoss(i/10);
        }
        return false;
    }
}