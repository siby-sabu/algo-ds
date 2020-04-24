package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumbers {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[n+1];
        for(int i=1;i<=n;i++){
            arr[i] = true;
        }

        for(int i=2;i*i <= n;i++){
            if(arr[i]) {
                for(int j=i*i;j<=n;j+=i) {
                    arr[j] = false;
                }
            }
        }

        for(int j=2;j<=n;j++){
            if(arr[j]){
                System.out.println(j);
            }
        }

        

    }
}