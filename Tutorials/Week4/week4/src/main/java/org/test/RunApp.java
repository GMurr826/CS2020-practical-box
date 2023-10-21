package org.test;
import java.util.Scanner;

public class RunApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the calculator\nType 'exit' at any point to stop the program");

        while (true) {
            System.out.println("Enter the first number: ");
            String x = input.next();
            int num1 = validNum(x);

            System.out.println("Enter the operator (+, -, *): ");
            String op = input.next();
            parse_operators(op);

            System.out.println("Enter the second number: ");
            String y = input.next();
            int num2 = validNum(y);
        
            Calculator calculation = new Calculator(num1,num2);

            if (op.equals("+")) {
                System.out.println(calculation.add());
            }

            else if (op.equals("-")) {
                System.out.println(calculation.sub());
            }

            else {
                System.out.println(calculation.mul());
            }

            System.out.println("Calculated using Magic Calculator version " + calculation.version);
        }
        
    }
    public static int validNum(String x) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        int i = 0;
        while (valid == false) {
            if (x.equals("exit") == true) {
                valid = true;
                System.exit(0);
            }
            try {
                i = Integer.parseInt(x);
                valid = true;
            }
            catch (NumberFormatException e) {
                System.out.println("Enter an integer or 'exit' to stop program");
                x = input.next();
            }
        }
        return i;
    }

    public static void parse_operators(String x) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        while (valid == false) {
            if (x.equals("exit") == true) {
                valid = true;
                System.exit(0);
            }
            try {
                if ((x.equals("+")) == false && (x.equals("-")) == false && (x.equals("/")) == false) {
                    System.out.println("Enter '+', '-', '/', or type 'exit' to stop program");
                    throw new IllegalArgumentException();
                }
                else{
                    valid = true;
                }
            }
            catch (IllegalArgumentException e) {
                x = input.next();
            }
        }
    }
}