package carRevision;
import java.util.Scanner;

public class Brake {
    private int brakeHeating;
    private int brakePadsStatus;
    private String brakeOverallStatus;

    public Brake(){
        this.brakeHeating = 0;
        this.brakePadsStatus = 0;
        this.brakeOverallStatus = "";
    }
    public Brake(int brakeHeating, int brakePadsStatus){
        this.brakeHeating = brakeHeating;
        this.brakeOverallStatus = "";
        this.brakePadsStatus = brakePadsStatus;
    }

    public int getBrakeHeating() {
        return brakeHeating;
    }

    public void setBrakeHeating(Scanner sc) {
        //The following function allows the inspector to enter the temperature of the brake pads' heating.
        boolean validInput = false;
        int brakeHeating = 100;
        while(!validInput)
        {
            System.out.println("Ingrese la temperatura de las pastillas de freno en grados Celsius en enteros: ");
            try{
                brakeHeating = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(brakeHeating < 50)
                System.out.println("Revise las condiciones de frenado e intente nuevamente");
            else {
                validInput = true;
            }
        }
        this.brakeHeating = brakeHeating;
    }

    public int getBrakePadsStatus() {
        return brakePadsStatus;
    }

    public void setBrakePadsStatus(Scanner sc) {
        boolean validInput = false;
        int brakePadsStatus = 1;
        //The following function allows the inspector to assign a score to the brake pads' status.
        while(!validInput)
        {
            System.out.println("Ingrese una calificacion para las pastillas del freno en un rango entero 1-10: ");
            try{
                brakePadsStatus = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(brakePadsStatus < 1 || brakePadsStatus > 10)
                System.out.println("El valor ingresado no es valido");
            else {
                validInput = true;
            }
        }
        this.brakePadsStatus = brakePadsStatus;
    }

    public String getBrakeOverallStatus() {
        return brakeOverallStatus;
    }

    public void setBrakeOverallStatus(String brakeOverallStatus) {
        this.brakeOverallStatus = brakeOverallStatus;
    }
}
