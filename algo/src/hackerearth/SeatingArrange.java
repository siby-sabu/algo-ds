package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatingArrange {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); 
    
        int[] currentSeat = new int[n];
        int[] oppSeat = new int[n];
        String[] seatPos =new String[n];

        for(int i = 0;i<n;i++){
            currentSeat[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0;i<n;i++){
            int relativePos = currentSeat[i]%12;
            if(relativePos == 0){
                oppSeat[i] = currentSeat[i] -11;
    
            }
            else if(relativePos >= 6){
                oppSeat[i] = currentSeat[i] -(2*(relativePos-6)) +1;
            }
            else {
                oppSeat[i] = currentSeat[i] + (2*(6-relativePos)) +1;
            }
            if(relativePos % 6 == 0 |  relativePos % 6 == 1 ){
                seatPos[i] = "WS";
            }
            else if(relativePos % 6 == 2 |  relativePos % 6 == 5 ){
                seatPos[i] = "MS";
            }
            else{
                seatPos[i] = "AS";
            }
           
        }

        for(int i = 0;i<n;i++){
            System.out.println(oppSeat[i]+" " + seatPos[i]);
        }
       
    }
}