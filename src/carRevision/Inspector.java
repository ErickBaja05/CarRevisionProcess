package carRevision;

public class Inspector {
    private int inspectorId;
    private String inspectorName;

    // Constructor
    public Inspector(int id, String name) {
        this.inspectorId = id;
        this.inspectorName = name;
    }

    // Metodos
    // Funciones que el inspector realiza durante la revision:
    // Respecto a frenos, el inspector revisa el estado de las pastillas, la
    // temperatura y la eficiencia de frenado
    public boolean checkBrakeStatus(Car car) {

        int padsStatusRev = car.getCarBrakes().getBrakePadsStatus();
        int brakeHeatingRev = car.getCarBrakes().getBrakeHeating();

        // The following code assigns the brake pads' status based on the grade
        // received.
        if (padsStatusRev >= 5 && brakeHeatingRev <= 600) {
            if (padsStatusRev >= 7 && brakeHeatingRev <= 350) {
                car.getCarBrakes().setBrakeOverallStatus("Bueno"); // Everything is alright
            } else {
                car.getCarBrakes().setBrakeOverallStatus("Regular");
                if (padsStatusRev < 7) {
                    // here we can add in the observations that the driver should be weary of the
                    // brakes status.
                    System.out.println("Pastillas Regular");
                }
                if (brakeHeatingRev > 350) {
                    System.out.println("Calentamiento en rango tolerable");
                    // here we can say that the brakes are overheating a bit but it shouldn't be an
                    // issue.
                }

            }
        } else {
            car.getCarBrakes().setBrakeOverallStatus("Deficiente");
            if ((padsStatusRev < 7) && (padsStatusRev >= 5)) {
                // here we can add in the observations that the driver should be weary of the
                // brakes status.
                System.out.println("Pastillas Regular");
            } else if (padsStatusRev < 5) {
                System.out.println("Pastillas Deficientes");
                // Here wwe say that the brakes pads are faulty
            }
            if ((brakeHeatingRev > 350) && (brakeHeatingRev <= 600)) {
                System.out.println("Calentamiento en rango tolerable");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (brakeHeatingRev > 600) {
                System.out.println("Sobrecalentamiento excesivo");
                // here we say the brakes are overheating over the tolerated range.
            }
        }
        // Once the overall status is set, the following code will set the boolean
        // stauts to true if the brake passes, or false if they don't.
        if (car.getCarBrakes().getBrakeOverallStatus().equals("Bueno")
                || car.getCarBrakes().getBrakeOverallStatus().equals("Regular")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkChassisStatus(Car car) {
        int chassisCorrosionRev = car.getCarChassis().getChassisCorrosion();
        int chassisAlignmentRev = car.getCarChassis().getChassisAlignment();
        int chassisSuspensionBounceRev = car.getCarChassis().getSuspensionBounce();

        // The following code assigns the brake pads' status based on the grade
        // received.
        if (chassisAlignmentRev >= 5 && chassisCorrosionRev >= 5 && chassisSuspensionBounceRev >= 5) {
            if (chassisAlignmentRev >= 7 && chassisCorrosionRev >= 7 && chassisSuspensionBounceRev >= 7) {
                car.getCarChassis().setChassisOverallStatus("Bueno"); // Everything is alright
            } else {
                car.getCarChassis().setChassisOverallStatus("Regular");
                if (chassisAlignmentRev < 7) {
                    // here we can add in the observations that the driver should be weary of.
                    System.out.println("Desalinemiento en rango tolerable");
                }
                if (chassisCorrosionRev < 7) {
                    System.out.println("Corrosion en rango tolerable");
                    // here we can add in the observations that the driver should be weary of.
                }
                if (chassisSuspensionBounceRev < 7) {
                    System.out.println("Se debe revisar la suspension del auto");
                    // here we can add in the observations that the driver should be weary of.
                }

            }
        } else {
            car.getCarChassis().setChassisOverallStatus("Deficiente");
            if ((chassisAlignmentRev < 7) && (chassisAlignmentRev >= 5)) {
                // here we can add in the observations that the driver should be weary of the
                // brakes status.
                System.out.println("Desalinemiento en rango tolerable");
            } else if (chassisAlignmentRev < 5) {
                System.out.println("Desalinamiento Intolerable");
                // Here wwe say that the brakes pads are faulty
            }
            if ((chassisCorrosionRev < 7) && (chassisCorrosionRev >= 5)) {
                System.out.println("Corrosion en rango tolerable");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (chassisCorrosionRev < 5) {
                System.out.println("Corrosion Intolerable");
                // here we say the brakes are overheating over the tolerated range.
            }
            if ((chassisSuspensionBounceRev < 7) && (chassisSuspensionBounceRev >= 5)) {
                System.out.println("Ajustar la suspension");
                // here we can say that the brakes are overheating a bit but it shouldn't be an
                // issue.

            } else if (chassisSuspensionBounceRev < 5) {
                System.out.println("La suspension no funciona correctamente");
                // here we say the brakes are overheating over the tolerated range.
            }

        }
        // Once the overall status is set, the following code will set the boolean
        // stauts to true if the brake passes, or false if they don't.
        if (car.getCarChassis().getChassisOverallStatus().equals("Bueno")
                || car.getCarChassis().getChassisOverallStatus().equals("Regular")) {
            return true;
        } else {
            return false;
        }

    }

    // Esta funcion permite al revisor evaluar el motor, teniendo en cuenta la
    // temperatura y filtrado del motor. Si cumple con lo
    // establecido, se retornará true, caso contrario, false
    public boolean checkEngine(Car car) {
        double engineTemperature = car.getCarEngine().getEngineTemperature();
        boolean engineLeakage = car.getCarEngine().isEngineLeakage();
        boolean revision;
        // Independientemente del tipo de combustion del motor, la temperatura ideal va
        // de 90°C a 100°C
        if (engineLeakage == true) {
            // El filtrado del motor es un aspecto crítico en la evaluación, por ello si el
            // motor tiene filtrado
            // automaticamente reprueba la revision
            car.getCarEngine().setEngineStatus("Deficiente");
            System.out.println("Reprobado, el motor tiene filtrado");
        } else if (engineTemperature >= 90 && engineTemperature <= 100 && engineLeakage == false) {
            car.getCarEngine().setEngineStatus("Bueno");
        } else if (engineTemperature >= 80 && engineTemperature <= 110 && engineLeakage == false) {
            car.getCarEngine().setEngineStatus("Regular");
            System.out.println("Mejore el sistema de refrigeración");
        } else if (engineLeakage == true) {
            car.getCarEngine().setEngineStatus("Deficiente");
            System.out.println("Reprobado, la temperatura del motor no es optima");
        }

        if (car.getCarEngine().getEngineStatus().equals("Bueno")
                || car.getCarEngine().getEngineStatus().equals("Regular")) {
            revision = true;
        } else {
            revision = false;
        }
        return revision;
    }

    public boolean checkExhaustPipeStatus(Car car){
        double gasEmisionValue = car.getExhaustPipe().getGasEmisionValue();
        String engineType = car.getCarEngine().getEngineType();
        int carYear = car.getCarYear();
        boolean revision = false;
        switch (engineType) {
            case "ELECTRICO":
                car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                revision = true;
                break;
            case "GASOLINA":
                if (carYear <= 1989 && gasEmisionValue <= 6.5) {
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    revision = true;
                }
                else if (carYear > 1989 && carYear <= 1999 && gasEmisionValue <= 3.5)
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                else if (carYear > 1999 && gasEmisionValue <= 1){
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    revision = true;
                }
                else{
                    car.getExhaustPipe().setExhaustPipeStatus("Deficiente");
                }
                break;
                
            case "DIESEL":
                if (carYear <= 1989 && gasEmisionValue <= 2.5) {
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    revision = true;
                }
                else if (carYear > 1989 && carYear <= 1999 && gasEmisionValue <= 1)
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                else if (carYear > 1999 && gasEmisionValue <= 0.5){
                    car.getExhaustPipe().setExhaustPipeStatus("Bueno");
                    revision = true;
                }
                else{
                    car.getExhaustPipe().setExhaustPipeStatus("Deficiente");
                }
                
        }
        return revision;
    }

    // // Esta funcion permite al inspector revisar el nivel de sonido del tubo de
    // escape, asi
    // // el porcentaje de emision de CO2
    // public boolean checkExhaustPipeStatus(Car car){
    // int soundLevelRev = car.getExhaustPipe().getSoundLevel();
    // double co2EmisionRev = car.getExhaustPipe().getCo2Emision();
    //
    // }
    // // Esta funcion permite al inspector revisar la intensidad y el estado de la
    // // cubierta de las luces
    // public boolean checkLightStatus(Car car){
    // int lightIntensityRev = car.getCarLights().getLightIntensity();
    // String coverStatusRev = car.getCarLights().getLightCoverStatus();
    // }
    // // Mediante esta funcion, el inspector puede revisar el estado y presion de
    // las llantas
    // public boolean checkTireStatus(Car car){
    // int tireTreadingRev = car.getTire().getTireTreading();
    // double tirePresion = car.getTire().getTirePresion();
    // }
}
