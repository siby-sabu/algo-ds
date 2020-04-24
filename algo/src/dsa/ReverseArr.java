package dsa;

class ReverseArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverse(arr);
        for(int i : arr)
        System.out.println(i);
    }

    private static void reverse(int[] arr) {
        reverse(arr,0,arr.length-1);
    }

    private static void reverse(int[] arr, int low, int high) {
        if(low>high) {
            return;
        }
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
        reverse(arr,low+1, high-1);
    }
}