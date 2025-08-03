public class Exemple14 {
    //string compariason
    // we cant use == operator to compare strings
    // we have to use equals method or compareTo method
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using equals method for content comparison
        System.out.println("str1 equals str2: " + str1.equals(str2)); // true
        System.out.println("str1 equals str3: " + str1.equals(str3)); // true
        // Using equalsIgnoreCase for case-insensitive comparison
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello")); // true

        // Using == operator for reference comparison
        System.out.println("str1 == str2: " + (str1 == str2)); // true, same reference in string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // false, different references

        // Using compareTo method
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2)); // 0, same content
        System.out.println("str1 compareTo 'World': " + str1.compareTo("World")); // positive value, 'H' > 'W'
    }
}
