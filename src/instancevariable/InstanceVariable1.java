package instancevariable;

/**
 * Write a Java programme using the following steps.
 */
public class InstanceVariable1 {
    // Declare two instance variables
    int a = 10;
    int b = 20;

    //Declare one instance method
    public void display(){

        // call both instance variables into the instance method inside the print statement.
        System.out.println("a = " + a + ", b + " + b);
    }

    //Declare the main method.
    public static void main(String[] args) {
        // call the above instance method into the main method and ran the program.
        InstanceVariable1 obj = new InstanceVariable1();
        obj.display();

    }
}
