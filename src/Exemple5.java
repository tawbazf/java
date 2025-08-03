public class Exemple5 {
    //operators
    public static void main(String[] args) {
    //arithmetic operators: +, -, *, /, % follow the order of operations(PEMDAS)
    //P parentheses, E exponents, MD multiplication and division, AS addition and subtraction
        int a = 5;
        int b = 10;
        int sum = a + b;
        int difference = b - a;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;
        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(quotient);
        System.out.println(remainder);
        
        //comparison operators: ==, !=, >, <, >=, <=
        int x = 10;
        int y = 10;
        System.out.println( x == y ) ; //true
        System.out.println( x != y ) ; //false
        System.out.println( x > y ) ; //false
        System.out.println( x < y ) ; //false
        System.out.println( x >= 0 ) ; //true
        //logical operators: &&, ||, !
        boolean condition1 = true;
        boolean condition2 = false;
        System.out.println( condition1 && condition2 ) ; //false
        System.out.println( condition1 || condition2 ) ; //true
        System.out.println( !condition1 ) ; //false
       int num1 = 5;
       int num2 = 10;
       System.out.println( num1 > num2 ? "num1 is greater" : "num2 is greater or equal" ); //num2 is greater or equal
//assignment operators: =, +=, -=, *=, /=, %=
       int z = 5;
       z += 3; //z = z + 3
       System.out.println(z); //8
       z -= 2; //z = z - 2
       System.out.println(z); //6
       z *= 2; //z = z * 2
       System.out.println(z); //12
       z /= 3; //z = z / 3
       System.out.println(z); //4
       z %= 3; //z = z % 3
       System.out.println(z); //1
       String str = "Hello";
       str += " World"; //str = str + " World"
         System.out.println(str); //Hello World
    }
  
}
