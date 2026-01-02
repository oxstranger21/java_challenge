//Input two numbers, print sum and average
package day2;

import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        System.out.println("Enter a first number : ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter a second number : ");
        int num2 = new Scanner(System.in).nextInt();

        int sum = num1 + num2;
        int avg = (num1 + num2) / 2;
        System.out.println("The sum is " + sum);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
    }
}
