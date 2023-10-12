import java.io.IOException;

public class AdultTest {
    public static void main(String[] args) {
 
        int age = Integer.parseInt(args[0]);
 
        try {
            Adult patient = new Adult(); 
            patient.setAge(age);
            patient.accessMedicalRecord(null);           
        } 
        catch (IllegalArgumentException ex) {
            System.out.println ("Unchecked exception caught:");
            System.err.println(ex);
        }
        catch (IOException ex) {
            System.out.println ("Checked exception caught:");
            System.err.println(ex);
        }
    }
}