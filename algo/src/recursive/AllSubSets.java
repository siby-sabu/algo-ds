package recursive;
class  AllSubSets {
    public static void main(String[] args) {
        String s = "abc";

        printSubSets(s);

    }

    private static void printSubSets(String s) {
        printSubSets(s,0,"");
    }

    private static void printSubSets(String s, int index, String p) {
        if(index == s.length()) {
            System.out.println(p);
            return;
        }
         printSubSets(s, index+1, p+ s.charAt(index));
         printSubSets(s, index+1, p);
    }

}