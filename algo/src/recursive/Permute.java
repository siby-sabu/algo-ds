package recursive;
class Permute {
    public static void main(String[] args) {
        int p = 5, r = 3;
        System.out.println(permute(p,r));
    }

    private static int permute(int p, int r) {
      return permute(p)/permute(p-r);
    }

    private static int permute(int n) {
       if(n == 0){
           return 1;
       }
       else {
           return n * permute(n-1);
       }
    }
}