package recursive;

class TowerOfHanoi {
static int  count =0;
public static void main(String[] args) {
    int n= 3;
    //moveTower(n,"A","B","C");
    nHanioMoves(3);
    System.out.println(count);
    
    // nHanoiMoves(n);
    // System.out.println(count);
}

    // private static void nHanoiMoves(int n) {
    //     moveTower(n,"A","B","C");
    // }

    private static void nHanioMoves(int n) {
        moveTower(n, "A", "B","C");

    }

    private static void moveTower(int n, String start, String finish, String temp) {
        if (n == 0){
            return;
        }
        moveTower(n-1, start, temp, finish);
        count++;
        moveTower(n-1, temp, finish, start);

    }

    // private static void moveTower(int n, String start, String finish, String temp) {
    //     // if(n==1){
    //     //     System.out.println(start +"==>" +finish);
    //     //     count++;
    //     // }
    //     if(n==0){
    //        return;
    //     }
    //     else{
    //         moveTower(n-1, start, temp, finish);
    //         System.out.println(start +"==>" + finish);
    //         moveTower(n-1, temp, finish, start);
            
          
    //     }
    // }
}