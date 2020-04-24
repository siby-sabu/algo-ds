package recursive;

class AllWords {
    public static void main(String[] args) {
        String[] s = {"abc","def"};

        printsWords(s);
    }

    private static void printsWords(String[] s) {
        printsWords(s,0,"");
    }

    private static void printsWords(String[] s, int index, String word) {
        if(index == s.length){
            System.out.println(word);
            return;
        }
        String t = s[index];
        for(int i = 0;i<t.length();i++){
            printsWords(s, index+1, word+ t.charAt(i));
        }
    }
}