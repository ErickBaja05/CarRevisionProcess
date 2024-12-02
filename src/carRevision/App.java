package carRevision;

import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        //Test for the fine
//        carRevision.Fine testFine = new carRevision.Fine();
//        testFine.setTypeFine(sc);
//        testFine.setFineCost(12.32);
//        testFine.showFine();
//
//
//        //Test for the owner
//        carRevision.Owner owner = new carRevision.Owner();
//        owner.setOwnerId(sc);
//        owner.setOwnerName(sc);
//        owner.setOwnerEmail(sc);
//        owner.setOwnerPhone(sc);
//        owner.printOwner();
//
//
//        carRevision.DriverLicense license = new carRevision.DriverLicense();
//        license.setDriverLicenseId(sc);
//        license.setDriverLicenseCategory(sc);
//        license.setDriverLicenseEmissionDate(sc);
//        license.setDriverLicenseExpirationDate(sc);
//        license.printDriverLicense();
//        sc.close();
        Car car1 = new Car();
         car1.getCarBrakes().setBrakePadsStatus(sc);
         car1.getCarBrakes().setBrakeHeating(sc);
         Inspector inspector1 = new Inspector(1,"Juan");
         inspector1.checkBrakeStatus(car1);
        System.out.println("Estado general de los frenos: " + car1.getCarBrakes().getBrakeOverallStatus());






    }
}
