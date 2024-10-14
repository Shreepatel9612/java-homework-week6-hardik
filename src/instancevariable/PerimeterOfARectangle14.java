package instancevariable;

/**
 * Write a Java program to print the area and perimeter of a rectangle.
 */
public class PerimeterOfARectangle14 {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);

    }
}
