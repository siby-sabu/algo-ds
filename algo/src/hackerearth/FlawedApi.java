package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlawedApi {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String[] res = new String[n];
        String[] input = new String[n];

        for(int i=0;i<n;i++){
            input[i] = br.readLine();
        }
        int prev,curr,next;
        
       
            for(int i=0;i<n;i++){
                int start = Integer.valueOf(input[i].charAt(0));
                prev = 0;
                curr = 1;
                while(prev != start) {
                    next = prev + curr;
                    prev= curr;
                    curr = next;
                }
                int pos =1;
                while (pos < input[i].length()){
                    next = prev + curr;
                    prev= curr;
                    curr = next; 

                    String temp = String.valueOf(prev);
                    int j;
                    for(j =0;j<temp.length();j++){
                       if(pos <  input[i].length() && temp.charAt(j)== input[i].charAt(pos) ) {
                            j++;
                            pos++;
                       }
                       else {
                            res[i] = "Invaid"; 
                            break;
                       }
                    }
                }
                if(pos  == input[i].length()) {
                    res[i] = "Valid";
                }


            }

            for(int i=0;i<n;i++){
                System.out.println(res[i]);
            }


    }
}