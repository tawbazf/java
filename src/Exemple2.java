public class Exemple2 {
    public static int g=10; // g has global scope 
    public static void main(String[] args) {
       int x =5;// x has local scope within the main method
       System.out.println(x); //x can be accessed here
       if(x==5){
           int y =10; //y has block scope within this if block
           System.out.println(y); //y can be accessed here
       }//Block ends here
        System.out.println(x); //x can still be accessed here
       //System.out.println(y); //y cannot be accessed here, it will cause a compile
       System.out.println(g); //g can be accessed anywhere in this class
    } //x is destroyed after this method ends
    public static void anotherMethod() {
        //System.out.println(x); //x cannot be accessed here, it will cause a compile error
        System.out.println(g); //g can still be accessed here
    }
}
