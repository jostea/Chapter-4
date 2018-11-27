package HomeWork4_35;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double AB = Math.abs(input.nextDouble());
        double BC = Math.abs(input.nextDouble());
        double CA = Math.abs(input.nextDouble());


        if (!(AB == 0 && BC == 0 && CA == 0)) {
            if ((AB+BC)>CA&&(AB+CA)>BC&&(BC+CA)>AB){
                System.out.println("Correct size for triangle!");
            }   else
                System.out.println("Uncorrect size!");


        }

    }
}
