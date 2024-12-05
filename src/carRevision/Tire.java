package carRevision;
import java.util.Scanner;

public class Tire {

    private double tireTreading;
    private double tirePresion;
    private String overallStatus;

    public Tire(){
        this.tireTreading = 0;
        this.tirePresion = 0;
    }


    public double getTireTreading() {
        return tireTreading;
    }

    public void setTireTreading(Scanner sc) {

        boolean validInput = false;
        double TireTreading = 0.0;

        while (!validInput){
            System.out.println("Ingrese el estado de la banda de rodadura de las llantas: ");
            try {
                TireTreading = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("El valor ingresado no es válido. Por favor, ingrese un valor válido.");
                continue;
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente.");
                continue;
            }

            if (TireTreading < 1.66){ //si la llanta tiene menos de 1.66 tiene que ser cambiada obligatoriamente
                System.out.println("Revise el estado de las llantas e intente nuevamente.");

            } else {
                validInput = true;
            }

        }
        this.tireTreading = TireTreading;
    }

    public double getTirePression() {
        return this.tirePresion;
    }

    public void setTirePression(Scanner sc) {

        boolean validInput = false;
        double TirePresion = 0.0;
        System.out.println("*****INFORMACION SOBRE LAS LLANTAS*******");
        while (!validInput){
            System.out.println("Ingrese el valor de la presión de la llanta en libras por pulgada cuadrada (psi): ");
            try {
                TirePresion = Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("El valor ingresado no es válido. Por favor, ingrese un valor válido.");
                continue;
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente.");
                continue;
            }
            if (TirePresion < 20){
                System.out.println("Revise la presión de las llantas e intente nuevamente.");

            } else {
                validInput = true;
            }
        }
        this.tirePresion = TirePresion;
    }

    public void setTireOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }
    public String getTireOverallStatus() {
        return this.overallStatus;
    }
}
