package recursive;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,3,89,64,3,23,1,6,24,33};
        mergesort(arr);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void mergesort(int[] arr) {
        if(arr.length >1){
            int mid = arr.length/2;
            int[] a1 = splitarray(arr,0,mid);
            int[] a2 = splitarray(arr,mid,arr.length);
            mergesort(a1);
            mergesort(a2);
            merge(arr,a1,a2);

        }
    }

    private static void merge(int[] arr, int[] a1, int[] a2) {
        int n1 = a1.length;
        int n2 = a2.length;
        int i1 = 0;
        int i2 = 0;
        for(int i = 0;i<arr.length;i++){
            if(i2 == n2 || i1<n1 && a1[i1]< a2[i2]){
                arr[i] = a1[i1];
                i1++;
            }
            else{
                arr[i] = a2[i2];
                i2++;
            }
        }
    }

    private static int[] splitarray(int[] arr, int start, int end) {
        int [] a = new int[end-start];
        for(int i = start;i<end;i++){
            a[i-start] = arr[i];
        }
        return a;
    }
}