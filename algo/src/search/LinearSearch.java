package search;

class LinearSearch {
    public static void main(String[] args) {
       int[] arr = new int[10];
       boolean isPresent = false;; 
       for(int i = 0;i<arr.length;i++) {
           arr[i] = (int)(Math.random()*arr.length);
           System.out.println(arr[i]);
       }
      
       int searchInt = (int)(Math.random()*arr.length)-100;

       for(int i = 0;i<arr.length;i++) {
           if(arr[i] == searchInt){
               isPresent = true;
               System.out.println(searchInt +" found at pos "+ i);
               break;
           }
       }
       if (!isPresent) {
        System.out.println(searchInt +" notfound ");
       }
       

    }
}