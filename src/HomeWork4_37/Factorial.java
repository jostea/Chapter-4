package HomeWork4_37;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static double calculateMathConstant(double result, int e) {
        for (int i = 1; i <= e; i++) {

            result += (1 / factorial(i));
        }
        return result + 1;
    }

    public static void main(String[] args) {
        Scanner

                input = new Scanner(System.in);

        System.out.print("Enter n!: ");
        int n = input.nextInt();

        System.out.print("Enter e: ");
        int e = input.nextInt();
        double result = 1;


        System.out.println("Factorial of " + n + " : " + factorial(n));
        System.out.println("Mathematical constant e: " + calculateMathConstant(result, e));

    }


}
