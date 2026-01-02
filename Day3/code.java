//Check if even/odd and positive/negative
package Day3;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        int num = new Scanner(System.in).nextInt();
        if (num % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        if(num>0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is negative");
        }

    }
}
