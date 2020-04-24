package recursive;
class DigitalRoot {
    public static void main(String[] args) {
        int n = 123456;
        findDigitalRoot(n);
    }

    private static void findDigitalRoot(int n) {
        if(n<10) {
            System.out.println(n);
            return;
        }
        findDigitalRoot(addDigits(n));

    }

    private static int addDigits(int n) {
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return sum;
    }
}