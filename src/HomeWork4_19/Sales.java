package HomeWork4_19;

import java.util.Scanner;

public class Sales {
    private double[] items = {239.99, 129.75, 99.95, 350.89};
    private double[] quantity = new double[4];
    private double sum;

    public Sales() {
        Scanner input = new Scanner(System.in);
        this.items = items;
        this.sum = sum;
    }

    public double[] countQuantity() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < quantity.length; i++) {
            System.out.print("Enter quantity of " + (i + 1) + " item:");
            quantity[i] = input.nextDouble();

            if (quantity[i] < 0) {
                System.out.println("Quantity of item couldn't be negative!");
                System.out.print("Enter quantity of " + (i + 1) + " item:");
                quantity[i] = input.nextDouble();
            }
        }


        return quantity;
    }


    public double calculatePrice() {
        for (int i = 0; i < quantity.length; i++) {
            quantity[i] = items[i] * quantity[i];
            quantity[i] *= 0.09;
            sum += quantity[i];
        }
        return sum + 200;
    }

    public double[] getQuantity() {
        return quantity;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sales order = new Sales();
        order.countQuantity();
        System.out.println("Salary for week: " + order.calculatePrice()+"$");

    }
}