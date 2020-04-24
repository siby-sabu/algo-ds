package recursive;

public class PrintInteger {
    public static void main(String[] args) {
        printInteger(0);
    }

    private static void printInteger(int n) {
        if (n < 10) {
            System.out.println((char) ('0' + n));
         } else {
            printInteger(n / 10);
            System.out.println((char) ('0' + n % 10));
         }
    }
}