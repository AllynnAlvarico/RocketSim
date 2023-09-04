import java.util.InputMismatchException;
import java.util.Scanner;

public class FuelSystem {
    final double kg_hydrogen = 0.07078;//kg
    final double kg_oxygen = 1.1417;//kg
    private int l_oxygen = 0;//liters --- users input
    private int l_hydrogen = 0;//liters --- users input
    private int mass_hydrogen = 0;
    private int mass_oxygen = 0;
    private boolean oxygenFilled= false;
    private boolean hydrogenFilled= false;
    private boolean bothFilled = false;
    private float fuel = 0;
    private int currentFuel = 0;//new
    private int fuelMass =0;
    public FuelSystem(){
//        bothFilled = a_valid;
    }
    /*Fuel loading process stage*/
    public void loadingFuel(Scanner in) {
            while (!bothFilled) {
                try {
                    if (!oxygenFilled) { //Stage 1
                        System.out.println("Set Rockets fuel oxygen (L): ");
                        l_oxygen = in.nextInt();
                        logOxygen();
                        oxygenFilled = true;
                    }
                    if (!hydrogenFilled) { //Stage 2
                        System.out.println("Set Rockets fuel hydrogen (L): ");
                        l_hydrogen = in.nextInt();
                        logHydrogen();
                        hydrogenFilled = true;
                    }
                    if (oxygenFilled && hydrogenFilled) { //Stage 3
                        logFuelMass();
                    } else {
                        System.out.println("Error on fueling system!");
                        System.exit(0);
                    }
                    bothFilled = true; // Stage 4
                }catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter numeric values.");
                    in.nextLine();
                }
            }
    }
    private void logOxygen(){
        setOxygenMass();
        System.out.println("Rockets fuel oxygen liters: "+ l_oxygen);
        System.out.println("Rockets fuel oxygen mass: "+ getMass_oxygen()+"kg");
    }
    private void logHydrogen(){
        setHydrogenMass();
        System.out.println("Rockets fuel hydrogen liters: "+ l_hydrogen);
        System.out.println("Rockets fuel hydrogen mass: "+ getMass_hydrogen()+"kg");
    }
    private void logFuelMass(){
        calculateFuelMass();
        System.out.println("Total Rockets Fuel Mass: "+ getFuelMass()+"kg");
    }
    /*Mass Calculation*/
    private void setOxygenMass(){mass_oxygen = (int)(l_oxygen * kg_oxygen);}
    private void setHydrogenMass(){mass_hydrogen = (int)(l_hydrogen * kg_hydrogen);}
    private void calculateFuelMass(){fuelMass = mass_hydrogen + mass_oxygen;}
    /*Fuel Calculation*/
    private void setFuel(){
        fuel = (getL_oxygen() + getL_hydrogen())/ 4;
    }
    public float getL_oxygen() {return l_oxygen;}
    public float getL_hydrogen() {return l_hydrogen;}
    public double getMass_oxygen(){return mass_oxygen;}
    public double getMass_hydrogen(){return mass_hydrogen;}
    public int getFuelMass() {return this.fuelMass;}
}
