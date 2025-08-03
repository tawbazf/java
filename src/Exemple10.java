import java.util.Arrays;

public class Exemple10 {
    //arrays
    public static void main(String[] args) {
        //all of them are initialized with default values
        //for integers it is 0, for doubles it is 0.0, for strings it is null, and for booleans it is false
        int [] integers = new int[5]; // declare an array of integers with size 5
        System.out.println("Array of integers: " + Arrays.toString(integers)); // print the length of the array

        double [] doubles = new double[5]; // declare an array of doubles with size 5
        System.out.println("Array of doubles: " + Arrays.toString(doubles)); // print
        String [] strings = new String[5]; // declare an array of strings with size 5
        System.out.println("Array of strings: " + Arrays.toString(strings)); // print the length of the array
        boolean [] booleans = new boolean[5]; // declare an array of booleans with size 5
        System.out.println("Array of booleans: " + Arrays.toString(booleans)); // print the length of the array

        int [] numbers ={ 1, 2, 3, 4, 5}; // declare an array of integers with size 5
        System.out.println("Array of numbers: " + Arrays.toString(numbers)); // print the length of the array

        int [] Numbers;
        Numbers = new int[5]; // declare an array of integers with size 5
        System.out.println("Array of Numbers: " + Arrays.toString(Numbers)); // print the length of the array



        int[] myArray = new int[5] ; // declare an array of integers with size 5
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5; // initialize the array with values
        // print the elements of the array
        System.out.println("Array elements:" + Arrays.toString(myArray)); // using Arrays.toString for better readability
        // iterate through the array using a for loop
        System.out.println("Array elements:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        System.out.println("Array length: " + myArray.length); // print the length of the array
        // declare and initialize an array
        int[] numbersS = {1, 2, 3, 4, 5};

        // access elements of the array

        System.out.println("First element: " + numbersS[0]); // access the first element
        System.out.println("Second element: " + numbersS[1]); // access the second

        // modify an element of the array
        numbers[2] = 10;
        System.out.println("Modified third element: " + numbers[2]);

        // iterate through the array using a for loop
        System.out.println("All elements in the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // iterate through the array using an enhanced for loop
        System.out.println("Using enhanced for loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
        //for-each loop
        System.out.println("Using for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }
        //the sorts methods
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
        //the search methods
        int searchkey = 3;
        int index = Arrays.binarySearch(numbers, searchkey); // search for the element 3
        if (index >= 0) {
            System.out.println("Element 3 found at index: " + index);
        } else {
            System.out.println("Element 3 not found");
        }  
        //the copy methods
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length); // copy the entire array    
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        //the fill methods  
        Arrays.fill(copiedArray, 0); // fill the copied array with 0
        System.out.println("Filled copied array: " + Arrays.toString(copiedArray));
        //the equals methods
        boolean areEqual = Arrays.equals(numbers, copiedArray); // check if the two arrays are equal
        if (areEqual) {
            System.out.println("The two arrays are equal");
        } else {
            System.out.println("The two arrays are not equal");
        }
        //tow dimensional arrays matrices
        // array of arrays
      int [][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        // print the elements of the matrix
        System.out.println("Matrix elements:" + Arrays.deepToString(matrix)); // using Arrays.deepToString for better readability   
 int [][] x =new int[5][5]; // declare a two-dimensional array with size 5x5
        // initialize the two-dimensional array
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = i + j; // assign values to the elements
            }
        }
        // print the elements of the two-dimensional array
        System.out.println("Two-dimensional array elements:");
        for (int i = 0; i < x.length; i++) {
            System.out.println(Arrays.toString(x[i])); // print each row using Arrays.toString
        }
        //three dimensional arrays
        int [][][] threeDArray = {{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}}; // declare a three-dimensional array with size 2x3x4
        // print the elements of the three-dimensional array
        System.out.println("Three-dimensional array elements:" + Arrays.deepToString(threeDArray)); // using Arrays.deepToString for better readability
// nested loops for two dimential
for (int i=0;i<matrix.length;i++ ){
    for (int j=0;j<matrix[i].length;j++){
        System.out.println("Element at (" + i + "," + j + "): " + matrix[i][j]);
    }
}

      }
  
}
