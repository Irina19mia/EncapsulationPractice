package app;

public class Car {

    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Car is working now.");
    }

    private void startElectricity() {
        System.out.println("Electricity is on.");
    }

    private void startCommand() {
        System.out.println("Start command.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system started.");
    }
}
