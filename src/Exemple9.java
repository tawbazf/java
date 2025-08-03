public class Exemple9 {
    //methods
    public static void main(String[] args) {
        displayMessage(); // calling the method to display a message
double radius = 5.0; // radius of the circle
        double area = calculateArea(radius); // calling the method to calculate area
        System.out.println("Area of the circle with radius " + radius + " is: " + area);
        int sum = add(5, 10); // calling the method to add two integers
        System.out.println("Sum of 5 and 10 is: " + sum);
        addnumbers(3, 7); // calling the method to add two numbers and print the result
        int sum2 = add(10, 20); // calling the method to add two integers
        System.out.println("Sum of 10 and 20 is: " + sum2);
        printPersonInfo("Alice", 30); // calling the method to print person's info
        int sum3 = add(1, 2, 3); // calling the overloaded method to add three integers
        System.out.println("Sum of 1, 2, and 3 is: " + sum3);
        int x = 5; // variable to demonstrate pass by value
        System.out.println("Before passing by value: " + x);
        passByValue(x); // passing x to the method
        System.out.println("After passing by value: " + x); // x remains unchanged
        int[] numbers = {1, 2, 3}; // array to demonstrate pass by reference
        System.out.println("Before passing by reference: " + numbers[0]);
        passByReference(numbers); // passing the array to the method
        System.out.println("After passing by reference: " + numbers[0]); // numbers[0] is changed
        int n = 5; // number to calculate factorial
        int fact = factorial(n); // calling the recursive method to calculate factorial
        System.out.println("Factorial of " + n + " is: " + fact);
        printNumbers(1, 2, 3, 4, 5); // calling the vararg method to print numbers
        printNumbers(); // calling the vararg method with no arguments
        printNumbers(5);
    }
    public static double calculateArea(double radius) {
        double area =3.14* radius*radius; // Area of circle formula
        return area;
        }
        //to declare a method we use the following syntax:
        // modifier returnType methodName(parameters) {
           // method body
        public static int add(int a, int b) {
            int sum = a + b; // adds two integers
            return sum;
             // returns the sum of a and b
        }
        //two types of methods:
        //void methods: do not return a value
            //public  static void displayMessage() {
               // System.out.println("Hello, World!");
           //}
        //Non-void methods: return a value
        //public static int multiply(int a, int b) {
            //return a * b; // returns the product of a and b
            public static void displayMessage() {
                System.out.println("Hello, World!");
            }
            public static void addnumbers(int a, int b) {
                int sum = a + b; // adds two integers
                System.out.println("Sum: " + sum); // prints the sum
            }
        //we can also use methods to perform operations on objects
        public static void printPersonInfo(String name, int age) {
            System.out.println("Name: " + name + ", Age: " + age);
        }
        //method overloading: defining multiple methods with the same name but different parameters
        public static int add(int a, int b, int c) {
            return a + b + c; // adds three integers
        }
        //parameter passing: passing values to methods
        //1) pass by value: passing a copy of the value to the method
        public static void passByValue(int number) {
            number = number + 10; // modifies the local copy
            System.out.println("Inside method: " + number);
        }
        //2) pass by reference: passing the reference of the object to the method
        public static void passByReference(int[] numbers) {
            numbers[0] = numbers[0] + 10; // modifies the original array
            System.out.println("Inside method: " + numbers[0]);
        }
        //recursion: a method that calls itself
        //base case: the condition under which the recursion stops
        //recursive case: the condition under which the method calls itself
        public static int factorial(int n) {
            if (n == 0) {
                return 1; // base case
            } else {
                return n * factorial(n - 1); // recursive case
            }
        }
        //vararg methods: methods that can take a variable number of arguments
        //varargs short for variable arguments allows a method to accept zero or more arguments of  the same type ,
        // we can use varargs by using three dots (...) before the parameter type
        //it only accept one parameter with varargs       
        public static void printNumbers(int... numbers) {
            for (int number : numbers) {
                System.out.println("Number: " + number);
            }
        }
    }

