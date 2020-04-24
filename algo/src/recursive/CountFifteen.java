package recursive;
class CountFifteen {
    static int count = 0;
    public static void main(String[] args) {
        String[] hand = { "5C", "5D", "5H", "5S" };
        count(hand);
    }

    private static void count(String[] hand) {
         System.out.println( count(hand,0,0));
    }

    private static int count(String[] hand, int index, int sum) {
       if(index == hand.length) {
           if(sum == 15){
            count++;
           }
          return 0;
       }
       int c = Integer.valueOf(hand[index].substring(0,hand[index].length()-1));
       count(hand,index+1,sum+c);
       count(hand,index+1,sum);
       return count;
    }
}
