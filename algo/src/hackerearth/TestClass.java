package hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
       

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.valueOf(br.readLine()); 
        String second = br.readLine();   // Reading input from STDIN
        System.out.println(first*2); 
        System.out.println(second); // Writing output to STDOUT


        // Write your code here

    }
}