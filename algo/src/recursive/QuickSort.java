package recursive;

class QuickSort {
    public static void main(String[] args) {
        final int[] arr = { 1, 4, 2, 5, 6, 76, 2, 1, 0 };
        quicksort(arr);
        for(int i = 0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void quicksort(int[] arr) {
        quicksort(arr,0,arr.length-1);
    }

    private static void quicksort(int[] arr, int low, int high) {
        if(low < high) {
            int n = pivot(arr,low,high);
            quicksort(arr,0,n-1);
            quicksort(arr,n+1,high);
        }
    }

    private static int pivot(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1;
        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }


}