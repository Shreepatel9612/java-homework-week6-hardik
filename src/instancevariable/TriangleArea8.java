package instancevariable;
/**
 * Write a program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class TriangleArea8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base of triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }
}
