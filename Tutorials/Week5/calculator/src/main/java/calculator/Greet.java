package calculator;
import java.util.Scanner;

public class Greet implements VersionInfo {
    Scanner input = new Scanner(System.in);

    Greet() {
        System.out.println("What is your name?: ");
        String name = input.next();
        System.out.println("Hello " + name);
        printVersion();
        System.out.println(getAuthorInfo());
    }

    @Override
    public void printVersion() {
        System.out.println("Magic Calculator 2.0");
    }

    @Override
    public String getAuthorInfo() {
        return "No author data available";
    }
}