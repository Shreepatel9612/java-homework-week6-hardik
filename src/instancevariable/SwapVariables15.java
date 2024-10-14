package instancevariable;
/**
 * Write a Java program to swap two variables.
 */

import java.util.Scanner;

public class SwapVariables15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();

        //swapping process
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
    }
}
