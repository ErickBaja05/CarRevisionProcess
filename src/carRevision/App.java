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
//        Test for the owner
//        carRevision.Owner owner = new carRevision.Owner();
//         owner.setOwnerId(sc);
//        owner.setOwnerName(sc);
//        owner.setOwnerEmail(sc);
//        owner.setOwnerPhone(sc);
//        owner.printOwner();
//
//
//
//        sc.close();
        carRevision.DriverLicense license = new carRevision.DriverLicense();
        license.setDriverLicenseId(sc);
        license.setDriverLicenseCategory(sc);
        license.setDriverLicenseEmissionDate(sc);
        license.setDriverLicenseExpirationDate(sc);
        license.printDriverLicense();

        Car car1 = new Car();
        Inspector inspector1 = new Inspector(1,"Juan");

          /*
         car1.getCarBrakes().setBrakeType(sc);
        System.out.println(car1.getCarBrakes().getBrakeType());
         car1.getCarBrakes().setBrakePadsStatus(sc);
         car1.getCarBrakes().setBrakeHeating(sc);
         inspector1.checkBrakeStatus(car1);

        System.out.println("Estado general de los frenos: " + car1.getCarBrakes().getBrakeOverallStatus());
        */

        /*
        car1.getCarChassis().setMaterial(sc);
        System.out.println("Material: " + car1.getCarChassis().getMaterial());
        car1.getCarChassis().setWeight(sc);
        System.out.println("Peso:" + car1.getCarChassis().getWeight() + " toneladas");
        car1.getCarChassis().setChassisCorrosion(sc);
        car1.getCarChassis().setChassisAlignmentLevel(sc);
        car1.getCarChassis().setSuspensionBounce(sc);
        System.out.println("Paso la revision del chasis: " + inspector1.checkChassisStatus(car1));
        System.out.println("El estado general del chasis es: " + car1.getCarChassis().getChassisOverallStatus());
       */


    }
}
