public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display() {
        // Attempting to change the value of 'x'
        x = 20; // This will cause a compilation error

        // Printing the value of 'x'
        System.out.println("Value of x inside display method: " + x);
    }
}
