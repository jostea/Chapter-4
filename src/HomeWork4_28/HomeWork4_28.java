package HomeWork4_28;

import java.util.Scanner;

public class HomeWork4_28 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }
        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }

         y=input.nextInt();

        if (y == 8) {
            if (x == 5)
                System.out.println("@@@@@");
        } else {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }


    }
}
