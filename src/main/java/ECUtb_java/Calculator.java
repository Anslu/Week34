package ECUtb_java;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        boolean forEver = true;
        while (forEver) {

            Scanner ScanObjekt = new Scanner(System.in);
            double num1 = 0;
            double num2 = 0;
            double result = 0;
            char operator = '+';

            System.out.println("Welcome to the simple calculator ");
            System.out.println("Please, choose your first number: ");
            num1 = ScanObjekt.nextDouble();
            ScanObjekt.nextLine();
            System.out.println("Please choose your character: + - * /: ");
            operator = ScanObjekt.nextLine().charAt(0);
            System.out.println("Choose your second number: ");
            num2 = ScanObjekt.nextDouble();
            ScanObjekt.nextLine();

            switch (operator) {
                case '+':
                    result = addition(num1, num2);
                    System.out.println("the result is: " +result);
                    break;
                case '-':
                    result = minus(num1, num2);
                    System.out.println("the result is: " +result);
                    break;
                case '*':
                    result = multi(num1, num2);
                    System.out.println("the result is: " +result);
                    break;
                case '/':
                    result = divided(num1, num2);
                    System.out.println("the result is: " +result);
                    break;
                default:
                    System.out.println("You have entered a wrong value i character field" + operator);
            }

        }

        }
    public static double addition(double num1, double num2) {
        double result;
        result=num1+num2;
        return result;
    }
    public static double minus(double num1, double num2) {
        double result;
        result = num1 - num2;
        return result;
    }
    public static double multi(double num1, double num2) {
        double result;
        result = num1 * num2;
        return result;
    }
    public static double divided(double num1, double num2) {
        double result;
        result = num1 / num2;
        return result;
    }
}