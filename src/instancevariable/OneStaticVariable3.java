package instancevariable;

/**
 * Write a Java programme using the following steps.
 */
public class OneStaticVariable3 {
    // Declare one instance and one static variable.
    int x = 55;
    int y = 66;

    // Declare one instance method
    public void instanceMethod(){
        System.out.println("instance variable:" + x + ", static variable: " + y);

    }
    // Declare one static method
    public static void staticMethod() {
        OneStaticVariable3 obj = new OneStaticVariable3();
        System.out.println("instance variable:" + obj.x + ", static variable: " + obj.y);

    }
    // Declare the main method
    public static void main(String[] args) {
        // call both instance and static method into the Main method and run the programme
        OneStaticVariable3 obj = new OneStaticVariable3();
        obj.instanceMethod();
        staticMethod();
    }
}
