package HomeWork4_37;

import java.util.Scanner;

public class Factorial {



    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static double calculateMathConstant(double resultConst, int e) {

        for (int i = 1; i <= e; i++) {
            resultConst += (1 / factorial(i));
        }
        return resultConst+1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter n!: ");
        int n = input.nextInt();
        int result = 1;

        System.out.print("Enter e: ");
        int e = input.nextInt();
        double resultConst = 1;




        System.out.println("Factorial of "+n+" : "+factorial(n));
       System.out.println("Mathematical constant e: "+calculateMathConstant(resultConst,e));

    }


}
