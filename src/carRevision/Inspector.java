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
                        System.out.println("Pastillas Regular");
                    }

                    if(brakeHeatingRev > 350)
                    {
                        System.out.println("Calentamiento en rango tolerable");
                        //here we can say that the brakes are overheating a bit but it shouldn't be an issue.
                    }

                }
        } else {
            car.getCarBrakes().setBrakeOverallStatus("Deficiente");
            if ((padsStatusRev < 7) && (padsStatusRev >= 5)) {
                //here we can add in the observations that the driver should  be weary of the brakes status.
                System.out.println("Pastillas Regular");
            } else if (padsStatusRev < 5) {
                System.out.println("Pastillas Deficientes");
                //Here wwe say that the brakes  pads are faulty
            }
            if((brakeHeatingRev > 350) && (brakeHeatingRev <= 600)){
                System.out.println("Calentamiento en rango tolerable");
                //here we can say that the brakes are overheating a bit but it shouldn't be an issue.

            }else if(brakeHeatingRev > 600){
                    System.out.println("Sobrecalentamiento excesivo");
                    //here we say the brakes are overheating over the tolerated range.
                }
            }
        //Once the overall status is set, the following code will set the boolean stauts to true if the brake passes, or false if they don't.
        if(car.getCarBrakes().getBrakeOverallStatus().equals("Bueno") || car.getCarBrakes().getBrakeOverallStatus().equals("Regular"))
        {
            return true;
        } else{
            return false;
        }
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
