package HomeWork4_23;

import java.util.Arrays;
import java.util.Scanner;


public class TwoMax {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        int max_1 = array[0];
        int max_2 = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_1) {
                max_1 = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max_2 && array[i] < max_1) {

                max_2 = array[i];
            }
        }
        System.out.println("Max 1: " + max_1 + "  Max 2:  " + max_2);


    }
}
