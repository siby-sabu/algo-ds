package recursive;
class PermuteString {
    public static void main(String[] args) {
        printAllPermutations("ABC");
    }

    private static void printAllPermutations(String s) {
        printAllPermutations(s, "");
        
    }

    private static void printAllPermutations(String s, String prefix) {
        if (s.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for(int i =0;i< s.length();i++){
            if(!s.substring(0,i).contains(Character.toString(s.charAt(i)))) {
                printAllPermutations(s.substring(0,i)+s.substring(i+1), prefix + s.charAt(i));
            }
           
        }
    }
}