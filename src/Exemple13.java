public class Exemple13 {
//concatination
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        
        // Concatenation using + operator
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
        
        // Concatenation using concat() method
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name using concat(): " + fullName2);
        
        // Concatenation with numbers
        int age = 30;
        String message = "My name is " + fullName + " and I am " + age + " years old.";
        System.out.println(message);

        // Using StringBuilder for efficient concatenation
        StringBuilder sb = new StringBuilder();
        //n9dro nfr9o kola append f str sb.append kola w7da f str
        sb.append("My name is ").append(fullName).append(" and I am ").append(age).append(" years old.");
        System.out.println(sb.toString());
        //Using stringbuffer
        StringBuffer sbf = new StringBuffer();
        sbf.append("My name is ").append(fullName).append(" and I am ").append(age).append(" years old.");
    }
    //both StringBuilder and StringBuffer are used for mutable strings, but StringBuffer is synchronized (thread-safe) while StringBuilder is not.
}
//StringBuilder is generally preferred for single-threaded applications due to its performance advantage.
//  StringBuilder is designed for single-threaded environments and does not require the synchronization mechanisms that StringBuffer uses, making it faster in such contexts. This efficiency is particularly beneficial when performance is a priority in applications where multi-threading is not a concern.
