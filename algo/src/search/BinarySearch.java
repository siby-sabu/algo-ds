package search;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(search(arr, 1));
        
    }

    public static int search(int[] arr, int searchVal) {
        int lowI = 0;
        int highI = arr.length-1;

        while(lowI <= highI) {
            int mid = (lowI + highI)/2;
            if(arr[mid] == searchVal){
                return mid;
            }
            else if( arr[mid] < searchVal) {
                lowI = mid+1;
            }
            else {
                highI = mid-1;
            }
        }
        return -1;
    }
}