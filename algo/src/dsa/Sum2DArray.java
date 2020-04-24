package dsa;
class Sum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(arr));
    }

    private static int sum(int[][] arr) {
        return sum(arr, arr.length-1,arr[0].length-1);
    }

    private static int sum(int[][] arr, int row, int column) {
        if(row<=0 && column < 0){
            return 0;

        }if(column < 0 && row >0){
            column = arr[row-1].length-1;
            row--;
        }
        return arr[row][column] + sum(arr,row,column-1);
    }
}