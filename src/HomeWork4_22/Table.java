package HomeWork4_22;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 1; i < N + 1; i++) {
            System.out.println(i+"        "+i * 10 + "        " + i * 100 + "        " + i * 1000);
        }
    }
}
