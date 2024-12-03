package carRevision;
import java.util.Scanner;
import java.util.Locale;

public class Tire {

    private int tiredId;
    private double tireTreading;
    private double tirePresion;
    private String overallStatus;
    public Tire(){
        this.tiredId = 0;
        this.tireTreading = 0;
        this.tirePresion = 0;
    }
    public Tire(int tiredId, double tireTreading, double tirePresion){

        this.tiredId = tiredId;
        this.tireTreading = tireTreading;
        this.tirePresion = tirePresion;

    }

    public int getTiredId() {
        return tiredId;
    }

    public void setTiredId(int tiredId) {
        this.tiredId = tiredId;
    }

    public double getTireTreading() {
        return tireTreading;
    }

    public void setTireTreading(Scanner sc) {

        boolean validInput = false;
        int TireTreading = 1;

        while (!validInput){
            System.out.println("Ingrese el estado de la banda de rodadura de las llantas: ");
            try {
                TireTreading = Integer.parseInt(sc.nextLine());
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
        this.tireTreading = tireTreading;
    }

    public double getTirePresion() {
        return tirePresion;
    }

    public void setTirePresion(Scanner sc) {

        boolean validInput = false;
        int TirePresion = 1;

        while (!validInput){
            System.out.println("Ingrese el valor de la presión de la llanta en libras por pulgada cuadrada (psi): ");
            try {
                TirePresion = Integer.parseInt(sc.nextLine());
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
        this.tirePresion = tirePresion;
    }

    public void setTireOverallStatus(String overallStatus) {
        this.overallStatus = overallStatus;
    }
    public String getTireOverallStatus() {
        return this.overallStatus;
    }
}
