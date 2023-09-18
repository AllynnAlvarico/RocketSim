import java.util.InputMismatchException;
import java.util.Scanner;

public class FuelSystem {
    EngineSystem engine =new EngineSystem();
    final double kg_hydrogen = 0.07078;//kg
    final double kg_oxygen = 1.1417;//kg
    private int l_oxygen = 0;//liters --- users input
    private int l_hydrogen = 0;//liters --- users input
    private int requiredHydrogen = 0;
    private int mass_hydrogen = 0;
    private int mass_oxygen = 0;
    private boolean oxygenFilled= false;
    private boolean hydrogenFilled= false;
    private boolean bothFilled = false;
    private int fuel = 0;
    private int fuelEngine = 0;
    private int currentFuel = 0;
    private int fuelMass =0;
    public FuelSystem(){

    }
    /*Fuel loading process stage*/
    /*this process takes the "Scanner 'in'" as the parameter on the loading process
    * while statement here is if both 2 variable has been filled in "Oxygen & Hydrogen"
    * starting condition is both are false then the program will proceed to the 'try and catch' to */
    public void loadingFuel(Scanner in) {
            while (!bothFilled) {
                try {
                    if (!oxygenFilled) { //Stage 1
                        setOxygenFuel(in);
                        logOxygen();
                        oxygenFilled = true;
                    }
                    setHydrogenReq();
                    System.out.println("\nHydrogen needs to be equal or more than " + getRequiredHydrogen());
                    if (!hydrogenFilled) { //Stage 2
                        setHydrogenFuel(in);
                        while(getL_hydrogen() < getRequiredHydrogen() ){
                            setHydrogenFuel(in);
                        }
                        logHydrogen();
                        hydrogenFilled = true;
                    }
                    if (oxygenFilled && hydrogenFilled) { //Stage 3
                        logFuelMass();
                        logFuelGauge();
                    } else {
                        System.out.println("Error on fueling system!");
                        System.exit(0);
                    }
                    bothFilled = true; // Stage 4
                    engine.setNo_engine(in);
                }catch (InputMismatchException e) {
                    System.out.println("Invalid input! Please enter numeric values.");
                    in.nextLine();
                }
            }
    }
    private void logOxygen(){
        setOxygenMass();
        System.out.println("Rockets fuel oxygen: "+ l_oxygen + "L");
        System.out.println("Rockets fuel oxygen mass: "+ String.format("%.0f", getMass_oxygen()) +"kg");
    }
    private void logHydrogen(){
        setHydrogenMass();
        System.out.println("Rockets fuel hydrogen liters: "+ l_hydrogen + "L");
        System.out.println("Rockets fuel hydrogen mass: "+ String.format("%.0f", getMass_hydrogen()) +"kg");
    }
    private void logFuelMass(){
        calculateFuelMass();
        System.out.println("\nTotal Rockets Fuel Mass: "+ getFuelMass()+"kg");
    }
    private void logFuelGauge(){
        setFuel();
        System.out.println("Fuel Gauge: " + getFuel());
    }
    /*Mass Calculation*/
    private void setOxygenMass(){mass_oxygen = (int)(l_oxygen * kg_oxygen);}
    private void setHydrogenMass(){mass_hydrogen = (int)(l_hydrogen * kg_hydrogen);}
    private void setHydrogenReq(){requiredHydrogen = (int)((int)getL_oxygen() * 14.3);}
    private void calculateFuelMass(){fuelMass = mass_hydrogen + mass_oxygen;}
    /*Fuel Calculation*/
    private void setFuel(){
        double hydrogenFuel = getL_hydrogen()/14.3;
        fuel = (int)(getL_oxygen() + (float)hydrogenFuel);
    }
    private void setOxygenFuel(Scanner in){
        System.out.println("Set Rockets fuel oxygen (L): ");
        l_oxygen = in.nextInt();
    }
    private void setHydrogenFuel(Scanner in){
        System.out.println("Set Rockets fuel hydrogen (L):");
        l_hydrogen = in.nextInt();
    }
    public void calculateFuel(){
        if (getFuel() > 0){
            System.out.println("Fuel Gauge: " + getFuel());
            fuel -= this.fuelEngine;
        }
        if (getFuel() <0){
            fuel = 0;
            System.out.println("Fuel Gauge: " + getFuel());
        }
    }
    private void fuelPercentage (){

    }
    public float getL_oxygen(){return l_oxygen;}
    public float getL_hydrogen(){return l_hydrogen;}
    public int getRequiredHydrogen(){return requiredHydrogen;}
    public double getMass_oxygen(){return mass_oxygen;}
    public double getMass_hydrogen(){return mass_hydrogen;}
    public int getFuelMass(){return this.fuelMass;}
    public int getFuel(){return fuel;}
    public int getCurrentFuel(){return currentFuel;}
}
