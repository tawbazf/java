public class Exemple11 {
 
    public static void main(String[] args) {
          //strings
    String myString = "Hello, World!"; // declare and initialize a string
    System.out.println(myString); // use the variable to avoid unused warning
    //strings are objects in Java
        String name = "Alice"; // declare and initialize a string
        int length = name.length(); //  method to get the length of the string
        System.out.println("Length of name: " + length); // use the variable to avoid unused warning
        //string literals vs string objects
        String literal = "Hello"; // string literal and its stored in the string  constant pool
        System.out.println("Literal: " + literal); // use the variable to avoid unused warning
        String object = new String("Hello"); // string object and its stored in the heap memory
        System.out.println("Object: " + object); // use the variable to avoid unused warning

    }   
}
