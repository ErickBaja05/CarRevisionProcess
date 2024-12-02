package carRevision;

import java.time.LocalDate;
import java.util.Scanner;
import java.time.format.DateTimeFormatter;

public class DriverLicense {
    private String driverLicenseId;
    private String driverLicenseCategory;
    private LocalDate driverLicenseEmissionDate;
    private LocalDate driverLicenseExpirationDate;


    public DriverLicense(String driverLicenseId, String driverLicenseCategory,
                         LocalDate driverLicenseEmissionDate, LocalDate driverLicenseExpirationDate) {
        this.driverLicenseId = driverLicenseId;
        this.driverLicenseCategory = driverLicenseCategory;
        this.driverLicenseEmissionDate = driverLicenseEmissionDate;
        this.driverLicenseExpirationDate = driverLicenseExpirationDate;
    }
    public void setDriverLicenseId(Scanner sc){
        boolean validInput = false;
        while (!validInput) { //This loop will check if the length of the ID is valid, if not, it will ask for it again.
            System.out.println("Ingrese el ID de la licencia de conducir: ");
            this.driverLicenseId = sc.nextLine();
            if(this.driverLicenseId.length() != 10){
                System.out.println("El ID ingresado es invalido, intente de nuevo");
                continue;
            }
            validInput = true;
        }
    }
    public void setDriverLicenseCategory(Scanner sc) {
        boolean validInput = false;
        while (!validInput) {
            System.out.println("Ingrese el tipo de licencia de conducir del duenio: ");
            this.driverLicenseCategory = sc.nextLine();

            //if the provided License Category doesn't match any of the right types, then it'll prompt the user to enter the type once again.
            if (!(this.driverLicenseCategory.equals("A")
                    || this.driverLicenseCategory.equals("A1")
                    || this.driverLicenseCategory.equals("B")
                    || this.driverLicenseCategory.equals("C")
                    || this.driverLicenseCategory.equals("C1")
                    || this.driverLicenseCategory.equals("D")
                    || this.driverLicenseCategory.equals("D1")
                    || this.driverLicenseCategory.equals("E")
                    || this.driverLicenseCategory.equals("E1")
                    || this.driverLicenseCategory.equals("F")
                    || this.driverLicenseCategory.equals("G"))) {
                System.out.println("El tipo de licencia ingresado es invalido, intente de nuevo");
                continue;
            }
            validInput = true;
        }
    }
    public void setDriverLicenseEmissionDate(Scanner sc) {
        boolean validInput = false;
        int dia = 1, mes = 1, anio = 1970;
        while ((!validInput) || //If the value entered is not an integer il will ask again for the information
                ((dia > 31)||(dia < 1)) //If the day is invalid it will ask again
                || ((mes > 12)||(mes < 1)) //If the month is invalid it will ask again
                || (anio < 1970)){ //If the year is invalid it will ask again {
            try {
                System.out.println("Ingrese dia de emision:");
                dia = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese mes de emision:");
                mes = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese anio de emision:");
                anio = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Alguno de los datos ingresados no es valido, intente nuevamente");
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente");
            }
            //If the day, month or year fall out of range, it wil ask the user to re-enter the information
            if (((dia > 31)||(dia < 1))
                    || ((mes > 12)||(mes < 1))
                    || (anio < 1970)){
                System.out.println("Alguno de los datos ingresados es erroneo, intente nuevamente");
            }

        }
        this.driverLicenseEmissionDate = LocalDate.of(anio, mes, dia);
    }
    public void setDriverLicenseExpirationDate(Scanner sc) {
        boolean validInput = false;
        int dia = 1, mes = 1, anio = 1970;
        while ((!validInput) || //If the value entered is not an integer il will ask again for the information
                ((dia > 31)||(dia < 1)) //If the day is invalid it will ask again
                || ((mes > 12)||(mes < 1)) //If the month is invalid it will ask again
                || (anio < 1970) ){ //If the year is invalid it will ask again {
            try {
                System.out.println("Ingrese dia de expiracion:");
                dia = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese mes de expiracion:");
                mes = Integer.parseInt(sc.nextLine());
                System.out.println("Ingrese anio de expiracion:");
                anio = Integer.parseInt(sc.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Alguno de los datos ingresados no es valido, intente nuevamente");
            } catch (Exception e){
                System.out.println("Error inesperado, intente nuevamente");
            }
            //If the day, month or year fall out of range, it wil ask the user to re-enter the information
            if (((dia > 31)||(dia < 1))
                    || ((mes > 12)||(mes < 1))
                    || (anio < 1970)){
                System.out.println("Alguno de los datos ingresados es erroneo, intente nuevamente");
            }
        }
        this.driverLicenseExpirationDate = LocalDate.of(anio, mes, dia);

    }
    public String getDriverLicenseId() {
        return driverLicenseId;
    }
    public String getDriverLicenseCategory() {
        return driverLicenseCategory;
    }
    public String getDriverLicenseEmissionDate() {
        //This object and method will set the date in the right format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.driverLicenseEmissionDate.format(formatter);
    }
    public String getDriverLicenseExpirationDate() {
        //This object and method will set the date in the right format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return this.driverLicenseExpirationDate.format(formatter);
    }
    public void printDriverLicense(){
        System.out.printf("ID de la licencia de conducir: %s%nTipo de Licencia: %s%nFecha de Emision: %s%nFecha de Expiracion: %s%n", getDriverLicenseId(),getDriverLicenseCategory(),getDriverLicenseEmissionDate(),getDriverLicenseExpirationDate());
    }

}
