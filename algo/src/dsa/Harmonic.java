package dsa;
class Harmonic {
    public static void main(String[] args) {
        int n =3;
        System.out.println(harmonic(n));
    }

    private static float harmonic(int n) {
        if(n == 1)
        return 1.0f;
           
            return (1.0f/n) + harmonic(n-1);
       
    }
}