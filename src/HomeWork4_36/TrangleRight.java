package HomeWork4_36;

import java.util.Scanner;

public class TrangleRight {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("AB: ");
        double AB = Math.abs(input.nextDouble());
        System.out.print("BC: ");
        double BC = Math.abs(input.nextDouble());
        System.out.print("CA: ");
        double CA = Math.abs(input.nextDouble());

        if (!(AB == 0 && BC == 0 && CA == 0)) {
            if (BC == Math.sqrt(Math.pow(AB, 2) - Math.pow(CA, 2)) || CA == Math.sqrt(Math.pow(AB, 2) - Math.pow(BC, 2)) || AB == Math.sqrt(Math.pow(BC, 2) - Math.pow(CA, 2))) {
                System.out.println("this size can be Trangle Right ");
            }else
                System.out.println("Wrong size!");
        }
    }
}
