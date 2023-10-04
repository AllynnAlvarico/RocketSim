import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this 'getIn' is the input of the user to the program inorder to simulate the rocket and its parameters...
        Scanner getIn = new Scanner(System.in);
        //
        FuelSystem objFuel = new FuelSystem();
        EngineSystem objEngine = new EngineSystem();
        DisplayConsole objPanel = new DisplayConsole();
        ClockSystem objTime = new ClockSystem();
        //Stage 1 of the Process is loading the fuel oxygen and hydrogen
        objFuel.loadingFuel(getIn);
        //Stage 2 is inputs the amount of engine to the rocket
        objEngine.setNo_engine(getIn);
        /*This is the initial reading for the rocket system*/
        objPanel.upperPanel(objEngine.getNo_engine(), objEngine.getEngineFuelUse(), objFuel.getInitialFuel(), objFuel.getFuel(), objTime.getMinute(), objTime.getSecond());
        while (objFuel.getFuel() > 0){
            /* this process calculates the amount of current fuel on the rocket and the fuel rate consumption of the rocket */
            objFuel.calculateFuel(objEngine.getEngineFuelUse());
            /*The code line 22 and 23 sets the clock and will enable to display without any problem*/
            objTime.setTick();
            objTime.setTime(objTime.getTick());
            /*This segment of code will display the panels that are relevant to the rocket*/
            objPanel.upperPanel(objEngine.getNo_engine(), objEngine.getEngineFuelUse(), objFuel.getInitialFuel(), objFuel.getFuel(), objTime.getMinute(), objTime.getSecond());
        }
    }
}