public class RunExample {
    
    public static void main (String[] args) {
        //you can call static methods
        Person.describeClass();
        //compilation error
        // Person = new Person ("Milan");
        Child child1 = new Child ("Bob");
        //overriden method called after the constructor completes
        child1.printName();
        //overriden method called after the constructor completes
        Person child2 = new Child ("Alice");
        child1.printName();
    } 
    
}