package dsa;

import java.util.Arrays;

class ArrayDuplicates {
    public static void main(String[] args) {
        int[] arr = {2,3,2,4,5,7,7,8,1};
        Arrays.sort(arr);
        if(!hasDuplicates(arr)){
            System.out.println("No duplicates");
        }
        else{
            System.out.println("Duplicates present");
        }
        
    }

    private static boolean hasDuplicates(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i] == arr[i+1]){
                return true;
            }
        }
        return false;
    }


   
}