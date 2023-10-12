//creating and manipulating an Account object

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        //create a scanner object to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //create an Account object and assign it to myAccount
        Account myAccount = new Account();

        //display initial value of name (null)
        System.out.printf("Initial name is %s%n%n", myAccount.getName());

        //prompt for and read name
        System.out.println("Please enter the name:");
        String theName = input.nextLine();
        myAccount.setName(theName);
        System.out.println();

        //display the name strored in object myAccount
        System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());
    }
}