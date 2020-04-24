package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayInsert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String inputArrString = br.readLine();
        String[] strArr = inputArrString.split(" ");
        int[] intArr = new int[strArr.length];
        String temp[] = input.split(" ");
        int queryCount = Integer.parseInt(temp[1]);
        String[] queryString = new String[queryCount];

        for(int i=0;i<queryCount;i++){
            queryString[i] = br.readLine();
        }

        for(int i=0;i< strArr.length;i++) {
            intArr[i] = Integer.valueOf(strArr[i]);
        }

        for(int i=0;i< queryCount;i++) {
            String[] queryStrArr = queryString[i].split(" ");
            int[] queryArr = new int[queryStrArr.length];
            for(int j =0;j< queryStrArr.length;j++){
                queryArr[j] = Integer.parseInt(queryStrArr[j]);
            }
            if(queryArr[0] == 1){
                intArr[queryArr[1]] = queryArr[2];
            }
            else if (queryArr[0] == 2) {
                if(queryArr[1] >= 0 && queryArr[2] < intArr.length){
                   
                    int sum = 0;
                    for(int j=queryArr[1];j <= queryArr[2]; j++){
                        sum+=intArr[j];
                    }
                    System.out.println(sum);
                }
                else {
                    System.out.println(-1); 
                }
            }
        }




    }
}