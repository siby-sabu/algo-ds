package recursive;
class KnightsTour2 { 
    public static void main(String[] args) {
        int[][] board = new int[8][8];
        setInitialValue(board);
        board[0][0] = 0;
        if(move(board,1,0,0)){
            printboard(board);
        }else {
            System.out.println("No solution");
        }
    }


    private static boolean move(int[][] board, int move, int x, int y) {
        if(move == 64){
            return true;
        }
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2}; 
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1}; 

        for(int i=0;i<8;i++) {
            int x_next = x+xMove[i];
            int y_next = y+yMove[i];
            if(isSafe(board,x_next,y_next)){
                board[x_next][y_next] = move;
                if(move(board, move+1, x_next, y_next))
                return true;
                board[x_next][y_next] = -1;
            }

        }
        return false;
    }

    private static boolean isSafe(int[][] board, int x, int y) {
        if(x>=0 && x<8 && y>=0 && y<8 && board[x][y] == -1){
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