package recursive;

class KnightsTour {
    public static void main(String[] args) {
        int[][] board = new int [8][8];
        printboard(board);
        setInitialValue(board);
        board[7][0] = 0;
        if(move(board,1,7,0)){
            printboard(board);
        }
        else{
            System.out.println("no solution");
        }

        
    }

    private static boolean move(int[][] board, int move, int x, int y) {
        if(move == 64){
            return true;
        }
     
            int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
            int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 

            for(int i=0;i<8;i++){
                int next_x = x+xMove[i];
                int next_y = y+yMove[i];
                if(isSafe(board, next_x,next_y)){
                    board[next_x][next_y] = move;
                    if(move(board,move+1,next_x,next_y)) return true;
                    board[next_x][next_y] = -1;
                    
                }

            }
        return false;

    }

    private static boolean isSafe(int[][] board,int x, int y) {
       if(x >= 0 && x <8 && y >=0 && y<8 && board[x][y] == -1) {
           return true;
       }
       return false;
    }

    private static void setInitialValue(int[][] board) {
        for(int i =0;i< 8;i++){
            for(int j = 0;j<8;j++) {
               board[i][j] = -1;
            }
       
        }
    }

    private static void printboard(int[][] board) {
        for(int i =0;i< 8;i++){
            for(int j = 0;j<8;j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}