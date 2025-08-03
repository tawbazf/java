public class Exemple6 {
    //if else
    public static void main(String[] args) {
        int number = 10;

        // if statement
        if (number > 5) {
            System.out.println("Number is greater than 5");
        }

        // if-else statement
        if (number < 5) {
            System.out.println("Number is less than 5");
        } else {
            System.out.println("Number is not less than 5");
        }

        // if-else if statement
        if (number < 5) {   
            System.out.println("Number is less than 5");
        } else if (number == 5) {
            System.out.println("Number is equal to 5");
        } else {
            System.out.println("Number is greater than 5");
        }  
        // nested if statement
        if (number > 0) {   
            System.out.println("Number is positive");
            if (number % 2 == 0) {
                System.out.println("Number is even");
            } else {
                System.out.println("Number is odd");
            }
        } else {
            System.out.println("Number is not positive");
        } 
        //if else ladder
        if (number < 0) {
            System.out.println("Number is negative");
        } else if (number == 0) {
            System.out.println("Number is zero");
        } else if (number > 0 && number < 10) {
            System.out.println("Number is positive and less than 10");
        } else {
            System.out.println("Number is positive and greater than or equal to 10");
        }
}
}


