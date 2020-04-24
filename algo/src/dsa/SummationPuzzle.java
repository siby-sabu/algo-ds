package dsa;

import java.util.HashSet;
import java.util.Set;

class SummationPuzzle {
    static String[][] str = {{"pot","pan","bib"},{"dog","cat","pig"},{"boy", "girl", "baby"}};
    static int[] intVal = {1,2,3,4,5,6,7,8,9};
    static Set<String> uniqueSet;


    public static void main(String[] args) {
        solve(str);
    }

    private static void solve(String[][] str2) {
        uniqueSet = findUniques(str);
      System.out.println(uniqueSet);

    }

 

    private static Set<String> findUniques(String[][] str) {

        Set<String> s = new HashSet<>();
        for(int i=0;i<3;i++){
          String a = str[i][0];
          String b = str[i][1];
          String c = str[i][2];

            for(Character ch : a.toCharArray()){
                s.add(Character.toString(ch));
            }
            for(Character ch : b.toCharArray()){
                s.add(Character.toString(ch));
            }
            for(Character ch : c.toCharArray()){
                s.add(Character.toString(ch));
            }
        }

        return s;
    }
}