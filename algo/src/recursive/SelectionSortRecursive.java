package recursive;
class SelectionSortRecursive {
    public static void main(String[] args) {
        final int[] arr = { 1, 4, 2, 5, 6, 76, 2, 1, 0 };
        selectionSort(arr,0);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        
    }

    private static void selectionSort(int[] arr, int index) {
        if (index == arr.length)
        return;
        int k = minIndex(arr,index);
        if(k != index) {
            int t = arr[k];
            arr[k] = arr[index];
            arr[index] = t;
        }
        selectionSort(arr, index+1);
        
    }

    private static int minIndex(int[] arr, int index) {
        if (index == arr.length-1){
            return index;
        }
        int k = minIndex(arr, index+1);
        return arr[index] < arr[k] ? index : k;

    }
}