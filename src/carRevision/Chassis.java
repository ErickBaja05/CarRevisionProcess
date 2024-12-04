package carRevision;

import java.util.Scanner;

public class Chassis {
    private String material;
    private double weight;
    private int chassisCorrosion;
    private int chassisAlignment;
    private int suspensionBounce;
    private String chassisOverallStatus;

    public Chassis() {
        this.material = "";
        this.weight = 0;
        this.chassisCorrosion = 0;
        this.chassisAlignment = 0;
        this.suspensionBounce = 0;
    }
    public Chassis(String material, double weight) {
        this.material = material;
        this.weight = weight;
        this.chassisCorrosion = 0;
        this.chassisAlignment = 0;
        this.suspensionBounce = 0;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(Scanner sc) {
        String material = "";
        boolean validInput = false;
        //The following function allows the inspector to enter the chassis' material.
        while(!validInput)
        {
            System.out.println("Ingrese el material del chasis: ");
            try{
                material = sc.nextLine();
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            validInput = true;
        }

        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(Scanner sc) {
        double weight = 0;
        boolean validInput = false;
        //The following function allows the inspector to enter the chassis' weight.
        while(!validInput)
        {
            System.out.println("Ingrese el peso del material en toneladas: ");
            try{
                weight = Double.parseDouble(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
            }
                validInput = true;
            }
        this.weight = weight;
    }

    public int getChassisCorrosion() {
        return chassisCorrosion;

    }

    public void setChassisCorrosion(Scanner sc) {
        boolean validInput = false;
        int chassisCorrosion = 1;
        //The following function allows the inspector to assign a score to the chassis' corrosion.
        while(!validInput)
        {
            System.out.println("Ingrese una calificacion para la corrosión del chasis en un rango entero 1-10 siendo 10 sin corrosion y 1 con alta corrosion: ");
            try{
                chassisCorrosion = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(chassisCorrosion < 1 || chassisCorrosion > 10)
                System.out.println("El valor ingresado esta fuera de rango, intente nuevamente");
            else {
                validInput = true;
            }
        }
        this.chassisCorrosion = chassisCorrosion;
    }

    public int getChassisAlignment() {
        return chassisAlignment;
    }

    public void setChassisAlignmentLevel(Scanner sc) {
        boolean validInput = false;
        int chassisAllignment = 0;
        //The following function allows the inspector to evaluate on a scale from 1 to 10 the alignment of the chassis.
        System.out.println("*****INFORMACION SOBRE EL CHASIS*******");
        while(!validInput)
        {
            System.out.println("Ingrese el grado de alineacion del chasis en un rango entero 1-10, siendo 10 alineado y 1 no alineado: ");
            try{
                chassisAllignment = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(chassisAllignment < 1 || chassisAllignment > 10)
                System.out.println("El valor ingresado esta fuera del rango, intente nuevamente");
            else {
                validInput = true;
            }
        }
        this.chassisAlignment = chassisAllignment;
    }

    public int getSuspensionBounce() {
        return suspensionBounce;
    }

    public void setSuspensionBounce(Scanner sc) {
        boolean validInput = false;
        int suspensionBounce = 0;
        //The following function allows the inspector to evluate on a scale from 1 to 10 the alignment of the chassis.
        while(!validInput)
        {
            System.out.println("Ingrese la calificacion del rebote de la suspension 1-10, sinedo 10 normal y 1 anormal: ");
            try{
                suspensionBounce = Integer.parseInt(sc.nextLine());
            } catch(NumberFormatException e){
                System.out.println("El valor ingresado no es valido");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(suspensionBounce < 1 || suspensionBounce > 10)
                System.out.println("El valor ingresado esta fuera del rango, intente nuevamente");
            else {
                validInput = true;
            }
        }
        this.suspensionBounce = suspensionBounce;
    }

    public String getChassisOverallStatus() {
        return chassisOverallStatus;
    }

    public void setChassisOverallStatus(String chassisOverallStatus) {
        this.chassisOverallStatus = chassisOverallStatus;
    }
}
