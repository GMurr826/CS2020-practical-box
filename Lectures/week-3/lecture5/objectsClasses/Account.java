//Account class with a constructor that initialises the name

public class Account {
    private String name; // instance variable

    //constructor initialises name with parameter name
    public Account(String name) { //constructor name is a class name
        this.name = name;
    }

    //set name method
    public void setName(String name) {
        this.name = name;
    }

    //get name method
    public String getName() {
        return name;
    }
}