public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Type Casting (Widening)
        int number = 100;
        double value = number;

        System.out.println("Implicit Type Casting:");
        System.out.println("Integer: " + number);
        System.out.println("Double: " + value);

        // Explicit Type Casting (Narrowing)
        double pi = 3.14159;
        int intValue = (int) pi;

        System.out.println("\nExplicit Type Casting:");
        System.out.println("Double: " + pi);
        System.out.println("Integer: " + intValue);
    }
}
