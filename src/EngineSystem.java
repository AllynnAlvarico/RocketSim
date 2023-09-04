import java.util.Scanner;

public class EngineSystem extends FuelSystem{
//    FuelSystem fuelSystem = new FuelSystem();
    final private int stockUse = 2;
//    final private int lvl1Consumption = 2;
//    final private int lvl2Consumption = 3;
//    final private int lvl3Consumption = 4;
    private int no_engine = 0;
    private int engineFuelConsumption = 0;
    public EngineSystem(){
    }
    public void setNo_engine(Scanner in){
        System.out.println("Enter Number of Engine: ");
        no_engine = in.nextInt();
        System.out.println("Number of Engine: "+getNo_engine());
    }
    private void setStockUse(){
        engineFuelConsumption = getNo_engine() * stockUse;
    }
    public void calculateFuelUse(){

    }
    public int getEngineFuelUse(){return engineFuelConsumption;}
    public int getNo_engine(){return no_engine;}


}
