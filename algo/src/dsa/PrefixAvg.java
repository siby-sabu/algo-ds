package dsa;

class PrefixPkg {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,7,7,8,1};
        float [] avgArr = new float[arr.length];
        // for(int i = 0;i<arr.length;i++){
        //     float total = 0;
        //     for(int j=0;j<=i;j++){
        //         total +=arr[j];
        //     }
        //     avgArr[i] = total/(i+1);
        // }

        int total = 0;
        for(int i=0;i<arr.length;i++){
            total += arr[i];
            avgArr[i] = total/(i+1);
        }

        for
        (float i: avgArr){
            System.out.println(i);
        }
    }
}