package HomeWork4_29;

import java.util.Scanner;

public class Square {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        String space = " ";

        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }

        for (int i = 0; i < size - 3; i++) {
            space+=" ";
        }

        for (int i = 0; i < size - 2; i++) {
            System.out.print("\n*" + space + "*");
        }
        System.out.println("");
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }



    }
}
