//Employee class with references to other objects

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    //constructor to initialise name, birth date and hire date
    public Employee(String firstName, String lastName, Date birthDate, Date hireDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    //convert Employee to string format
    @Override
    public String toString() {
        return String.format("%s, %-10sHired: %-10sBirthday: %s", lastName, firstName, hireDate, birthDate);
    }
}