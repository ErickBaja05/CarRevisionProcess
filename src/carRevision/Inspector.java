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
//    // Esta funcion permite al inspector revisar la intensidad y el estado de la
//    // cubierta de las luces
//    public boolean checkLightStatus(Car car){
//        int lightIntensityRev = car.getCarLights().getLightIntensity();
//        String coverStatusRev = car.getCarLights().getLightCoverStatus();
//    }
//    // Mediante esta funcion, el inspector puede revisar el estado y presion de las llantas
//    public boolean checkTireStatus(Car car){
//        int tireTreadingRev = car.getTire().getTireTreading();
//        double tirePresion = car.getTire().getTirePresion();
//    }
}
