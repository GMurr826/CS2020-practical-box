package calculator;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        int c = 2;
        boolean test = false;

        Greet greet = new Greet();

        System.out.println("Welcome to the calculator\nType 'exit' at any point to stop the program");
        System.out.println("After entering the first two numbers you may enter '=' to get the result\noryoucan enter up to 8 more numbers");

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
            total = calculation.addNumbers();
        }

        else if (operator.equals("-")) {
            total = calculation.subtractNumbers();
        }

        else if (operator.equals("*")) {
            total = calculation.multiplyNumbers();
        }

        while (true) {
            System.out.println("Enter = to get your total or enter another operator (+, -, *): ");
            op = input.next();
            if (isEquals(op) == true) {
                break;
            }
            operator = parse_operators(op);

            System.out.println("Enter a number: ");
            x = input.next();
            num1 = validNum(x);

            MyCalculator calculation2 = new MyCalculator(total,num1);
            c++;

            if (operator.equals("+")) {
                total = calculation2.addNumbers();
            }

            else if (operator.equals("-")) {
                total = calculation2.subtractNumbers();
            }

            else if (operator.equals("*")) {
                total = calculation2.multiplyNumbers();
            }

            if (c == 10) {
                break;
            }
        }
        System.out.printf("Your total is %f%n", total);

        calculation.printVersion();

        
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

    public static boolean isEquals(String x) {
        if (x.equals("=") == true) {
            return true;
        }
        else {
            return false;
        }
    }
}