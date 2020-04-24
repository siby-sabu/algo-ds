package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        String n1 = input.split(" ")[0];
        String n2 = input.split(" ")[1];
        int  n1len = n1.length();
        int n2len = n2.length();
     
       

        int lim = n1len > n2len ? n1len :n2len;
        int[] res = new int[lim+1];

        while(true) {
            try {
                while(n1len>0 && n2len >0){
                    int t1 = Character.getNumericValue(n1.charAt(n1len-1));
                    int t2 = Character.getNumericValue(n2.charAt(n2len-1));
                    if(res[lim]+t1+t2 >=10){
                        res[lim] = res[lim] + t1+t2-10;
                        res[lim-1] = 1;
                    }
                    else{
                        res[lim] = res[lim] + t1+t2;
                    }
                    n1len--;
                    n2len--;
                    lim--;
                }
                while(n1len >0) {
                    int t1 = Integer.valueOf(n1.charAt(n1len-1));
                    if(res[lim]+t1 >=10){
                        res[lim] = res[lim] + t1-10;
                        res[lim-1] = 1;
                    }
                    else{
                        res[lim] = res[lim] + t1;
                    }
                    n1len--;
                    lim--;
                }
                while(n2len >0) {
                    int t2 = Integer.valueOf(n2.charAt(n2len-1));
                    if(res[lim]+t2 >=10){
                        res[lim] = res[lim] + t2-10;
                        res[lim-1] = 1;
                    }
                    else{
                        res[lim] = res[lim] + t2;
                    }
                    n2len--;
                    lim--;
                }
            }
            catch(Exception e){
                break;
            }
        }

        
       
        for(int i=0;i<res.length;i++){
            if(i == 0 && res[0] == 0){
                continue;
            }
            System.out.print(res[i]);
            
        }
    }
}