package dsa;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,12,14,17,19,22,25,27,28,33,37};
        int search = 37;

        System.out.println(search(arr,search));
        
        
    }

    private static int search(int[] arr, int search) {
       return search(arr, search,0,arr.length-1);
    }

    private static int search(int[] arr, int search, int low, int high) {
        if( low>high){
            return -1;
        }
        int mid = low+ (high-low)/2;
        if(arr[mid] == search) 
        return mid;
        else if(arr[mid] > search) 
        return search(arr, search,0, mid-1);
        else return search(arr, search, mid+1, high);
    }
}