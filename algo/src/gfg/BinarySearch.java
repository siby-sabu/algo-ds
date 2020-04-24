package gfg;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,22,47,71,450,532,800};
        int s = 47;
        int ix = binarysearch(arr,s,0,arr.length-1);
        if( ix != -1){
            System.out.println("found at pos"+ ix);
        }
        else{
            System.out.println("Not found");
        }
    }

    private static int binarysearch(int[] arr, int s,int l,int r) {
        if(l>r){
            return -1;
        }
        else{
            int mid = (l+r )/2;
            if(arr[mid] == s){
                return mid;
            }
            else if(s < arr[mid]){
                return binarysearch(arr, s, l, mid-1);
            }
            else{
                return binarysearch(arr, s, mid+1, r);
            }
        }
    }

 
}