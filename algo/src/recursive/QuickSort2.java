package recursive;
class QuickSort2 {
    public static void main(String[] args) {
        final int[] arr = { 90,99,63,82,93,76,81,76};
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
            int p = partition(arr,low, high);
            quicksort(arr,0,p-1);
            quicksort(arr,p+1,high);
        } 
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int boundary = low;
        for(int j = low+1;j<=high;j++){
            if(arr[j]<pivot) {
               
                int temp = arr[boundary+1];
                arr[boundary+1] = arr[j];
                arr[j] = temp;
                boundary++;
            }
        }
        int temp = arr[boundary];
        arr[boundary] = pivot;
        arr[low] = temp;
        return boundary;
    }
}