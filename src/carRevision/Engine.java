package carRevision;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Engine {
    private String engineType;  
    private double engineTemperature;
    private boolean engineLeakage;
    private String engineStatus;

    public Engine(){
        this.engineType = "";
        this.engineTemperature = 0;
        this.engineStatus = "";
    }
    
    public Engine(String type, double engineTemperature, String engineStatus) {
        this.engineType = type;
        this.engineTemperature = engineTemperature;
        this.engineStatus = engineStatus;
    }

    public double getEngineTemperature(){
        return this.engineTemperature;
    }
    public String getEngineType() {
        return this.engineType;
    }
    public String getEngineStatus(){
        return this.engineStatus;
    }

    public boolean isEngineLeakage() {
        return this.engineLeakage;
    }
    public void setEngineStatus(String status){
        this.engineStatus = status;
    }

    public void setEngineType(Scanner sc) {
        boolean validInput = false;
        int op = 0;
        System.out.println("*****INFORMACION SOBRE EL MOTOR*******");
        do {
            try {
                System.out.println("Ingrese el tipo de motor entre las siguientes opciones:  ");
                System.out.println("1. ELECTRICO");
                System.out.println("2. DIESEL");
                System.out.println("3. GASOLINA");
                op = sc.nextInt();
                sc.nextLine();
                if (op == 1 || op == 2 || op == 3) {
                    switch (op) {
                        case 1:
                            this.engineType = "ELECTRICO";
                            break;
                        case 2:
                            this.engineType = "DIESEL";
                            break;
                        case 3:
                            this.engineType = "GASOLINA";
                    }
                    validInput = true;
                }
                else{
                    System.out.println("Por favor, ingrese un valor váldio");
                }
            }catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor, ingrese un valor váldio");
            }
        }while(!validInput);
    }
    // Mediante esta función el usuario puede ingresar la temperatura del motor
    public void setEngineTemperature(Scanner sc){
        boolean validInput = false;
        double engineTemperature = 0;
        do{
            try{
                System.out.println("Ingrese la temperatura del motor");
                engineTemperature = sc.nextDouble();
                // El rango de temperaturas disponibles va desde los 40°C a 150°C, a tal de limitar el ingreso de datos
                if (engineTemperature > 40 && engineTemperature < 150) {
                    this.engineTemperature = engineTemperature;
                    validInput = true;
                }
                else{
                    System.out.println("Por favor, ingrese un valor válido");
                }
            }catch(InputMismatchException e){
                sc.nextLine();
                System.out.println("Por favor, ingrese un valor válido");
            }
        }while(!validInput);
    }

    // Esta funcion permite determinar la presencia de fugas del motor
    public void setEngineLeakage(Scanner sc){
        System.out.println("¿El motor presenta fugas?");
        String op = "";
        do{
            System.out.print("Si/No: ");
            op = sc.nextLine();
            if (!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op)) {
                System.out.println("Por favor, ingrese una opcion válida");
            }
        }while(!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op));
        if(op.equalsIgnoreCase("si")){
            this.engineLeakage = true;
        }
        else{
            this.engineLeakage = false;
        }
    }

    // public boolean isOperational() {
    //     return this.isOperational;
    // }
    // public void setOperational(boolean operational) {
    //     isOperational = operational;
    // }

}
