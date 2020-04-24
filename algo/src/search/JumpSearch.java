package search;

public class JumpSearch {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 
            34, 55, 89, 144, 233, 377, 610};
        //System.out.println(search(arr,233));
        System.out.println(search(arr,144));
    }

   public static int search (int[] arr, int val) {
    int n = arr.length;
    int step = (int)Math.floor(Math.sqrt(n));
    int prev= 0;
    while(arr[Math.min(step, n)-1] < val){
        prev = step;
        step +=  (int)Math.floor(Math.sqrt(n));   
        if(step > n) {
            return -1;
        }     
    }
    while(arr[prev] < val){
        prev++;
        if(prev == Math.min(step, n)){
            return -1;
        }
    }
    if(arr[prev] == val){
        return prev;
    }
    return -1;
   }

    
}