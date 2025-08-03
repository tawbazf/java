public class Exemple15 {
    //string formatting
    public static void main(String[] args) {
        String name = "Alice";
        int age = 30;
        double salary = 50000.50;

        // Using String.format
        //Sting.format(formastring,args);
        String formattedString = String.format("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        System.out.println(formattedString);

        // Using printf
        System.out.printf("Name: %s, Age: %d, Salary: %.2f%n", name, age, salary);

        // Using concatenation
        String concatenatedString = "Name: " + name + ", Age: " + age + ", Salary: " + salary;
        System.out.println(concatenatedString);
    }
      }