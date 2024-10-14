package instancevariable;
/**
 * Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

import java.util.Scanner;

public class PrintMultiplicationTable10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number: ");
        int num = scanner.nextInt();

        // print multiplication table
        for (int i = 1 ; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

