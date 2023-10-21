package calculator;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Greet greet = new Greet();

        System.out.println("Welcome to the calculator\nType 'exit' at any point to stop the program");

        while (true) {
            System.out.println("Enter the first number: ");
            String x = input.next();
            double num1 = validNum(x);

            System.out.println("Enter the operator (+, -, *): ");
            String op = input.next();
            String operator = parse_operators(op);

            System.out.println("Enter the second number: ");
            String y = input.next();
            double num2 = validNum(y);
        
            MyCalculator calculation = new MyCalculator(num1,num2);

            if (operator.equals("+")) {
                System.out.println(calculation.addNumbers());
            }

            else if (operator.equals("-")) {
                System.out.println(calculation.subtractNumbers());
            }

            else if (operator.equals("*")) {
                System.out.println(calculation.multiplyNumbers());
            }

            calculation.printVersion();
        }
        
    }
    public static double validNum(String x) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        double i = 0;
        while (valid == false) {
            if (x.equals("exit") == true) {
                valid = true;
                System.exit(0);
            }
            try {
                i = Double.parseDouble(x);
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Enter an integer or 'exit' to stop program");
                x = input.next();
            }
        }
        return i;
    }

    public static String parse_operators(String x) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String i = "";
        while (valid == false) {
            if (x.equals("exit") == true) {
                valid = true;
                System.exit(0);
            }
            try {
                if ((x.equals("+")) == true || (x.equals("-")) == true || (x.equals("*")) == true) {
                    i = x;
                    valid = true;
                }
                else{
                    throw new IllegalArgumentException();
                }
            }
            catch (IllegalArgumentException e) {
                System.out.println("Enter '+', '-', '*', or type 'exit' to stop program");
                x = input.next();
            }
        }
        return i;
    }
}