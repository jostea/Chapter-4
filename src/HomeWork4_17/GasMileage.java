package HomeWork4_17;


import java.util.Scanner;

public class GasMileage {
    Scanner input = new Scanner(System.in);

    private double spentGas;
    private double mile;


    public GasMileage() {
        setMile(input.nextDouble());
        setSpentGas(input.nextDouble());
    }

    public double calculateFuelConsumption() {
        return getMile() / getSpentGas();
    }


    public double getSpentGas() {
        return spentGas;
    }

    public void setSpentGas(double spentGas) {
        this.spentGas = spentGas;
    }

    public double getMile() {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    public static void main(String[] args) {
        System.out.println(new GasMileage().calculateFuelConsumption());

    }

}
