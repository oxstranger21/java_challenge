//Check if number is prime
package Day7;

import java.util.Scanner;

public class file {
    public static void main(String[] args) {
        int count=0;
        System.out.println("Enter a number you want to check prime or not : ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        if(count==2){
            System.out.println("Number is prime ");
        }
        else{
            System.out.println("Number is not prime ");
        }

    }
}
