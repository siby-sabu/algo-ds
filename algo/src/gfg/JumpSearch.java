package gfg;

class JumpSearch {
    public static void main(String[] args) {
        int[] arr = {1,3,22,47,71,450,532,800};
        int s = 450;
        int js = 3;
        int pos = jumpsearch(arr,s,js);
        if(pos != -1){
            System.out.println(pos);
        }
        else{
            System.out.println("Not found");
        }
    }

    private static int jumpsearch(int[] arr, int s, int js) {
        if(s < arr[0] | s> arr[arr.length-1]){
            return -1;
        }
        int i=0;
        for(;i<arr.length;i+=js){
            if(arr[i] == s){
                return i;
            }
            if(arr[i] > s){
                i-=js;
                break;
            }

        }
        if(i > arr.length){
            i-=js;
        }
        int lim = Math.min(i+js, arr.length);

        for(int k=i;k<lim;k++){
            if(arr[k] == s){
                return k;
            }
        }
        return -1;
    }
}