package carRevision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Engine {
    private String engineType;
    private double displacement;
    private int horsepower;
    private int mileage;
    private boolean isOperational;
    private double engineCylinder;
    private boolean engineLeakage;


    public Engine() {
        this.engineType = "";
        this.displacement = 0;
        this.horsepower = 0;
        this.mileage = 0;
        this.isOperational = true;
    }
    public Engine(String type, double displacement, int horsepower, int mileage) {
        this.engineType = type;
        this.displacement = displacement;
        this.horsepower = horsepower;
        this.mileage = mileage;
        this.isOperational = true;

    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(Scanner sc) {
        boolean validINput = false;
        int engineType;
        do {
            try {
                System.out.println("Ingrese el tipo de motor entre las siguientes opciones:  ");
                System.out.println("1. ELECTRICO");
                System.out.println("2. DIESEL");
                System.out.println("3. HIBRIDO");
                sc.nextInt();
                validINput = true;
            }catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("INGRESE VALORES SOLO ENTRE 1 Y 3");
            }finally {
                sc.nextLine();
            }
        }while(!validINput);
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isOperational() {
        return isOperational;
    }

    public void setOperational(boolean operational) {
        isOperational = operational;
    }

    public boolean isEngineLeakage() {
        return engineLeakage;
    }

    public double getEngineCylinder() {
        return engineCylinder;
    }
}
