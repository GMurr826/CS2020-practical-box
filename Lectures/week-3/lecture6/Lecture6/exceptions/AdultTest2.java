import java.io.IOException;

public class AdultTest2 {
    public static void main(String[] args) {
 
        int age = Integer.parseInt(args[0]);
 
        try {
            Adult patient = new Adult(); 
            patient.setAge(age);          
        } 
        catch (IllegalArgumentException ex) {
            System.out.println ("Unchecked exception caught:");
            System.err.println(ex);
        }
        finally {
            System.out.println ("Prints in any case");
        }
    }
}