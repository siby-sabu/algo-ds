package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Confidential {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       

        int n = Integer.parseInt(br.readLine());
        String[] res = new String[n];
        for(int i = 0;i<n;i++){
            br.readLine();
            res[i] = encryptString(br.readLine());
        }

        for(int i =0 ;i<n;i++){
            System.out.println(res[i]);
        }
    }

    private static String encryptString(String st) {
        if(st.length() == 0){
            return "";
        }
        else{
            int m;
            if(st.length()%2 ==0){
                m = st.length()/2 -1;
            }
            else{
                m = st.length()/2;
            }

            return st.charAt(m) + encryptString(st.substring(0,m)) + encryptString(st.substring(m+1,st.length()));
        }
    }
}