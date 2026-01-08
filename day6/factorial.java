//Calculate factorial using loop
package day6;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int sum = 1;
        System.out.println("Enter a number : ");
        int num = new Scanner(System.in).nextInt();
        for (int i = 1; i <= num; i++) {
            sum = sum*i;
        }
        System.out.println(sum);
    }
}
