package dsa;

import java.util.Scanner;

class Sample{

   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);

       System.out.println("Input something");
       int i = s.nextInt();
       System.out.println(i + " is entered. Enter next String");

       String str = s.next();
       System.out.println(str);
   }
}
