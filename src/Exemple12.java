public class Exemple12 {
    //string methods
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        //length
        System.out.println("Length: " + str.length());
        
        //charAt
        System.out.println("Character at index 7: " + str.charAt(7));
        
        //substring
        System.out.println("Substring from index 7: " + str.substring(7));
        
        //indexOf
        System.out.println("Index of 'World': " + str.indexOf("World"));
        
        //toLowerCase and toUpperCase
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        
        //replace
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        //immutable cant be changed after they are created
        str = str + "New String";
        System.out.println("After reassignment: " + str);
    }
}
