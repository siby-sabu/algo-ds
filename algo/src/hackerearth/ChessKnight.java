package hackerearth;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessKnight {

    int count = 0;
    int[][] board = new int[10][10];
    public static void main(String[] args) throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] t = input.split(" ");
        int x = Integer.parseInt(t[0])-1;
        int y = Integer.parseInt(t[1])-1;
        int n = Integer.parseInt(t[2]);

        ChessKnight ck = new ChessKnight();
        ck.countAllPos(x, y, n);
        System.out.println(ck.count);

    }

    private  void countAllPos(int x, int y, int n) {
        if(n == 0 && board[x][y] == 0){
            board[x][y]++;
            count++;
            return;
        }
     
        else {
            if(x-2 >=0 && y-1 >=0 ) 
            countAllPos(x-2, y-1, n-1);
            
            if(x-2 >=0 && y+1 <10)
            countAllPos(x-2, y+1, n-1);
            if(x-1 >=0 && y-2 >=0)
            countAllPos(x-1, y-2, n-1);
            if(x-1 >=0 && y+2 <10)
            countAllPos(x-1, y+2, n-1);
            if(x+1 <10 && y-2 >=0)
            countAllPos(x+1, y-2, n-1);
            if(x+1 <10 && y+2 <10)
            countAllPos(x+1, y+2, n-1);
            if(x+2 <10 && y-1 >=0)
            countAllPos(x+2, y-1, n-1);
            if(x+2 <10 && y+1 <10)
            countAllPos(x+2, y+1, n-1);
        }

    }
}