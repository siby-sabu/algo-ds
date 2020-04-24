package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BallonCost {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        
        int[] results = new int[n];
        for (int i = 0;i<n;i++){
        String[] s = br.readLine().split(" ");

        int greenPrice = Integer.parseInt(s[0]);
        int purplePrice = Integer.parseInt(s[1]);

        int p = Integer.parseInt(br.readLine());
        int corFirstAnsCount = 0;
        int corSecAnsCount = 0;

        for(int j = 0;j<p;j++) {
            s = br.readLine().split(" ");
            corFirstAnsCount += Integer.parseInt(s[0]);
            corSecAnsCount += Integer.parseInt(s[1]);
        }
       results[i] = (greenPrice <= purplePrice ? greenPrice :purplePrice)* (corFirstAnsCount>=corSecAnsCount ? corFirstAnsCount: corSecAnsCount) +
                    (greenPrice >= purplePrice ? greenPrice :purplePrice)* (corFirstAnsCount<corSecAnsCount ? corFirstAnsCount: corSecAnsCount);


        }
        for(int i = 0;i<n;i++){
            System.out.println(results[i]);
        }

    }
}