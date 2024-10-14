package instancevariable;
/**
 * Write a Java program to convert a given string into lowercase.
 */

import java.util.Scanner;

public class StringToLowerCase19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // convert to lowercase
        String lowercase = input.toLowerCase();

        //output the result
        System.out.println("Lowercase string: " + lowercase);


    }
}
