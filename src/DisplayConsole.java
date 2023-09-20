public class DisplayConsole {

    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;

    public void upperPanel(int p_NoEngine, int p_InitialFuel, int p_FuelGauge){
        setLeftSide(p_NoEngine, p_InitialFuel, p_FuelGauge);

    }
    public void middlePanel(){

    }
    public void lowerPanel(){

    }
    public void setLeftSide(int p_NoEngine,int p_InitialFuel,int p_FuelGauge){
        setSeconds();
        setMinutes();
        System.out.print("Engine: " + p_NoEngine);
        System.out.print("      Fuel Gauge: " + p_FuelGauge + "/" + p_InitialFuel);
        String secondPadded = String.format("%02d", getSeconds());
        String minutePadded = String.format("%02d", getMinutes());
        System.out.println("      Time Elapse: " +  minutePadded+":"+secondPadded);
        System.out.println("------------------------------------------------------");
    }
    public void setMiddleSide(){}
    public void setRightSide(){}


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
