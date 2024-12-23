package carRevision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExhaustPipe {

    private double gasEmisionValue;
    private String exhaustPipeStatus;

    public ExhaustPipe() {

        this.gasEmisionValue = 0;
        this.exhaustPipeStatus = "";
    }



    public String getExhaustPipeStatus(){
        return this.exhaustPipeStatus;
    }

    public void setExhaustPipeStatus(String status){
        this.exhaustPipeStatus = status;
    }



    public double getGasEmisionValue() {
        return this.gasEmisionValue;
    }

    public void setGasEmisionValue(Scanner sc, Car car) {
        double gasEmisionValue = 0;
        boolean validInput = false;
        System.out.println("*****INFORMACION SOBRE EL TUBO DE ESCAPE*******");
        if (car.getCarEngine().getEngineType().equals("ELECTRICO")) {
            System.out.println("Los autos electricos tiene cero emisiones de gases");
            gasEmisionValue = 0;
        } 
        else {
            do {
                try {
                    System.out.println("Ingrese el nivel de emisión ");
                    gasEmisionValue = sc.nextDouble();

                    if (gasEmisionValue >= 0) {
                        this.gasEmisionValue = gasEmisionValue;
                        validInput = true;
                    } else {
                        System.out.println("Por favor, ingrese un valor válido");
                    }
                } catch (InputMismatchException e) {
                    sc.next();
                    System.out.println("Por favor, ingrese un valor válido");
                }
            } while (!validInput);
        }
    }

}
