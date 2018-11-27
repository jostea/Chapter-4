package HomeWork4_21;


import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number=0;
        int counter = 0;
        int largest;


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            number = array[i];
        }

        largest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (largest < array[i]) {
                largest = array[i];
            }
            counter++;
        }


        System.out.println(number+" "+largest+" "+counter);

    }

}
