public abstract class Person {
       
    protected String name = "Person"; 
    
    public Person (String name) {
        this.name = name; 
        printName();
    }
    
    public abstract int getHeight ();
    
    public void printName() {
        System.out.println (name);
    }
    
    public static void describeClass () {
        System.out.println ("This class captures person");
    } 
    
}