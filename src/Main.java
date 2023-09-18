import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getIn = new Scanner(System.in);

        FuelSystem fuelSystem = new FuelSystem();
        //EngineSystem engineSystem = new EngineSystem();


        fuelSystem.loadingFuel(getIn);
        while (fuelSystem.getFuel() > 0){
            fuelSystem.calculateFuel();
        }
    }
}