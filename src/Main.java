import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //this 'getIn' is the input of the user to the program inorder to simulate the rocket and its parameters...
        Scanner getIn = new Scanner(System.in);
        //
        FuelSystem objFuel = new FuelSystem();
        EngineSystem objEngine = new EngineSystem();
        DisplayConsole objPanel = new DisplayConsole();
        //Stage 1 of the Process is loading the fuel oxygen and hydrogen
        objFuel.loadingFuel(getIn);
        //Stage 2 is inputs the amount of engine to the rocket
        objEngine.setNo_engine(getIn);

        while (objFuel.getFuel() > 0){
            //this process calculates the amount of current fuel on the rocket and the fuel rate consumption of the rocket
            objFuel.calculateFuel(objEngine.getEngineFuelUse());
            objPanel.upperPanel(objEngine.getNo_engine(), objFuel.getInitialFuel(), objFuel.getFuel());
        }
    }
}