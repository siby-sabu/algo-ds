package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MeetTheOther {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[] res = new int[n];
        


        for(int i=0;i<n;i++) {
            int size = Integer.valueOf(br.readLine());
            String[] inputStr = new String[size];
            for(int j=0;j<size;j++) {
                inputStr[j] = br.readLine();
            }
            int minLen = size;
            boolean matchFound = false;
            for(int j = 0; j<size;j++){
                for(int k=j+1;k<size;k++) {
                    if(inputStr[j].equals(inputStr[k]) && (k-j) < minLen){
                        minLen = k-j;
                        matchFound = true;
                    }
                }
            }
            if(matchFound){
                res[i] = minLen;
            } else {
                res[i] = -1;
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(res[i]);
        }
       
    }
}