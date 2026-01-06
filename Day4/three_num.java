//Find largest of three numbers
package Day4;

import java.util.Scanner;

public class three_num {
    public static void main(String[] args) {
        System.out.println("Enter first number : ");
        int num1 = new Scanner(System.in).nextInt();
        System.out.println("Enter second number : ");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("Enter third number : ");
        int num3 = new Scanner(System.in).nextInt();

        //check largest number
        if (num1 > num2 && num1 > num3){
            System.out.println(num1+" is greater than the "+num2+" and "+num3);
        }
        else if (num2 > num1 && num2 > num3){
            System.out.println(num2+" is greater than the "+num3+" and "+num1);
        }
        else{

            System.out.println(num3+" is greater than the "+num1+" and "+num2);
        }
    }
}
