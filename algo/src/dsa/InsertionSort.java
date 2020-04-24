package dsa;

class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,3,6,8,4};
        sort(arr);
        for(int i: arr)
        System.out.println(i);
    }

    private static void sort(int[] arr) {
        for(int i = 1;i<arr.length;i++){
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]> temp){
                arr[j] = arr[j-1];;
                j--;
            }
            arr[j] = temp;
        }
    }
}