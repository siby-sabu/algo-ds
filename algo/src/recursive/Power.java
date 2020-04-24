package recursive;
class Power{
    public static void main(String[] args) {
        int n = 10;
        int p =5;

        System.out.println(power(n,p));
    }

    private static int power(int n, int p) {
        if(p == 0){
            return 1;
        }
        else {
            return n * power(n, p-1);
        }
    }
}