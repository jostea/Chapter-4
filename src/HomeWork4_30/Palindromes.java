package HomeWork4_30;

import java.util.Scanner;

public class Palindromes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        char[] warray = word.toCharArray();

        while (istPalindrom(warray) == false) {
            System.out.println("Wrong digits!");
            word = input.nextLine();
            warray = word.toCharArray();
        }
        if (istPalindrom(warray))
            System.out.println(istPalindrom(warray));
    }

    public static boolean istPalindrom(char[] word) {
        int i1 = 0;
        int i2 = word.length - 1;
        if (word.length <= 5) {
            while (i2 > i1) {
                if (word[i1] != word[i2]) {
                    return false;
                }
                ++i1;
                --i2;
            }
            return true;
        } else return false;
    }
}

