import java.sql.SQLOutput;

public class DisplayConsole {
    public void upperPanel(int p_NoEngine, int p_FuelConsumption, int p_InitialFuel, int p_FuelGauge, int p_minute, int p_second){
        String upPanelString = "Engine: %d\tRate: %d/s\tFuel Gauge: %d/%d\tTime Elapse: %02d:%02d%n";
        System.out.println("------------------------------------------------------");
        System.out.printf(upPanelString, p_NoEngine, p_FuelConsumption, p_FuelGauge,p_InitialFuel,p_minute,p_second);
    }
    public void middlePanel(){
        System.out.printf("Velocity: %.2f\tAltitude: %d");
    }
    public void lowerPanel(){

    }
    /*  public void setLeftSide(int p_NoEngine, int p_FuelConsumption){

    System.out.print("Engine: " + p_NoEngine);
    System.out.print("  Rate: " + p_FuelConsumption + "/s");
    }
    public void setMiddleSide(int p_InitialFuel,int p_FuelGauge){
    System.out.print("      Fuel Gauge: " + p_FuelGauge + "/" + p_InitialFuel);
    }
    public void setRightSide(){
    String secondPadded = String.format("%02d", getSeconds());
    String minutePadded = String.format("%02d", getMinutes());
    System.out.println("      Time Elapse: " +  minutePadded + ":" + secondPadded);
    }*/
}
