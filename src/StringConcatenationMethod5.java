public class StringConcatenationMethod5 {
    //Two static method
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    //Two instance method
    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;

    }
}

public static void main(String[] args) {
    //Using static methods
    System.out.println("Addition: " + add(10, 5));
    System.out.println("Subtraction: " + subtract(10, 5));

    //Using instance methods
    StringConcatenationMethod5 calc = new StringConcatenationMethod5();
    System.out.println("Multiplication: " + calc.multiply(10, 5));
    System.out.println("Divison: " + calc.divide(10, 5));
}
}


