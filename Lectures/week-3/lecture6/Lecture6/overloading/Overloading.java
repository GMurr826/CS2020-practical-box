public class Overloading {
    
    private static void printName(String first, String last) {
        System.out.println (first +" "+ last);  
    }
    
    private static void printName(String name) {
        System.out.println (name);  
    }
    
    private static void printName(char[] first, String last) {
        System.out.println (first +" "+ last );  
    }
    
    public static void main(String[] args) {
        printName ("Milan","Markovic");
        printName ("Milan Markovic");
        char[] first = {'M','i','l','a','n'}; 
        printName (new String(first), "Markovic");
    } 
} 