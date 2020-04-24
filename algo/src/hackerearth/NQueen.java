package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen {
    int[][] board;

    public static void main(String[] args) throws NumberFormatException, IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n = Integer.parseInt(br.readLine());

        NQueen nq = new NQueen();
        nq.initialize(n);
        nq.solve(nq.board,0); 
   }


   public void initialize(int n){
       board = new int[n][n];
   }

   public boolean solve(int[][] board, int p){
       if(p == board.length){
        printBoard(board);
           return true; 
       }
       else{ 
        for(int i =0;i< board.length;i++){
            if(isSafe(i,p)){
                board[i][p] =1;
                if(solve(board, p+1) == true) {
                    return true;
                }
                board[i][p] = 0;
            }
        }
        return false;
       }
}

    private void printBoard(int[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private boolean isSafe(int x, int y) {
        for(int i=0;i<y;i++){
            if(board[x][i] == 1){
                return false;

            }
        }
        for(int i=x,j=y;i>=0 && j>=0;i--,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        for(int i=x,j=y;i<board.length && j>=0;i++,j--){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}