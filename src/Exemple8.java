public class Exemple8 {
    //loops
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }
        // enhanced for loop (for-each loop)
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {    
            System.out.println("Number: " + number);
        }
        for(int i=2;i>=0;i--){
            System.out.println("i: " + i);
        }
        //factorial using for loop
        int factorial = 1;
        //for(int i=1;i<=5;i++){
        //    factorial *= i;
        for (int i = 5; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);

        // while loop
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteration " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("Iteration " + k);
            k++;
        } while (k <= 5);
        //break and continue
        for (int l = 1; l <= 10; l++) {
            if (l == 5) {
                System.out.println("Skipping 5");
                continue; // skip the rest of the loop when l is 5
            }
            if (l == 8) {
                System.out.println("Breaking at 8");
                break; // exit the loop when l is 8
            }
            System.out.println("Number: " + l);
        }
    }
    //using the right loop
    //for: when you know the number of iterations
    //while: when you don't know the number of iterations, but you have a condition to check
    //do-while: when you want to execute the loop at least once before checking the condition
    //enhanced for: when you want to iterate over elements in a collection or array
    //break: to exit the loop immediately
    //continue: to skip the current iteration and move to the next one
}
