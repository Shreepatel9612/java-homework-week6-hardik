package instancevariable;

/**
 * Write a Java programme using the following steps.
 */
public class OneStaticVariables2 {
    //two static variables
    static int a = 40;
    static int b = 20;

    // Declare one static method
    public static void display(){

        // call both static variables into static method inside the print statement
        System.out.println("a = " + a +", b =" + b);
    }

    // Declare the main method
    public static void main(String[] args) {
        display();
    }
}
