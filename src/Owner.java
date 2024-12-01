import java.util.Scanner;

public class Owner {
    private String ownerId;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
    private Car ownerCar;
    private Fine ownerFine;
    private DriverLicense ownerLicense;
    private int attemptsLeft;

    public Owner() {
        this.ownerId = "";
        this.ownerName = "";
        this.ownerPhone = "";
        this.ownerEmail = "";
        this.ownerFine = new Fine();
        this.attemptsLeft = 2;
    }
    public Owner(String ownerId, String ownerName, String ownerPhone, String ownerEmail, Car ownerCar, DriverLicense ownerLicense) {
        this.ownerId = ownerId;
        this.ownerName = ownerName;
        this.ownerPhone = ownerPhone;
        this.ownerEmail = ownerEmail;
        this.ownerCar = ownerCar;
        this.ownerLicense = ownerLicense;
        this.ownerFine = new Fine();
        this.attemptsLeft = 2;
    }
    public void setOwnerId(Scanner sc){
        boolean validInput = false;
        while (!validInput) { //This loop will check if the length of the ID is valid, if not it will ask for the ID again.
            System.out.println("Ingrese la cedula del duenio: ");
            this.ownerId = sc.nextLine();
            if(this.ownerId.length() != 10){
                System.out.println("La cedula ingresada no es valida: ");
                continue;
            }
            validInput = true;
        }
    }
    public void setOwnerName(Scanner sc){
        System.out.println("Ingrese el nombre completo del duenio");
        this.ownerName = sc.nextLine();
    }
    public void setOwnerPhone(Scanner sc){
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el numero celular del duenio");
            this.ownerPhone = sc.nextLine();
            if(this.ownerPhone.length() != 10){ //This loop will check if the length of the phone number is valid, if not it will ask for it again.
                System.out.print("EL numero ingresado no es valido: ");
                continue;
            }
            validInput = true;
        }
    }
    public void setOwnerEmail(Scanner sc){
        System.out.println("Ingrese el email del duenio");
        this.ownerEmail = sc.nextLine();
    }
    public void setOwnerCar(Car ownerCar){
        this.ownerCar = ownerCar; //We must wait to invoke all car functions here to set the car
    }
    public void setOwnerFine(Fine ownerFine){
        this.ownerFine = ownerFine; //The fine will be changed by the AMT and will use this method to modify the user's fine.
    }
    public void setOwnerLicense(DriverLicense ownerLicense){
        this.ownerLicense = ownerLicense;
    }
    public String getOwnerId() {
        return ownerId;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getOwnerPhone() {
        return ownerPhone;
    }
    public String getOwnerEmail() {
        return ownerEmail;
    }
    public Car getOwnerCar() {
        return ownerCar;
    }
    public Fine getOwnerFine() {
        return ownerFine;
    }
    public DriverLicense getOwnerLicense() {
        return ownerLicense;
    }
    public void printOwner(){
        System.out.printf("Cedula: %s%nNombre: %s%nCelular: %s%nCorreo Electronico: %s%n",
                this.getOwnerId(), this.getOwnerName(), this.getOwnerPhone(), this.getOwnerEmail());
    }
}
