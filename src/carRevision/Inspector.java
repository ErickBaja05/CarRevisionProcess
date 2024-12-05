package carRevision;

import java.util.Scanner;


public class Inspector {
    private int inspectorId;
    private String inspectorName;


    public Inspector(int id, String name) {
        this.inspectorId = id;
        this.inspectorName = name;
    }



    public boolean checkBrakeStatus(Car car, Revision revision){

        boolean result = false;
        int padsStatusRev = car.getCarBrakes().getBrakePadsStatus();
        int brakeHeatingRev = car.getCarBrakes().getBrakeHeating();

        //The following code assigns the brake pads' status based on the grade received.
        if (padsStatusRev >= 5 && brakeHeatingRev <= 600)
            {
                if (padsStatusRev >= 7 && brakeHeatingRev <= 350){
                    car.getCarBrakes().setBrakeOverallStatus("Bueno"); //Everything is alright
                } else{
                    car.getCarBrakes().setBrakeOverallStatus("Regular");
                    if (padsStatusRev < 7){
                        //here we can add in the observations that the driver should  be weary of the brakes status.
                        revision.setRevisionObservation("Pastillas en estado regular, pueden mejorarse");
                    }
                    if(brakeHeatingRev > 350){
                        revision.setRevisionObservation("Calentamiento en rango tolerable");
                        //here we can say that the brakes are overheating a bit but it shouldn't be an issue.
                    }
                }

        }else{
            car.getCarBrakes().setBrakeOverallStatus("Deficiente");
            if ((padsStatusRev < 7) && (padsStatusRev >= 5)) {
                // here we can add in the observations that the driver should be weary of the
                // brakes status.
                revision.setRevisionObservation("Pastillas en estado regular, pueden mejorarse");
            } else if (padsStatusRev < 5) {
                revision.setRevisionObservation("Pastillas deficientes");
                // Here wwe say that the brakes pads are faulty
            }
            if ((brakeHeatingRev > 350) && (brakeHeatingRev <= 600)) {
                revision.setRevisionObservation("Calentamiento en un rango tolerable");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (brakeHeatingRev > 600) {
                revision.setRevisionObservation("Sobrecalentamiento");
                // here we say the brakes are overheating over the tolerated range.
            }


        }
        //Once the overall status is set, the following code will set the boolean stauts to true if the brake passes, or false if they don't.
        if(car.getCarBrakes().getBrakeOverallStatus().equals("Bueno") || car.getCarBrakes().getBrakeOverallStatus().equals("Regular"))
        {
            result = true;
        }
        if(!result){
            revision.addMistake();
        }
        return result;
}

    public boolean checkChassisStatus(Car car , Revision revision) {
        boolean result = false;

        int chassisCorrosionRev = car.getCarChassis().getChassisCorrosion();
        int chassisAlignmentRev = car.getCarChassis().getChassisAlignment();
        int chassisSuspensionBounceRev = car.getCarChassis().getSuspensionBounce();

        //The following code assigns the brake pads' status based on the grade received.
        if ((chassisAlignmentRev >= 5 && chassisCorrosionRev >= 5) && chassisSuspensionBounceRev >= 5) {
            if ((chassisAlignmentRev >= 7 && chassisCorrosionRev >= 7) && chassisSuspensionBounceRev >= 7) {
                car.getCarChassis().setChassisOverallStatus("Bueno"); //Everything is alright
            } else {

                car.getCarChassis().setChassisOverallStatus("Regular");
                if (chassisAlignmentRev < 7) {
                    // here we can add in the observations that the driver should be weary of.
                    revision.setRevisionObservation("Desalineamiento en Rango Tolerable");
                }
                if (chassisCorrosionRev < 7) {
                    revision.setRevisionObservation("Corrosion en Rango Tolerable");
                    // here we can add in the observations that the driver should be weary of.
                }
                if (chassisSuspensionBounceRev < 7) {
                    revision.setRevisionObservation("Se debe revisar la suspension del auto");
                    // here we can add in the observations that the driver should be weary of.
                }

            }
        } else {
            car.getCarChassis().setChassisOverallStatus("Deficiente");
            if ((chassisAlignmentRev < 7) && (chassisAlignmentRev >= 5)) {
                // here we can add in the observations that the driver should be weary of the
                // brakes status.
                revision.setRevisionObservation("Desalineamiento en Rango Tolerable");
            } else if (chassisAlignmentRev < 5) {
                revision.setRevisionObservation("Desalineamiento Intolerable");
                // Here wwe say that the brakes pads are faulty
            }
            if ((chassisCorrosionRev < 7) && (chassisCorrosionRev >= 5)) {
                revision.setRevisionObservation("Corrosion en Rango Tolerable");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (chassisCorrosionRev < 5) {
                revision.setRevisionObservation("Corrosion en Rango Intolerable");
                // here we say the brakes are overheating over the tolerated range.
            }
            if ((chassisSuspensionBounceRev < 7) && (chassisSuspensionBounceRev >= 5)) {
                revision.setRevisionObservation("Ajustar la suspension");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (chassisSuspensionBounceRev < 5) {
                revision.setRevisionObservation("La suspension no funciona correctamente");
                // here we say the brakes are overheating over the tolerated range.
            }

        }

        if(car.getCarChassis().getChassisOverallStatus().equals("Bueno") || car.getCarChassis().getChassisOverallStatus().equals("Regular"))
        {
            result = true;
        }

        if(!result){
            revision.addMistake();
        }
        return result;
    }





    public boolean checkEngine(Car car, Revision revision) {
        double engineTemperature = car.getCarEngine().getEngineTemperature();
        boolean engineLeakage = car.getCarEngine().isEngineLeakage();
        boolean result;

        if (engineLeakage) {
            car.getCarEngine().setEngineStatus("Deficiente");
            revision.setRevisionObservation("El motor presenta fugas");
        } else if ((engineTemperature >= 90 && engineTemperature <= 100)) {
            car.getCarEngine().setEngineStatus("Bueno");
        } else if ((engineTemperature >= 80 && engineTemperature <= 110)) {
            car.getCarEngine().setEngineStatus("Regular");
            revision.setRevisionObservation("El sistema de refrigeracion puede mejorar");
        } else {
            car.getCarEngine().setEngineStatus("Deficiente");
            revision.setRevisionObservation("Motor deficiente con temperaturas muy altas");
        }

        if (car.getCarEngine().getEngineStatus().equals("Bueno")
                || car.getCarEngine().getEngineStatus().equals("Regular")) {
            result = true;
        } else {
            result = false;
        }
        if(!result){
            revision.addMistake();
        }
        return result;
    }

    public boolean checkExhaustPipeStatus(Car car, Revision revision) {
        double gasEmisionValue = car.getExhaustPipe().getGasEmisionValue();
        String engineType = car.getCarEngine().getEngineType();
        int carYear = car.getCarYear();
        boolean result = false;
        switch (engineType) {
            case "ELECTRICO":
                car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                result = true;
                break;
            case "GASOLINA":
                if (carYear <= 1989 && gasEmisionValue <= 6.5) {
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    result = true;
                }
                else if (carYear > 1989 && carYear <= 1999 && gasEmisionValue <= 3.5)
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                else if (carYear > 1999 && gasEmisionValue <= 1){
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    result = true;
                }
                else{
                    car.getExhaustPipe().setExhaustPipeStatus("Deficiente");
                }
                break;
            case "DIESEL":
                if (carYear <= 1989 && gasEmisionValue <= 2.5) {
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    result = true;
                }
                else if (carYear > 1989 && carYear <= 1999 && gasEmisionValue <= 1)
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                else if (carYear > 1999 && gasEmisionValue <= 0.5){
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    result = true;
                }
                else{
                    car.getExhaustPipe().setExhaustPipeStatus("Deficiente");
                }
                
        }
        if(!result){
            revision.addMistake();
       }
        return result;
    }


    // This feature allows the inspector to check the intensity and status of the lights.
    public boolean checkLightStatus(Car car, Revision revision) {
        boolean result = false;
        int lightStatusRev = car.getCarLights().getLightStatus();
        int lightIntensityRev = car.getCarLights().getLightIntensity();

        // Evaluate the general condition of the lights
        if (lightStatusRev == 1 && lightIntensityRev <= 4) {
            car.getCarLights().setLightOverallStatus("Bueno"); // The lights are in good condition
            revision.setRevisionObservation("Luces en buen estado");;
        } else if (lightStatusRev == 1 && lightIntensityRev <= 7) {
            car.getCarLights().setLightOverallStatus("Regular"); // The lights are functional, but with low intensity
            revision.setRevisionObservation("La intensidad de las luces no es muy alta");;
        } else {
            car.getCarLights().setLightOverallStatus("Malo"); // The lights are burned out or very low intensity
            if (lightStatusRev == 0) {
                revision.setRevisionObservation("Luces Quemadas");
            }
            if (lightIntensityRev > 7) {
                revision.setRevisionObservation("Intensidad de las luces deficiente");;
            }
        }
        // Evaluate if the lights pass the inspection
        if (car.getCarLights().getLightOverallStatus().equals("Bueno") ||
                car.getCarLights().getLightOverallStatus().equals("Regular")) {
            result = true; // Approved
        }
        if(!result){
            revision.addMistake();
        }
        return result;
    }

     //Using this feature, the inspector can check the condition and pressure of the tires.
    public boolean checkTireStatus(Car car , Revision revision) {
        boolean result = false;
        double tireTreadingRev = car.getCarTire().getTireTreading();
        double tirePresionRev = car.getCarTire().getTirePression();

        // Evaluate the general condition of the tires
        if ((tireTreadingRev >= 1.66 && tirePresionRev >= 30) && tirePresionRev <= 40) {
            car.getCarTire().setTireOverallStatus("Bueno"); // Tires in good condition
            revision.setRevisionObservation("Llantas en buen estado");
        } else if (tireTreadingRev >= 1.66 && (tirePresionRev < 30 || tirePresionRev > 40)) {
            car.getCarTire().setTireOverallStatus("Regular"); // Functional tires but with pressure outside the optimal range
            revision.setRevisionObservation("Es necesario revisar la presion de las llantas ");
        } else {
            car.getCarTire().setTireOverallStatus("Malo"); // Tires in poor condition
            if (tireTreadingRev < 1.66) {
                revision.setRevisionObservation("Banda de rodadura insuficiente. Es necesario reemplazar las llantas.");
            }
            if (tirePresionRev < 20) {
                revision.setRevisionObservation("Presión extremadamente baja");

            } else if (tirePresionRev > 70) {
                revision.setRevisionObservation("Presión extremadamente alta");

            }
        }

        if (car.getCarTire().getTireOverallStatus().equals("Bueno") || car.getCarTire().getTireOverallStatus().equals("Regular")) {
            result = true; // Approved
        }
        if(!result){
            revision.addMistake();
        }
        return result;
    }


    public boolean chechAditional(Car car, Revision revision) {
        boolean result = false;

        if(car.isSeatBelt() && car.isFirstAidKit()){
            result = true;
        }
        else{
            if(!car.isSeatBelt()){
                revision.setRevisionObservation("No cuenta con cinturones de seguridad en buen estado");
            }else if(!car.isFirstAidKit()){
                revision.setRevisionObservation("No cuenta con kit de primeros auxilios");
            }
        }
        if(car.isEmergencyTire()){
            result = true;
        }else{
            revision.setRevisionObservation("No cuenta con llanta de emergencia");
        }

        if(!result){
            revision.addMistake();
        }
        return result;
    }
    public void setOwnerInformation(Owner owner, Scanner sc){
        owner.setOwnerName(sc);
        owner.setOwnerId(sc);
        owner.setOwnerEmail(sc);
        owner.setOwnerPhone(sc);
    }

    public void setCarInformation(Owner owner, Car car, Scanner sc){
        owner.setOwnerCar(car);
        System.out.println("********INFORMACION GENERAL*************");
        owner.getOwnerCar().setCarColor(sc);
        owner.getOwnerCar().setCarBrand(sc);
        owner.getOwnerCar().setCarModel(sc);
        owner.getOwnerCar().setCarYear(sc);
        owner.getOwnerCar().setCarPlate(sc);
        owner.getOwnerCar().setEmergencyTire(sc);
        owner.getOwnerCar().setFirstAidKit(sc);
        owner.getOwnerCar().setSeatBelt(sc);
        owner.getOwnerCar().getCarBrakes().setBrakeHeating(sc);
        owner.getOwnerCar().getCarBrakes().setBrakePadsStatus(sc);
        owner.getOwnerCar().getCarChassis().setChassisAlignmentLevel(sc);
        owner.getOwnerCar().getCarChassis().setSuspensionBounce(sc);
        owner.getOwnerCar().getCarChassis().setChassisCorrosion(sc);
        owner.getOwnerCar().getCarLights().setLightStatus(sc);
        owner.getOwnerCar().getCarLights().setLightIntensity(sc);
        owner.getOwnerCar().getCarTire().setTirePression(sc);
        owner.getOwnerCar().getCarTire().setTireTreading(sc);
        owner.getOwnerCar().getCarEngine().setEngineType(sc);
        owner.getOwnerCar().getCarEngine().setEngineLeakage(sc);
        owner.getOwnerCar().getCarEngine().setEngineTemperature(sc);
        owner.getOwnerCar().getExhaustPipe().setGasEmisionValue(sc,owner.getOwnerCar());
    }
}
