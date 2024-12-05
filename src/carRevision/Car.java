package carRevision;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Car {
    private int carId;
    private String carColor;
    private String carBrand;
    private String carModel;
    private String carPlate;
    private Brake carBrakes;
    private Engine carEngine;
    private boolean seatBelt;
    private boolean firstAidKit;
    private Tire carTire;
    private boolean emergencyTire;
    private Light carLights;
    private Chassis carChassis;
    private Owner owner;
    private String carType;
    private int carYear;
    private ExhaustPipe exhaustPipe;


    public Car(int carId, String carColor, String carBrand, String carModel, String carPlate, boolean seatBelt, boolean firstAidKit, boolean emergencyTire, String carType, int carYear, Owner carOwner){
        this.carId = carId;
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carPlate = carPlate;
        this.seatBelt = seatBelt;
        this.firstAidKit = firstAidKit;
        this.emergencyTire = emergencyTire;
        this.carType = carType;
        this.carYear = carYear;
        this.carBrakes = new Brake();
        this.carEngine = new Engine();
        this.carTire = new Tire();
        this.carLights = new Light();
        this.carChassis = new Chassis();
        this.owner = carOwner;
        this.exhaustPipe = new ExhaustPipe();
    }

    public Car(){
        this.carId = 0;
        this.carColor = "";
        this.carBrand = "";
        this.carModel = "";
        this.carPlate = "";
        this.seatBelt = false;
        this.firstAidKit = false;
        this.emergencyTire = false;
        this.carType = "";
        this.carYear = 0;
        this.carBrakes = new Brake();
        this.carEngine = new Engine();
        this.carTire = new Tire();
        this.carLights = new Light();
        this.carChassis = new Chassis();
        this.owner = null;
        this.exhaustPipe = new ExhaustPipe();
    }


    public String showCarInformation(){
        StringBuilder stringC = new StringBuilder();
        stringC.append("Color: ").append(this.carColor).append('\n');
        stringC.append("Tipo de vehículo: ").append(this.carType).append('\n');
        stringC.append("Modelo: ").append(this.carModel).append('\n');
        stringC.append("Año: ").append(this.carYear).append('\n');
        stringC.append("Placas: ").append(this.carPlate).append('\n');
        return stringC.toString();
    }


    public Brake getCarBrakes() {
        return this.carBrakes;
    }

    public Engine getCarEngine() {
        return this.carEngine;
    }

    public boolean isSeatBelt() {
        return this.seatBelt;
    }

    public boolean isFirstAidKit() {
        return this.firstAidKit;
    }

    public Tire getCarTire(){
        return this.carTire;
    }

    public boolean isEmergencyTire() {
        return this.emergencyTire;
    }

    public Light getCarLights() {
        return this.carLights;
    }

    public Chassis getCarChassis() {
        return this.carChassis;
    }

    public Owner getOwner() {
        return this.owner;
    }


    public ExhaustPipe getExhaustPipe() {
        return this.exhaustPipe;
    }

    public String getCarPlate(){
        return this.carPlate;
    }

    public void setCarYear(Scanner sc) {
        boolean validInput = false;
        int carYear = 0;

        while (!validInput) {
            System.out.println("Ingrese el anio del auto:");
            try {
                carYear = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("El valor ingresado no es valido, inente nuevamente");
                continue;
            } catch (Exception e) {
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            if(carYear < 1900){
                System.out.println("Revise el anio e intente nuevamente");
                continue;
            }
            validInput = true;
        }
        this.carYear = carYear;
    }
    public int getCarYear(){
        return this.carYear;
    }

    public void setCarColor(Scanner sc) {
        boolean validInput = false;
        int op = 0;
        System.out.println("Escoja un color para su vehículo");
        do {
            try {
                System.out.println("1. Azul \n2. Rojo \n3. Gris \n4. Naranja \n5. Blanco \n6. Negro");
                System.out.print("Opcion (1/2/../6): ");
                op = sc.nextInt();
                sc.nextLine();
                if (op >= 1 && op <= 6) {
                    switch (op) {
                        case 1:
                            this.carColor = "Azul";
                            break;
                        case 2:
                            this.carColor = "Rojo";
                            break;
                        case 3:
                            this.carColor = "Gris";
                            break;
                        case 4:
                            this.carColor = "Naranja";
                            break;
                        case 5:
                            this.carColor = "Blanco";
                            break;
                        case 6:
                            this.carColor = "Negro";
                    }
                    validInput = true;
                } else {
                    System.out.println("Por favor, seleccione una opcion válida");
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor, seleccione una opcion válida");
            }
        } while (!validInput);
    }

    public void setCarBrand(Scanner sc){
        boolean validInput = false;
        int op = 0;
        System.out.println("Escoja la marca de su vehiculo:");
        do {
            try {
                System.out.println("1. Chevrolet \n2. Nissan \n3. Ford \n4. Toyota \n5. Mercedes Benz");
                System.out.print("Opcion (1/2/../5): ");
                op = sc.nextInt();
                sc.nextLine();
                if (op >= 1 && op <= 5) {
                    switch (op) {
                        case 1:
                            this.carBrand = "Chevrolet";
                            break;
                        case 2:
                            this.carBrand = "Nissan";
                            break;
                        case 3:
                            this.carBrand = "Ford";
                            break;
                        case 4:
                            this.carBrand = "Toyota";
                            break;
                        case 5:
                            this.carBrand = "Mercedes Benz";
                    }
                    validInput = true;
                } else {
                    System.out.println("Por favor, seleccione una opcion válida");
                }
            } catch (InputMismatchException e) {
                sc.nextLine();
                System.out.println("Por favor, seleccione una opcion válida");
            }
        } while (!validInput);
    }

    public void setCarModel(Scanner sc){
        System.out.println("Ingrese el modelo de su vehículo:");
        this.carModel = sc.nextLine();
    }

    public void setCarPlate(Scanner sc){
        System.out.println("Ingrese la placa del vehiculo:");
        this.carPlate = sc.nextLine();
    }

    public void setSeatBelt(Scanner sc){
        System.out.println("¿El vehículo presenta cinturones de seguridad en buen estado?");
        String op = "";
        do{
            System.out.print("Si/No: ");
            op = sc.nextLine();
            if (!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op)) {
                System.out.println("Por favor, ingrese una opcion válida");
            }
        }while(!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op));
        if(op.equalsIgnoreCase("si")){
            this.seatBelt = true;
        }
        else{
            this.seatBelt = false;
        }

    }

    public void setFirstAidKit(Scanner sc){
        System.out.println("¿El vehículo presenta kit de primeros auxilios?");
        String op = "";
        do{
            System.out.print("Si/No: ");
            op = sc.nextLine();
            if (!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op)) {
                System.out.println("Por favor, ingrese una opcion válida");
            }
        }while(!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op));
        if(op.equalsIgnoreCase("si")){
            this.firstAidKit = true;
        }
        else{
            this.firstAidKit = false;
        }

    }

    public void setEmergencyTire(Scanner sc){
        System.out.println("¿El vehículo presenta una llanta de emergencia?");
        String op = "";
        do{
            System.out.print("Si/No: ");
            op = sc.nextLine();
            if (!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op)) {
                System.out.println("Por favor, ingrese una opcion válida");
            }
        }while(!"si".equalsIgnoreCase(op) && !"no".equalsIgnoreCase(op));
        if(op.equalsIgnoreCase("si")){
            this.emergencyTire = true;
        }
        else{
            this.emergencyTire = false;
        }

    }



}
