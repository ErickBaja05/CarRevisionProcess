package carRevision;
import java.util.Scanner;
import java.util.Locale;

public class Light {

    private int lightsId;
    private int lightStatus;
    private int lightIntensity;
    private String ligthOverallStatus = "";

    public Light(){
        lightsId = 0;
        lightStatus = 0;
        lightIntensity = 0;
    }
    public Light(int lightsId, int lightStatus, int lightIntensity){

        this.lightsId = lightsId;
        this.lightStatus = lightStatus;
        this.lightIntensity = lightIntensity;

    }

    public int getLightsId() {

        return lightsId;
    }

    public void setLightsId(int lightsId) {

        this.lightsId = lightsId;
    }

    public int getLightStatus() {

        return lightStatus;
    }

    public void setLightStatus(Scanner sc) {
        boolean validInput = false;
        int lightStatus = -1;

        while (!validInput){
            System.out.println("Ingrese el estado de las luces (1 si están en buen estado, 0 si están quemadas): ");
            try {
                lightStatus = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("El valor ingresado no es válido. Por favor, ingrese 0 o 1.");
                continue;
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente.");
                continue;
            }

            if (lightStatus != 0 && lightStatus != 1){
                System.out.println("El estado ingresado no es válido. Ingrese 1 si están en buen estado, 0 si están quemadas");

            } else {
                validInput = true;
            }
        }
        this.lightStatus = lightStatus;
    }

    public int getLightIntensity() {

        return lightIntensity;
    }

    public void setLightIntensity(Scanner sc) {
        boolean validInput = false;
        int lightIntensity = 1;

        while (!validInput){
            System.out.println("Ingrese la intensidad de las luces en un rango entero 1-10, donde 1 es muy bueno y 10 es muy malo: ");
            try {
                lightIntensity = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                System.out.println("El valor ingresado no es válido. Por favor, ingrese 0 o 1.");
                continue;
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente.");
                continue;
            }

            if(lightIntensity < 1 || lightIntensity > 10){
                System.out.println("El valor ingresado no es válido. Ingrese un entero del 1-10 dependiendo las condiciones de las luces, donde 1 es muy bueno y 10 es muy malo.");

            } else {
                validInput = true;
            }
        }
        this.lightIntensity = lightIntensity;
    }
    public void setLightOverallStatus(String status) {
        this.ligthOverallStatus = status;
    }

    public String getLightOverallStatus() {
        return ligthOverallStatus;
    }

}
