package dsa;

class FibanocciGood {
    public static void main(String[] args) {
        for(long l : printFibanocci(5)){
            System.out.println(l);
        }
       
    }

    private static long[] printFibanocci(int n) {
        if(n<=1){
            long [] arr =  {0,1};
            return arr;
        }
        long [] temp = printFibanocci(n-1);
        long[] ans = {temp[0]+temp[1], temp[0]};
        return ans;
    }
}