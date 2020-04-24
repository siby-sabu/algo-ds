package dsa;

import javax.lang.model.util.ElementScanner6;

class BinaryAdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binaryadd(arr,0,arr.length-1)); 
    }

    private static int binaryadd(int[] arr, int low, int high) {
        if(low>high)
        return 0;
        else if(low == high)
        return arr[low];
        else{
            int mid = (low+high)/2;
            return binaryadd(arr, low, mid) + binaryadd(arr, mid+1, high);
        }

    }
}