package HomeWork4_18;

import java.util.Scanner;

public class Costumer {

    private int accountNumber;
    private int beginningBalance;
    private int charges;
    private int credits;

    public Costumer() {
        Scanner input = new Scanner(System.in);

        this.beginningBalance = input.nextInt();
        this.charges = input.nextInt();
        this.credits = input.nextInt();
        this.accountNumber = input.nextInt();
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBeginningBalance() {
        return beginningBalance;
    }

    public int getCharges() {
        return charges;
    }

    public int getCredits() {
        return credits;
    }

    public int calculateNewBalance() {
        return beginningBalance + charges - credits;
    }

    public static boolean checkBalanceExcess(int credit) {
        return credit < 0;
    }

    public static void printResultOfCheckingBalance(Costumer costumer) {
        if(checkBalanceExcess(costumer.calculateNewBalance())) {
            System.err.println("Credit of costumer " + costumer.getAccountNumber() + " exceeded");
        }
    }

    public static void main(String[] args) {

        Costumer costumer1 = new Costumer();
        Costumer costumer2 = new Costumer();

        printResultOfCheckingBalance(costumer1);
        printResultOfCheckingBalance(costumer2);



    }
}
