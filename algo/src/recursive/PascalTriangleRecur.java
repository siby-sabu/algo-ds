package recursive;
class PascalTriangleRecur {
    public static void main(String[] args) {
        int n = 1,k=3;
        System.out.println(combination(n,k));
    }

    private static int combination(int n, int k) {
       if(k == 0| n==k){
           return 1;
       }
       else return combination(n-1, k-1) + combination(n-1, k);
    }
}