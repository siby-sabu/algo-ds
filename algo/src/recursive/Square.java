package recursive;
class Square {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(square(n));
    }

    private static int square(int n) {
        if(n ==1){
            return 1;
        }
        else{
            return 2*n-1 +square(n-1);
        }
    }
}