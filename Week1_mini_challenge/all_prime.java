// Find all prime numbers between 1 - 100
package Week1_mini_challenge;

public class all_prime {
    public static void main(String[] args) {
        int total=0;
        for(int i=2; i<=100; i++){
            int count=0;
          for(int j=2; j<=i; j++){
              if(i%j==0){
                  count++;
              }

          }
          if(count==1){
              System.out.println(i+ " prime number");
              total++;
          }
        }
        System.out.println("Total = "+total);
    }
}
