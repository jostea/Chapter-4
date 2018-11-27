package HomeWork4_27;

import java.util.Scanner;

public class Dangling {

    public static void main(String[] args) {

        int x=9;
        int y=11;
        System.out.println("when x=9 and y=11");
        if (x < 10)

            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");

        System.out.println("when x=11 and y=9");
        x=11;
        y=9;
        if (x < 10)
            if (y > 10)
                System.out.println("*****");
            else
                System.out.println("#####");
        System.out.println("$$$$$");


        System.out.println("when x=9 and y=11 ");
        x=9;
        y=11;
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        }

        System.out.println("when x=11 and y=9");
        x=11;
        y=9;
        if (x < 10)
        {
            if (y > 10)
                System.out.println("*****");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
        }
    }
}
