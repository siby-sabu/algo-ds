package dsa;

class Power {
public static void main(String[] args) {
    float a = 3;
    int b=4;
    System.out.println(power(a,b)); 
}

    private static float power(float num, int pow) {
      if(pow ==0){
          return 1;
      }
      float temp = power(num,pow/2);
      float res = temp*temp;
      if(pow %2 == 1){
          res *= num;
      }
      return res;
    }
}