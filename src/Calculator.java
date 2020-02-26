import java.util.Scanner;

public class Calculator {

    public static void main (String [] args) {

        System.out.println("1. Add" + '\n' + "2. Subtract" + '\n' + "3. Multiply" + '\n' + "4. Divide");
        Scanner scan = new Scanner(System.in);
        int x;
        x = scan.nextInt();



    }



    public double add(double num1, double num2) {
        return num1 + num2;
    }


    public double subtract(double num1, double num2) {
        return num1 - num2;
    }


    public double multiply(double num1 , double num2) {
        return num1 * num2;
    }


     //@throws ArithmeticException If the divisor is 0.

    public double divide(double num1, double num2) throws ArithmeticException {
        if ((int)num2 == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }

        return num1 / num2;
    }




    }








