public class DisplayConsole {

    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public void upperPanel(int p_NoEngine, int p_FuelConsumption, int p_InitialFuel, int p_FuelGauge){
        setSeconds();
        setMinutes();
        //setLeftSide(p_NoEngine, p_FuelConsumption);
        //setMiddleSide(p_InitialFuel, p_FuelGauge);
        //setRightSide();
        String upPanelString = "Engine: %d   Rate: %d/s   Fuel Gauge: %d/%d   Time Elapse: %02d:%02d%n";
        System.out.println("------------------------------------------------------");
        System.out.printf(upPanelString, p_NoEngine, p_FuelConsumption, p_FuelGauge,p_InitialFuel,getMinutes(),getSeconds());
    }
    public void middlePanel(){

    }
    public void lowerPanel(){

    }
   // public void setLeftSide(int p_NoEngine, int p_FuelConsumption){

//        System.out.print("Engine: " + p_NoEngine);
//        System.out.print("  Rate: " + p_FuelConsumption + "/s");
    //}
//    public void setMiddleSide(int p_InitialFuel,int p_FuelGauge){
//        System.out.print("      Fuel Gauge: " + p_FuelGauge + "/" + p_InitialFuel);
//    }
//    public void setRightSide(){
//        String secondPadded = String.format("%02d", getSeconds());
//        String minutePadded = String.format("%02d", getMinutes());
//        System.out.println("      Time Elapse: " +  minutePadded + ":" + secondPadded);
//    }
    public void setSeconds(){
        seconds += 1;
    }
    public void setMinutes() {
        if (getSeconds() > 60 ){
            seconds = 0;
            minutes += 1;
        }
    }
    public void setHours() {
        if (getMinutes() > 60 ){
            minutes = 0;
            hours += 1;
        }
    }
    public int getSeconds() {return seconds;}
    public int getMinutes() {return minutes;}
    public int getHours() {return hours;}
}
