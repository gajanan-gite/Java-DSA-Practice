public class Functions {

    // Function to add two numbers
    static int add(int a, int b) {
        return a + b;
    }

    // Function to display a message
    static void greet() {
        System.out.println("Welcome to Java!");
    }

    public static void main(String[] args) {

        greet();

        int sum = add(10, 20);

        System.out.println("Sum = " + sum);
    }
}
