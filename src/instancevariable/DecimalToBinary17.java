package instancevariable;

import java.util.Scanner;

/**
 * Write a Java program to convert a decimal number to binary number.
 */
public class DecimalToBinary17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a Decimal Number: ");
        int decimal = scanner.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimal);

        System.out.println("Binary number is: " + binary);
    }
}

