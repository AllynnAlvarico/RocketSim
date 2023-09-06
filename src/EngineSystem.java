import java.util.Scanner;

public class EngineSystem {
    final private int fuelUse = 2;
    private int no_engine = 0;
    private int engineFuelConsumption = 0;
    public EngineSystem(){
    }
    public void setNo_engine(Scanner in){
        System.out.println("Enter Number of Engine: ");
        no_engine = in.nextInt();
        System.out.println("Number of Engine: "+getNo_engine());
        setFuelConsumption();
        System.out.println("Fuel Consumption Rate: " + getEngineFuelUse()+"/s\n");
    }
    private void setFuelConsumption(){
        engineFuelConsumption = getNo_engine() * fuelUse;
    }
    public int getEngineFuelUse(){return engineFuelConsumption;}
    public int getNo_engine(){return no_engine;}


}
