package HomeWork4_20;

import java.util.Scanner;

public class SalaryCalculator {


    public double hour;
    public double salary;
    public double payment;

    public SalaryCalculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input hours work: ");
        this.hour = input.nextDouble();
        System.out.print("Enter payment: ");
        this.payment = input.nextDouble();
    }



    public double calculateSalary() {
        if (this.hour <= 40) {
            this.salary = hour * payment;
        }
        if (this.hour > 40) {
            double hour1 = this.hour - 40;
            this.salary = ((this.hour * payment) + (hour1 / 2 * payment));
        }
        return this.salary;
    }


    public static void main(String[] args) {

        SalaryCalculator[] employees = new SalaryCalculator[3];


        for (int i = 0; i < employees.length; i++) {
            employees[i] = new SalaryCalculator();
            System.out.println("Salary for "+(i+1)+" employee: "+employees[i].calculateSalary());
        }


    }
}
