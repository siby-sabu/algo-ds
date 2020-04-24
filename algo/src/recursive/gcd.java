package recursive;
class gcd {
    public static void main(String[] args) {
        int a=10,b=0 ;
        System.out.println(gcd(a,b));

    }

    private static int gcd(int a, int b) {
        if(a == 0){
            return b;
        }
        else{
            return gcd(b%a,a);
        }
    }
}