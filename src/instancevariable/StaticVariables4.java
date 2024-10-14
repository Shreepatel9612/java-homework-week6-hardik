package instancevariable;

/**
 * Write a Java programme using the following steps.
 */
public class StaticVariables4 {
    //Declare two instance and two static variable
    int a = 50;
    int b = 60;
    int c = 70;
    int d = 80;

    // Declare one instance method
    public void instanceMethod(){
        System.out.println("Instance variables:" + a + " , " + b + ", Static variables:" + c + " , " + d );

    }
    // Declare one static Method
    public static  void staticMethod() {
        // Call all four instance and static variables into both instance and static method inside the print statement
        StaticVariables4 obj = new StaticVariables4();
        System.out.println("Instance variables: " + obj.a + ", " + obj.b + ", Static variables: " + obj.c + " , " + obj.d);
    }
        //Declare the main method
        public static void main(String[] args) {
            StaticVariables4 obj = new StaticVariables4();
            obj.instanceMethod();
            staticMethod();
        }
}






