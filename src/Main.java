import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner getIn = new Scanner(System.in);

        EngineSystem engineSystem = new EngineSystem();


        engineSystem.loadingFuel(getIn);
        engineSystem.setNo_engine(getIn);
    }
}