package carRevision;

public class Inspector {
    private int inspectorId;
    private String inspectorName;


    // Constructor
    public Inspector(int id, String name){
        this.inspectorId = id;
        this.inspectorName = name;
    }
    // TODO: Evaluar cada elemento
    // Metodos
    // Funciones que el inspector realiza durante la revision:
    // Respecto a frenos, el inspector revisa el estado de las pastillas, la temperatura y la eficiencia de frenado
    public boolean checkBrakeStatus(Car car){
        int padsStatusRev = car.getCarBrakes().getBrakePadsStatus();
        double brakeHeatingRev = car.getCarBrakes().getBrakeHeating();
        // String brakeStatusRev = car.getCarBrakes().getBrakeStatus();
        return true;
    }
    // A traves de esta funcion, el inspector puede revisar el grado de corriosion, alineamiento y estado del chassis
//    public boolean checkChassisStatus(Car car){
//        double chassisCorrosionRev = car.getCarChassis().getChassisCorrosion();
//        double chassisAlignmentRev = car.getCarChassis().getChassisAlignment();
//    }
//    // Mediante esta funcion, el inspector puede revisar el cilindraje y filtracion del motor
//    public boolean checkEngineStatus(Car car){
//        double engineCylinderRev = car.getCarEngine().getEngineCylinder();
//        boolean engineLeakageRev = car.getCarEngine().isEngineLeakage();
//        // String engineStatus = car.getCarEngine().getEngineStatus();
//    }
//    // Esta funcion permite al inspector revisar el nivel de sonido del tubo de escape, asi
//    // el porcentaje de emision de CO2
//    public boolean checkExhaustPipeStatus(Car car){
//        int soundLevelRev = car.getExhaustPipe().getSoundLevel();
//        double co2EmisionRev = car.getExhaustPipe().getCo2Emision();
//
//    }

    // This feature allows the inspector to check the intensity and status of the lights.
    public boolean checkLightStatus(Car car) {
        int lightStatusRev = car.getCarLights().getLightStatus();
        int lightIntensityRev = car.getCarLights().getLightIntensity();

        // Evaluate the general condition of the lights
        if (lightStatusRev == 1 && lightIntensityRev <= 4) {
            car.getCarLights().setLightOverallStatus("Bueno"); // The lights are in good condition
            System.out.println("Luces en buen estado.");
        } else if (lightStatusRev == 1 && lightIntensityRev <= 7) {
            car.getCarLights().setLightOverallStatus("Regular"); // The lights are functional, but with low intensity
            System.out.println("Luces en estado regular. Revise la intensidad.");
        } else {
            car.getCarLights().setLightOverallStatus("Malo"); // The lights are burned out or very low intensity
            if (lightStatusRev == 0) {
                System.out.println("Luces quemadas. Es necesario reemplazarlas.");
            }
            if (lightIntensityRev > 7) {
                System.out.println("Intensidad de las luces es deficiente.");
            }
        }
        // Evaluate if the lights pass the inspection
        if (car.getCarLights().getLightOverallStatus().equals("Bueno") || car.getCarLights().getLightOverallStatus().equals("Regular")) {
            return true; // Approved
        } else {
            return false; // Not approved
        }
    }
    }
  // Using this feature, the inspector can check the condition and pressure of the tires.
    public boolean checkTireStatus(Car car){
        double tireTreadingRev = car.getCarTire().getTireTreading();
        double tirePresionRev = car.getCarTire().getTirePresion();

        // Evaluate the general condition of the tires
        if (tireTreadingRev >= 1.66 && tirePresionRev >= 30 && tirePresionRev <= 40) {
            car.getCarTire().setTireOverallStatus("Bueno"); // Tires in good condition
            System.out.println("Llantas en buen estado.");
        } else if (tireTreadingRev >= 1.66 && (tirePresionRev < 30 || tirePresionRev > 40)) {
            car.getCarTire().setTireOverallStatus("Regular"); // Functional tires but with pressure outside the optimal range
            System.out.println("Llantas en estado regular. Revise la presión.");
        } else {
            car.getCarTire().setTireOverallStatus("Malo"); // Tires in poor condition
            if (tireTreadingRev < 1.66) {
                System.out.println("Banda de rodadura insuficiente. Es necesario reemplazar las llantas.");
            }
            if (tirePresionRev < 20) {
                System.out.println("Presión extremadamente baja. Infle las llantas inmediatamente.");
            } else if (tirePresionRev > 70) {
                System.out.println("Presión extremadamente alta. Ajuste la presión para evitar daños.");
            }
        }

        if (car.getCarTire().getTireOverallStatus().equals("Bueno") || car.getCarTire().getTireOverallStatus().equals("Regular")) {
            return true; // Approved
        } else {
            return false; // Not approved
        }
    }
}
