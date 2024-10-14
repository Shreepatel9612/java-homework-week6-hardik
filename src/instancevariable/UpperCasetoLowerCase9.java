package instancevariable;
/**
 * Write a program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class UpperCasetoLowerCase9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string in uppercase: ");
        String input = scanner.nextLine();
        String lowercase = input.toLowerCase();
        System.out.println("Lowercase string: " + lowercase);
    }
}
