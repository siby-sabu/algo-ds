package recursive;

class SelectionSort {
    public static void main(final String[] args) {
        final int[] arr = { 1, 4, 2, 5, 6, 76, 2, 1, 0 };
        selectionSort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    private static void selectionSort(int[] arr) {
        for(int i = 0;i<arr.length-1;i++){
            int j = findSmallestPos(i,arr);
            swap(arr,i,j);

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findSmallestPos(int i, int[] arr) {
        for(int j = i+1;j<arr.length;j++){
            if(arr[j]< arr[i])
            i = j;
        }
        return i;
    }


}