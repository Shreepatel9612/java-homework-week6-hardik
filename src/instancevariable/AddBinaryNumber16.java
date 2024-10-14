package instancevariable;
/**
 * Write a Java program to add two binary numbers.
 */

import java.util.Scanner;

public class AddBinaryNumber16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first binary number: ");
        String binary1 = scanner.nextLine();
        System.out.println("Input second binary number: ");
        String binary2 = scanner.nextLine();

        //Convert binary number to integers
        int num1  = Integer.parseInt(binary1, 2);
        int num2  = Integer.parseInt(binary2, 2);

        //Add the binary numbers
        int sum = num1 + num2;

        //convert the sum back to binary
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));

    }
}
