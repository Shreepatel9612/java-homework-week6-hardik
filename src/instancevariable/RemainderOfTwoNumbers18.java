package instancevariable;
/**
 * Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */

import java.util.Scanner;

public class RemainderOfTwoNumbers18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input first number
        System.out.println("Input first number: ");
        int num1 = scanner.nextInt();

        //Input second number
        System.out.println("Input second number: ");
        int num2 = scanner.nextInt();

        //perform and display operation

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));
    }
}
