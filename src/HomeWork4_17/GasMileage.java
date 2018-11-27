package HomeWork4_17;


import java.util.Scanner;

public class GasMileage {

    private double spentGas;
    private double mile;


    public GasMileage() {
        Scanner input = new Scanner(System.in);
        this.spentGas = input.nextDouble();
        this.mile = input.nextDouble();
    }

    public double calculateFuelConsumtion() {
        return mile / spentGas;
    }

    public static void main(String[] args) {
        GasMileage test=new GasMileage();
        System.out.println(test.calculateFuelConsumtion());

    }

}
