import java.io.IOException;
import java.io.FileNotFoundException;

public class Adult {
 
    protected int age;
    
    public Adult () {}
    
    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Must be over 18");
        }
        this.age = age;
    }
    
    public void accessMedicalRecord (String path) throws IOException {
        if (path == null) {
            throw new FileNotFoundException("The medical record could not be accessed");
        }
       
    }
}