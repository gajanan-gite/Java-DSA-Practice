import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Printing output
        System.out.println("\n----- Student Details -----");
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
        System.out.println("CGPA       : " + cgpa);
        System.out.println("Is Student : " + isStudent);

        sc.close();
    }
}
