package carRevision;

import java.util.Scanner;

public class Owner {
    private String ownerId;
    private String ownerName;
    private String ownerPhone;
    private String ownerEmail;
    private Car ownerCar;
    private Fine ownerFine;



    public Owner() {
        this.ownerId = "";
        this.ownerName = "";
        this.ownerPhone = "";
        this.ownerEmail = "";
        this.ownerFine = new Fine();
    }

    public void setOwnerId(Scanner sc){
        boolean validInput = false;
        String ownerID = "";
        while (!validInput) { //This loop will check if the length of the ID is valid, if not it will ask for the ID again.
            System.out.println("Ingrese la cedula del duenio: ");
            ownerID = sc.nextLine();
            if(ownerID.length() != 10){
                System.out.println("La cedula ingresada no es valida: ");
                continue;
            }

            try{
                int ownerIDIsNumeric = Integer.parseInt(ownerID);
            } catch(NumberFormatException e){
                System.out.println("La cedula ingresada no es valida");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
                continue;
            }
            validInput = true;
        }
        this.ownerId = ownerID;
    }
    public void setOwnerName(Scanner sc){
        System.out.println("Ingrese el nombre completo del duenio");
        this.ownerName = sc.nextLine();
    }
    public void setOwnerPhone(Scanner sc){
        String ownerPhone = "";
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el numero celular del duenio");
            ownerPhone = sc.nextLine();
            if(ownerPhone.length() != 10){ //This loop will check if the length of the phone number is valid, if not it will ask for it again.
                System.out.println("El numero ingresado no es valido, intente nuevamente ");
                continue;
            }
            try{
                int ownerPhoneIsNumeric = Integer.parseInt(ownerPhone);
            } catch(NumberFormatException e){
                System.out.println("El numero ingresado no es valido, intente nuevamente:");
                continue;
            } catch(Exception e){
                System.out.println("Error inesperado, intente nuevamente");
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
        this.ownerCar = ownerCar;
    }
    public void setOwnerFine(Fine ownerFine){
        this.ownerFine = ownerFine;
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

}
