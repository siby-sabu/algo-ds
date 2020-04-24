package dsa;
class MaxElement {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,0};
        System.out.println(findMax(arr,arr[0], arr.length-1));
    }

    private static int findMax(int[] arr, int max, int n) {
        if(n < 0){
            return max;
        }
        if(arr[n] > max) {
            max = arr[n];
        }
        return findMax(arr, max, n-1);

    }
}