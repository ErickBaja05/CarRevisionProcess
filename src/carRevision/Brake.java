package carRevision;
import java.util.Scanner;
import java.util.Locale;

public class Brake {
    private String brakeType;
    private int brakeHeating;
    private int brakePadsStatus;
    private int brakeMaxVelocitySupported;
    private String brakeOverallStatus;

    public Brake(){
        this.brakeType = "";
        this.brakeHeating = 0;
        this.brakePadsStatus = 0;
        this.brakeMaxVelocitySupported = 0;
        this.brakeOverallStatus = "";
    }
    public Brake(String brakeType, int brakeHeating, int brakeMaxVelocitySupported){
        this.brakeType = brakeType;
        this.brakeHeating = brakeHeating;
        this.brakeMaxVelocitySupported = brakeMaxVelocitySupported;
        this.brakeOverallStatus = "";
        this.brakePadsStatus = 0;
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
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
            System.out.println("Ingrese la temperatura de las pastillas de freno en grados Celsius: ");
            try{
                brakeHeating = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
            }
            if(brakeHeating < 100)
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
            System.out.println("Ingrese una calificacion para las pastillas del motor en un rango entero 1-10: ");
            try{
                brakePadsStatus = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
            }
            if(brakePadsStatus < 1 || brakePadsStatus > 10)
                System.out.println("El valor ingresado no es valido");
            else {
                validInput = true;
            }
        }
        this.brakePadsStatus = brakePadsStatus;
    }

    public int getBrakeMaxVelocitySupported() {
        return brakeMaxVelocitySupported;
    }

    public void setBrakeMaxVelocitySupported(int brakeMaxVelocitySupported) {
        this.brakeMaxVelocitySupported = brakeMaxVelocitySupported;
    }

    public String getBrakeOverallStatus() {
        return brakeOverallStatus;
    }

    public void setBrakeOverallStatus(String brakeOverallStatus) {
        this.brakeOverallStatus = brakeOverallStatus;
    }
}
