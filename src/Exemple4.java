import java.util.Scanner;
public class Exemple4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = input.nextInt();
        // System.out.printf("|%10d|%n", number);
        // input.close();
        //with string
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello, "+name);
         input.close();
         //with float
        System.out.print("Enter a float number: "); 
        float number = input.nextFloat();
        System.out.printf("You entered: %.2f%n", number);
        //with double
        System.out.print("Enter a double number: ");
        double dNumber = input.nextDouble();
        System.out.printf("You entered: %.2f%n", dNumber);
    }

}
